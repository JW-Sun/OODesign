package com.dahua.pattern02_strategy;

public class User {

    CashSuper cashSuper = null;

    public User(String type) {
        switch (type) {
            case "正常收费":
                cashSuper = new CashNormal();
                break;

            case "满300反100":
                cashSuper = new CashReturn("300", "100");
                break;

            case "打8折":
                cashSuper = new CashRebate("0.8");
                break;
        }
    }

    public double getCashResult(double money) {
        return cashSuper.acceptCash(money);
    }
}
