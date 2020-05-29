package com.ym.P_02_observer.Demo02;

public class Watcher implements Observer {

    private String job;

    @Override
    public void update(WaterQualitySubject subject) {
        System.out.println(job + " 收到通知，污染你的级别就是：" + subject.getPolluteLevel());
    }

    @Override
    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String getJob() {
        return this.job;
    }
}
