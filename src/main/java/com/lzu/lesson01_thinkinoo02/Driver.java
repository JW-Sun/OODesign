package com.lzu.lesson01_thinkinoo02;

public class Driver {

    private String name;


    public void drive(Vehicle v) {
        v.go(new Address("东北"));
    }






    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
