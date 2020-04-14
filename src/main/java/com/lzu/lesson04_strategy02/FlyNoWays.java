package com.lzu.lesson04_strategy02;

public class FlyNoWays implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("can not fly");
    }
}
