package com.lzu.lesson04_strategy02;

public class SubDuck extends Duck {

    public SubDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("real subduck");
    }
}
