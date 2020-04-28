package com.lzu.lesson08_abstractPizzaFactory;

public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void prepare();


    public void bake() {
        System.out.println("Baking for 20 minutes.");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices.");
    }

    public void box() {
        System.out.println("Place the pizza in offical PizzaStore box");
    }

}
