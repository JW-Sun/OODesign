package com.lzu.lesson07_factory_pizza;

public class NewYorkPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new NewYorkCheesePizza();
        } else if (type.equals("greek")) {
            pizza = new NewYorkGreekPizza();
        } else if (type.equals("clam")) {
            pizza = new NewYorkClamPizza();
        }

        return pizza;
    }
}
