package com.lzu.lesson08_abstractPizzaFactory;


public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoIngredientFactory();

        if(type.equals("cheese")){
            pizza = new CheesePizza( ingredientFactory);
            pizza.setName("Chicago Style cheese pizza");
        }
        else if(type.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style clam pizza");
        }



        return pizza;
    }

}
