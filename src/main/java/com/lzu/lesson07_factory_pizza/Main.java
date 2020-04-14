package com.lzu.lesson07_factory_pizza;

public class Main {
    public static void main(String[] args) {
        PizzaStore ny = new NewYorkPizzaStore();

        PizzaStore dc = new DCPizzaStore();

        Pizza nyCheese = ny.orderPizza("cheese");
        System.out.println("A ordered a " + nyCheese.name);

        System.out.println();

        Pizza dcCheese = dc.orderPizza("cheese");
        System.out.println("B ordered a " + dcCheese.name);
    }
}
