package com.practice.util.jcraft;

import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.Session;

import java.io.InputStream;


public class ScriptExecutor {

    /**
     * Utility method to execute a script on a remote Unix machine.
     *
     * @param script to execute
     * @throws Exception
     */
    public static void executeScript(String script) throws Exception {
        Session session = JschSession.createSession();
        ChannelExec channel = (ChannelExec) session.openChannel("exec");
        channel.setCommand(script);
        channel.connect();

        channel.setInputStream(null);
        channel.setErrStream(System.err);

        InputStream in = channel.getInputStream();
        channel.connect();

        byte[] tmp = new byte[1024];
        while (true) {
            while (in.available() > 0) {
                int i = in.read(tmp, 0, 1024);
                if (i < 0) {
                    break;
                }
                System.out.print(new String(tmp, 0, i));
            }
            if (channel.isClosed()) {
                if (in.available() > 0) {
                    continue;
                }

                if (channel.getExitStatus() == 0) {
                    break;
                }
                throw new RuntimeException("Remote script execution return non-zero result. You should probably investigate.");
            }
            Thread.sleep(1000);
        }

        channel.disconnect();
        session.disconnect();
    }

    /**
     * Utility method to give full rights to a file on a remote Unix machine.
     *
     * @param file to give full rights to
     * @throws Exception
     */
    public static void giveFullRights(String file) throws Exception {
        executeScript(String.format("chmod 777 %s", file));
    }
}

