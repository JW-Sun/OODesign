package com.lzu.lesson01_thinkinoo;

public class Driver {

    private String name;

    public void drive(Car car) {
        car.go(new Address("东北"));
    }

    public void drive(Car car, String addr) {
        car.go(new Address(addr));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
