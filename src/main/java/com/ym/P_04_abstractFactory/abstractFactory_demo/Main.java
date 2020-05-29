package com.ym.P_04_abstractFactory.abstractFactory_demo;

import com.ym.P_04_abstractFactory.abstractFactory_demo.factory.AbstractFactory;
import com.ym.P_04_abstractFactory.abstractFactory_demo.factory.ConcreteFactory1;

public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new ConcreteFactory1();

        abstractFactory.createProduct1();
        abstractFactory.createProduct2();
    }
}
