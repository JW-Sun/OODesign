package com.yanmo.P_01_strategy.Demo02;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class LogStrategyTemplate implements LogStrategy {

    @Override
    public void log(String msg) {
        // 给每一个日志消息添加时间
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String s = dateFormat.format(now) + " content: " + msg;

        // 真正的执行日志命令（有点类似与拦截器)
        doLog(s);
    }

    protected abstract void doLog(String s);
}
