package com.lzu.lesson02_wakenup_observer;

import java.util.ArrayList;
import java.util.List;

class Child implements Runnable {
    private boolean wakeUp = false;

    /*观察者模式的核心就是运用多态
     * 先创建一个时间监听观察的接口WakenUpListener ，里面写事件的接口
     * 然后创建Dad，GrandPa等具体实现观察功能的实现类
     * 加入线程中所维护的wakenUpListeners
     * 在时间到达之后就开始遍历维护的wakenUpListeners，取出其中的每一个实现类，
     * 运用多态的特性输出响应内容*/
    private List<WakenUpListener> wakenUpListeners = new ArrayList<>();

    public void addWakenUpListener(WakenUpListener listener) {
        wakenUpListeners.add(listener);
    }

    public void wakeUp() {
        WakenUpEvent wakenUpEvent = new WakenUpEvent(System.currentTimeMillis(), "bed", this);

        wakeUp = true;
        for (int i = 0; i < wakenUpListeners.size(); i ++) {
            WakenUpListener listener = wakenUpListeners.get(i);
            listener.actionToWakenUp(wakenUpEvent);
        }
    }

    @Override
    public void run() {
        System.out.println("2s后醒");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wakeUp();
    }
}

class Dad implements WakenUpListener {

    @Override
    public void actionToWakenUp(WakenUpEvent wakenUpEvent) {
        System.out.println("dad feed");
    }
}

class GrandPa implements WakenUpListener {
    public void actionToWakenUp(WakenUpEvent event) {
        System.out.println("grandpa hug child");
    }
}


public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        Dad dad = new Dad();
        GrandPa grandPa = new GrandPa();

        child.addWakenUpListener(dad);
        child.addWakenUpListener(grandPa);

        new Thread(child).start();


    }
}
