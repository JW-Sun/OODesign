package com.lzu.lesson05_Decorator.verion02;


/*调料*/
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double res = 0d;
        if (getSize() == Beverage.TAIL) {
            res += 0.1d;
        } else if (getSize() == Beverage.GRNAD) {
            res += 0.15d;
        } else if (getSize() == Beverage.VENTI) {
            res += 0.2d;
        }
        return beverage.cost() + res;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " +Mocha ";
    }

    @Override
    public int getSize() {
        return beverage.getSize();
    }
}
