package com.lzu.lesson04_strategy02;

public class ModelDuck extends Duck {

    public ModelDuck() {

        flyBehavior = new FlyNoWays();
        quackBehavior = new Quack();


    }

    @Override
    public void display() {
        System.out.println("model duck");
    }
}
