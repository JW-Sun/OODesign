package com.lzu.lesson07_simple_fac_pizza;

public class Main {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();

        //披萨店需要有工厂的引用
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
    }
}
