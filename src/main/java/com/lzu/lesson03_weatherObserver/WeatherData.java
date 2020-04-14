package com.lzu.lesson03_weatherObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

//被观察的
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

//    private List<Observer> observers;

    public WeatherData() {
//        observers = new ArrayList<>();
    }

//    @Override
//    public void registerObserver(Observer observer) {
//        observers.add(observer);
//    }

//    @Override
//    public void removeObserver(Observer observer) {
//        observers.remove(observer);
//    }

//    @Override
//    public void notifyObservers() {
//        for (int i = 0; i < observers.size(); i++) {
//            Observer o = observers.get(i);
//            o.update(temperature, humidity, pressure);
//        }
//    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
