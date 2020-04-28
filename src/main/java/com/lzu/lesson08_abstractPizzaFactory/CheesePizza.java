package com.lzu.lesson08_abstractPizzaFactory;

public class CheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;


    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        super();
        this.ingredientFactory = ingredientFactory;
    }


    @Override
    public void prepare() {
        System.out.println("Preparing  " +name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();

    }

}
