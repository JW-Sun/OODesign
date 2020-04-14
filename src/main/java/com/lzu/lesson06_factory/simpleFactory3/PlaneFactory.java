package com.lzu.lesson06_factory.simpleFactory3;

public class PlaneFactory extends VehicleFactory {
    @Override
    public Moveable build() {
        return new Plane();
    }
}
