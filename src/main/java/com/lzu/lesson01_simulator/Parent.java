package com.lzu.lesson01_simulator;

public class Parent extends Person {

    public void feed() {
        System.out.println("喂养小孩");
    }

    public void actionToWakenUpEvent(WakenUpEvent event) {
        System.out.println("父母喂养小孩");
    }

}
