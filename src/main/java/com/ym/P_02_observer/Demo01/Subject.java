package com.ym.P_02_observer.Demo01;

import java.util.ArrayList;
import java.util.List;

/* 被观察者 */
public class Subject {

    private List<Observer> readers = new ArrayList<>();

    public void attach(Observer reader) {
        readers.add(reader);
    }

    public void detach(Observer observer) {
        readers.remove(observer);
    }

    protected void notifyObservers() {
        for (Observer reader : readers) {
            reader.update(this);
        }
    }

    public static void main(String[] args) {


    }
}
