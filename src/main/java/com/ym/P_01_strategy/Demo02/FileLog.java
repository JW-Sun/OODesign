package com.ym.P_01_strategy.Demo02;

public class FileLog extends LogStrategyTemplate {
    @Override
    public void doLog(String msg) {
        System.out.println("put "+ msg +" into file");
    }
}
