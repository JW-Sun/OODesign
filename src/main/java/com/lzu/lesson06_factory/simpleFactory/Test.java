package com.lzu.lesson06_factory.simpleFactory;

public class Test {
    public static void main(String[] args) {
        Car car = Car.getInstance();
        Car car2 = Car.getInstance();
        System.out.println(car == car2);
        car.run();
    }
}
