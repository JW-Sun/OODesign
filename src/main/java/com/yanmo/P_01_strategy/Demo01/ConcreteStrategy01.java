package com.yanmo.P_01_strategy.Demo01;

public class ConcreteStrategy01 implements Strategy {
    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("新顾客");
        return goodsPrice;
    }
}
