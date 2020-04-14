package com.dahua.pattern02_strategy;

/*正常收费行为子类*/
public class CashNormal implements CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
