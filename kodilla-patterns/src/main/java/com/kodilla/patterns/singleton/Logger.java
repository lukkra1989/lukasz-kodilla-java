package com.kodilla.patterns.singleton;

public class Logger {

    private static final Logger INSTANCE = new Logger();
    private String lastLog = "";

    private Logger() {
    }

    public static Logger getInstance() {
        return INSTANCE;
    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}