package com.ym.P_02_observer.Demo02;

public class WaterQuality extends WaterQualitySubject {

    // 污染级别 0正常 1轻度污染 2中度污染 3高度污染
    private int polluteLevel = 0;

    @Override
    public int getPolluteLevel() {
        return polluteLevel;
    }

    public void setPolluteLevel(int polluteLevel) {
        this.polluteLevel = polluteLevel;
        this.notifyWatchers();
    }

    @Override
    public void notifyWatchers() {
        for (Observer observer : observers) {
            if (polluteLevel >= 0) {
                if ("检测人员".equals(observer.getJob())) {
                    observer.update(this);
                }
            }
            if (polluteLevel >= 1) {
                if ("预警任务".equals(observer.getJob())) {
                    observer.update(this);
                }
            }
            if (polluteLevel >= 2) {
                if ("领导".equals(observer.getJob())) {
                    observer.update(this);
                }
            }
        }
    }
}
