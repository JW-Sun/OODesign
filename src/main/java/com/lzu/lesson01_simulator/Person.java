package com.lzu.lesson01_simulator;

public abstract class Person {

    public static int parentId = 1;

    /***
     * 唤醒需要做的动作
     */
    public abstract void actionToWakenUpEvent(WakenUpEvent event);

}
