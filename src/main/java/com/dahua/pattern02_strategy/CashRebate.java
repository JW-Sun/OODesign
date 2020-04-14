package com.dahua.pattern02_strategy;

/*带有打折行为的消费实现类*/
public class CashRebate implements CashSuper {

    private double moneyRebate = 1d;

    public CashRebate(String moneyRebate) {
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
