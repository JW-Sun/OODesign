package com.lzu.lesson03_weatherObserver;

import java.util.Observable;
import java.util.Observer;

//观察者
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;

    private Observable weatherData;

    public CurrentConditionDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions = " + temperature + " " + humidity);
    }


    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData w = (WeatherData) o;
            this.temperature = w.getTemperature();
            this.humidity = w.getHumidity();
            display();
        }
    }
}
