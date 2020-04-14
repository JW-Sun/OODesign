package com.lzu.lesson07_simple_fac_pizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        }

        return pizza;
    }
}
