package com.lzu.lesson06_factory.simpleFactory3;

public class CarFactory extends VehicleFactory {
    @Override
    public Moveable build() {
        return new Car();
    }
}
