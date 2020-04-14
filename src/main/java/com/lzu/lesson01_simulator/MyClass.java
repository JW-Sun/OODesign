package com.lzu.lesson01_simulator;

public class MyClass {
    public static void main(String[] args) {

        Person parent = new Parent();
        Person grandParent = new GrandParent();

        Child child = new Child(parent, grandParent);


        new Thread(child).start();


    }
}
