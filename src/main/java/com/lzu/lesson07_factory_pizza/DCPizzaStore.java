package com.lzu.lesson07_factory_pizza;

public class DCPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new DCCheesePizza();
        } else if (type.equals("greek")) {
            pizza = new DCGreekPizza();
        } else if (type.equals("clam")) {
            pizza = new DCClamPizza();
        }

        return pizza;
    }
}
