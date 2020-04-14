package com.lzu.lesson04_strategy02;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("real quack");
    }
}
