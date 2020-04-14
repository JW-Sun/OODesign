package com.lzu.lesson01_thinkinoo02;

public class Car extends Vehicle {

    public void go(Address address) {
        System.out.println("一路向北 " + address.getName());
    }

}
