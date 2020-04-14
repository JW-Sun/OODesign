package com.lzu.lesson04_strategy02;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("can fly with wings");
    }
}
