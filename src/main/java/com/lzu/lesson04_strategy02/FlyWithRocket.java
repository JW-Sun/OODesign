package com.lzu.lesson04_strategy02;

public class FlyWithRocket implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("fly with rocket");
    }
}
