package com.practice.util.jcraft;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

import java.util.Properties;

public class JschSession {

    public static Session createSession() {
        try {
            JSch jsch = new JSch();
            Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");

            Session session = jsch.getSession(System.getProperty("app.user"), System.getProperty("app.host"), 22);
            session.setConfig(config);
            session.connect();

            return session;
        } catch (JSchException e) {
            throw new RuntimeException(e);
        }
    }
}
