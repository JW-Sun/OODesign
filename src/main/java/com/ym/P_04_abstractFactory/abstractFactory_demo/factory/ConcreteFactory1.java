package com.ym.P_04_abstractFactory.abstractFactory_demo.factory;

import com.ym.P_04_abstractFactory.abstractFactory_demo.product.AbstractProduct1;
import com.ym.P_04_abstractFactory.abstractFactory_demo.product.AbstractProduct2;
import com.ym.P_04_abstractFactory.abstractFactory_demo.product.impl.Product1_1;
import com.ym.P_04_abstractFactory.abstractFactory_demo.product.impl.Product2_1;

public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public AbstractProduct1 createProduct1() {
        return new Product1_1();
    }

    @Override
    public AbstractProduct2 createProduct2() {
        return new Product2_1();
    }
}
