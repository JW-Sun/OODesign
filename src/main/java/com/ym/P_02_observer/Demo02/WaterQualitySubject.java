package com.ym.P_02_observer.Demo02;

import java.util.ArrayList;
import java.util.List;

public abstract class WaterQualitySubject {

    public List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public abstract int getPolluteLevel();

    public abstract void notifyWatchers();

}
