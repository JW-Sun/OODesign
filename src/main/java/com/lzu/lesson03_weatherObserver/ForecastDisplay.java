package com.lzu.lesson03_weatherObserver;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure;

    @Override
    public void display() {

    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
