package com.lzu.lesson05_Decorator.verion01;

public class Beverage {

    public String getDescription() {
        return description;
    }

    String description = "Unkown description";

    private double milkCost = 0.9d;
    private double soyCost = 0.5d;
    private boolean milk, soy;

    public boolean hasMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean hasSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public double cost() {
        double res = 0d;
        if (hasMilk()) {
            description += " Milk ";
            res += milkCost;
        }
        if (hasSoy()) {
            description += " Soy ";
            res += soyCost;
        }
        return res;
    }





}
