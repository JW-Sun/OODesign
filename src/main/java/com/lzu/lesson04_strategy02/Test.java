package com.lzu.lesson04_strategy02;

public class Test {
    public static void main(String[] args) {
        Duck duck = new SubDuck();

        duck.performFly();
        duck.performQuack();


        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        //关键使用setter方法进行改变赋值
        model.setFlyBehavior(new FlyWithRocket());
        model.performFly();

    }
}
