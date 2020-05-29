package com.ym.P_01_strategy.Demo02;

public class LogContext {

    public void log(String msg) {
        LogStrategy logStrategy = new DBLog();

        try {
            logStrategy.log(msg);
        } catch (Exception e) {
            logStrategy = new FileLog();
            logStrategy.log(msg);
        }
    }

}
