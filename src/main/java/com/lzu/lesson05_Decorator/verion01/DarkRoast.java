package com.lzu.lesson05_Decorator.verion01;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark";
    }

    @Override
    public double cost() {
        return 2.1d + super.cost();
    }
}
