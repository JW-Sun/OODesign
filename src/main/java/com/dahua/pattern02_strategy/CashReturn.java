package com.dahua.pattern02_strategy;


/*消费返利的消费实现类*/
public class CashReturn implements CashSuper {

    private double condition = 0d;
    private double moneyReturn = 0d;

    public CashReturn(String condition, String moneyReturn) {
        this.condition = Double.parseDouble(condition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }

    @Override
    public double acceptCash(double money) {

        double res = money;

        if (money > condition) {
            res = money - Math.floor(money / condition) * moneyReturn;
        }

        return res;
    }
}
