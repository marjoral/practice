package com.practice.util.jcraft;

import java.io.*;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.Session;


public class FileManager {

    /**
     * Utility method to upload a local file to a remote Unix machine using SCP
     *
     * @param localFile File to be uploaded
     * @param remoteFile file destination on remote
     * @throws Exception
     */
    public static void copyLocalToRemoteUsingSCP(String localFile, String remoteFile) throws Exception {
        Session session = JschSession.createSession();
        String command = "scp -t " + remoteFile;
        Channel channel = session.openChannel("exec");
        ((ChannelExec) channel).setCommand(command);

        InputStream input = channel.getInputStream();
        channel.connect();

        checkAck(input);

        File local = new File(localFile);
        long fileSize = local.length();

        String fullCommand = String.format("C0644 %d %s\n", fileSize, localFile);
        OutputStream output = channel.getOutputStream();
        output.write(fullCommand.getBytes());
        output.flush();

        checkAck(input);

        sendFile(localFile, input, output);

        channel.disconnect();
        session.disconnect();
    }

    /**
     * Utility method to upload a local file to a remote Unix machine using SFTP
     *
     * @param localFile to be uploaded
     * @param remoteFile file destination on remote
     * @throws Exception
     */
    public static void copyLocalToRemoteUsingSFTP(String localFile, String remoteFile) throws Exception {
        Session session = JschSession.createSession();
        ChannelSftp sftpChannel = (ChannelSftp) session.openChannel("sftp");
        sftpChannel.connect();

        sftpChannel.put(localFile, remoteFile);

        sftpChannel.disconnect();
        session.disconnect();
    }

    /**
     * Utility method to download a remote file from a Unix machine using SFTP
     * File will be downloaded to user.dir using the file name on the remote
     *
     * @param remoteDirectory directory where file exists on remote
     * @param remoteFile file to download
     * @throws Exception
     */
    public static void copyRemoteToLocalUsingSFTP(String remoteDirectory, String remoteFile) throws Exception {
        Session session = JschSession.createSession();
        ChannelSftp sftpChannel = (ChannelSftp) session.openChannel("sftp");
        sftpChannel.connect();

        sftpChannel.cd(remoteDirectory);
        sftpChannel.get(remoteFile, remoteFile);

        sftpChannel.disconnect();
        session.disconnect();
    }

    private static void sendFile(String localFile, InputStream input, OutputStream output) {
        try (FileInputStream fileInputStream = new FileInputStream(localFile)) {
            byte[] buffer = new byte[1024];
            while (true) {
                int len = fileInputStream.read(buffer, 0, buffer.length);
                if (len <= 0) {
                    break;
                }
                output.write(buffer, 0, len);
            }

            buffer[0] = 0;
            output.write(buffer, 0, 1);
            output.flush();

            checkAck(input);
            output.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static int checkAck(InputStream in) throws IOException {
        int b = in.read();
        if (b == 0) {
            return b; // Success
        }

        throw new RuntimeException("Something went wrong uploading file");
    }

}
