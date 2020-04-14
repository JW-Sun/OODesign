package com.lzu.lesson06_factory.simpleFactory;

public class Car {

    private static Car car = null;

    private Car() {
    }

    public static Car getInstance() {
        car = new Car();
        return car;
    }

    public void run() {
        System.out.println("running car");
    }
}
