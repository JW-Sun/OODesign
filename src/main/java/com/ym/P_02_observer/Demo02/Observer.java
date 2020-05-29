package com.ym.P_02_observer.Demo02;

public interface Observer {

    void update(WaterQualitySubject subject);

    // 观察人员的职务
    void setJob(String job);

    String getJob();

}
