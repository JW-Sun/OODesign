package com.lzu.lesson06_abstract_factory.sprint3_simulate;

import org.jdom.JDOMException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws JDOMException, IOException {

        BeanFactory beanFactory = new ClassPathXmlApplicationContext("src\\main\\resources\\applicationContext-simulate.xml");

        Moveable o = (Moveable) beanFactory.getBean("vehicle");

        o.run();

    }
}
