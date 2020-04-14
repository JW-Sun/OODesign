package com.lzu.lesson01_thinkinoo02;


public class Test {
    public static void main(String[] args) {

        Driver driver = new Driver();
        driver.setName("老张");

        Vehicle car = new Car();
        Vehicle plane = new Plane();

        driver.drive(car);
        driver.drive(plane);


    }
}
