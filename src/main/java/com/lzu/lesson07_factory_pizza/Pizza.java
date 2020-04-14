package com.lzu.lesson07_factory_pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    List toppings = new ArrayList();


    public void bake() {
        System.out.println("Bake.");
    }

    public void prepare() {
        System.out.println("Prepare. " + name);
        for (Object topping : toppings) {
            System.out.println(" Add topping: " + topping);
        }
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slice.");
    }

    public void box() {
        System.out.println("Box.");
    }
}
