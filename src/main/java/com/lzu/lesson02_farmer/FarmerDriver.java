package com.lzu.lesson02_farmer;

import java.util.ArrayList;
import java.util.List;


class Cow {
    private int age;

    public Cow born() {
        Cow child = null;
        if (age >= 5) {
            child = new Cow(1);
        }
        return child;
    }

    public Cow(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Farm {
    private static ArrayList<Cow> cows;

    static {
        Cow cow = new Cow(5);
        cows = new ArrayList<>();
        cows.add(cow);
    }

    public static ArrayList<Cow> getCow(int year) {
        for (int i = 0; i < year; i ++) {
            ArrayList<Cow> temp = new ArrayList<>();
            for (Cow cow : cows) {

                cow.setAge(cow.getAge() + 1);
                temp.add(cow);
                Cow born = cow.born();
                //说明可以生小牛
                if (born != null) {
                    temp.add(born);
                }
            }
            cows = temp;
            System.out.println("第"+ (i + 1) +"年有"+ cows.size() +"头牛");
        }
        return Farm.cows;
    }
}

public class FarmerDriver {
    public static void main(String[] args) {
        Farm.getCow(30);
    }
}
