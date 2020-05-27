package com.yanmo.P_01_strategy.Demo02;

public class DBLog extends LogStrategyTemplate {
    @Override
    public void doLog(String msg) {
        if (msg != null && msg.trim().length() > 5) {
            int a = 1 / 0;
        }

        System.out.println("put "+ msg +" into db");
    }


}
