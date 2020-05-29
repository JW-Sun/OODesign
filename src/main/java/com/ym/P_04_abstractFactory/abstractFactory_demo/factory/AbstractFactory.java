package com.ym.P_04_abstractFactory.abstractFactory_demo.factory;

import com.ym.P_04_abstractFactory.abstractFactory_demo.product.AbstractProduct1;
import com.ym.P_04_abstractFactory.abstractFactory_demo.product.AbstractProduct2;

public interface AbstractFactory {

    AbstractProduct1 createProduct1();

    AbstractProduct2 createProduct2();

}
