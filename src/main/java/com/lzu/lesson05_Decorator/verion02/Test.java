package com.lzu.lesson05_Decorator.verion02;

public class Test {
    public static void main(String[] args) {

        Beverage beverage = new DarkRoast();
        System.out.println("无调料 " + beverage.getDescription()
                + " " + beverage.cost());

        //设置杯子大小
        beverage.setSize(Beverage.TAIL);

        //用摩卡来装饰Dark
        Beverage beverage2 = new Mocha(beverage);

        //如果要加什么配料就进行更多的装饰
        beverage2 = new Mocha(beverage2);
        System.out.println("加摩卡 " + beverage2.getDescription()
                + " " + beverage2.cost());
    }
}
