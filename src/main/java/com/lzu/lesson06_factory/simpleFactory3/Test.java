package com.lzu.lesson06_factory.simpleFactory3;

import com.lzu.lesson01_thinkinoo02.Vehicle;

public class Test {
    public static void main(String[] args) {
        VehicleFactory factory = new CarFactory();
        Moveable car = factory.build();
        car.run();
    }
}
