package com.lzu.lesson01_thinkinoo02;

public class Plane extends Vehicle {

    public void go(Address address) {
        System.out.println("开飞机去" + address.getName());
    }

}
