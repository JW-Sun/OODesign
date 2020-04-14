package com.lzu.lesson07_factory_pizza;

public class DCCheesePizza extends Pizza {
    public DCCheesePizza() {
        name = "dc cheese pizza";
        dough = "dc cheese dough";
        sauce = "dc cheese sauce";
        toppings.add("dc cheese topping");
    }

    @Override
    public void cut() {
        System.out.println("cutting dc cheese pizza");
    }
}
