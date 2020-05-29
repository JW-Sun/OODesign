package com.ym.P_01_strategy.Demo01;

public class Price {

    private Strategy strategy;

    public Price(Strategy strategy) {
        this.strategy = strategy;
    }

    public double quote(double goodsPrice) {
        return this.strategy.calcPrice(goodsPrice);
    }
}
