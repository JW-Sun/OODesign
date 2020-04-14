package com.lzu.lesson06_abstract_factory.spring;

public class Car implements Moveable {
    @Override
    public void run() {
        System.out.println("car running...");
    }
}
