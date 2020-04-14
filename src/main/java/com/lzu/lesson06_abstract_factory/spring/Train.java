package com.lzu.lesson06_abstract_factory.spring;

public class Train implements Moveable {
    @Override
    public void run() {
        System.out.println("train running...");
    }
}
