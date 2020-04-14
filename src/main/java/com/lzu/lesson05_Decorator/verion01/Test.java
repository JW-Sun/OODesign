package com.lzu.lesson05_Decorator.verion01;

public class Test {
    public static void main(String[] args) {

        Beverage beverage = new DarkRoast();
        beverage.setMilk(true);
        beverage.setSoy(true);

        double cost = beverage.cost();

        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());

    }
}
