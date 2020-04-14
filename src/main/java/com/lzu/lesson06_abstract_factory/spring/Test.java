package com.lzu.lesson06_abstract_factory.spring;

import java.io.IOException;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Properties properties = new Properties();
        try {
            properties.load(Test.class.getClassLoader().getResourceAsStream("spring.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String vehicle = properties.getProperty("vehicle");

        Moveable car = (Moveable) Class.forName(vehicle).newInstance();

//        Moveable car = new Car();
        car.run();
    }
}
