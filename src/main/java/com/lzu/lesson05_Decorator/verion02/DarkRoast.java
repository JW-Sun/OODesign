package com.lzu.lesson05_Decorator.verion02;

//一个基础咖啡
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark-Coffee";
    }

    @Override
    public double cost() {
        return 1d;
    }
}
