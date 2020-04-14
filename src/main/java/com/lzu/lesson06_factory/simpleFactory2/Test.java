package com.lzu.lesson06_factory.simpleFactory2;

public class Test {
    public static void main(String[] args) {
        PlaneFactory planeFactory = new PlaneFactory();
        Moveable move = planeFactory.buildPlane();
        move.run();
    }
}
