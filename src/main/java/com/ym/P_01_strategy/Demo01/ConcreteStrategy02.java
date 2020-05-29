package com.ym.P_01_strategy.Demo01;

public class ConcreteStrategy02 implements Strategy {
    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("-10%");
        return goodsPrice * 0.9;
    }
}
