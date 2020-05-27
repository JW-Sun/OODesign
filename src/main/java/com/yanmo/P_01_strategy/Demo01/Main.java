package com.yanmo.P_01_strategy.Demo01;

public class Main {
    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategy02();

        Price price = new Price(strategy);

        double quote = price.quote(123);
        System.out.println(quote);
    }
}
