package com.ym.P_02_observer.Demo02;

public class Main {
    public static void main(String[] args) {
        // 主题对象
        WaterQuality waterQuality = new WaterQuality();

        // 创建若干个观察者
        Observer observer1 = new Watcher();
        Observer observer2 = new Watcher();
        Observer observer3 = new Watcher();
        observer1.setJob("检测人员");
        observer2.setJob("预警任务");
        observer3.setJob("领导");

        waterQuality.attach(observer1);
        waterQuality.attach(observer2);
        waterQuality.attach(observer3);

        System.out.println("------水质正常-------");
        waterQuality.setPolluteLevel(0);
        System.out.println("------水质轻度污染-----------");
        waterQuality.setPolluteLevel(1);
        System.out.println("------水质中度污染-----------");
        waterQuality.setPolluteLevel(2);
    }
}
