package com.lzu.lesson08_abstractPizzaFactory;

public class Main {
    public static void main(String[] args) {
        PizzaStore p1 = new NYPizzaStore();
        PizzaStore p2 = new ChicagoPizzaStore();

        Pizza pizza = p1.orderPizza("cheese");
        System.out.println("Ethan ordered a " +pizza.getName()+"\n" );

        pizza = p1.orderPizza("clam");
        System.out.println("Ethan ordered a " +pizza.getName()+"\n" );

        pizza = p2.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() );

    }
}
