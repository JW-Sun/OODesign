package com.lzu.lesson06_abstract_factory.spring2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");

        Moveable car = (Moveable) factory.getBean("vehicle");

        car.run();

    }
}
