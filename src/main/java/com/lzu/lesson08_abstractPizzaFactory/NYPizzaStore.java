package com.lzu.lesson08_abstractPizzaFactory;

public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if(type.equals("cheese")){
            pizza = new CheesePizza( ingredientFactory);
            pizza.setName("New York Style cheese pizza");
        }
        else if(type.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style clam pizza");
        }



        return pizza;
    }

}
