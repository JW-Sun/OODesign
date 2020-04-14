package com.lzu.lesson07_factory_pizza;


public class NewYorkCheesePizza extends Pizza {
    public NewYorkCheesePizza() {
        name = "NeYork cheese pizza";
        dough = "ny cheese dough";
        sauce = "ny cheese sauce";
        toppings.add("ny cheese topping");
    }

    @Override
    public void cut() {
        System.out.println("cutting ny cheese pizza");
    }
}
