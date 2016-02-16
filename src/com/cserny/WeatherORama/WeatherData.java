package com.cserny.WeatherORama;

import java.util.ArrayList;

/**
 * Created by user on 16.02.2016.
 */
public class WeatherData implements Subject
{
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData()
    {
        observers = new ArrayList<Observer>();
    }

    public void getTemperature()
    {
        System.out.println("Some temperature");
    }

    public void getHumidity()
    {
        System.out.println("Some humidity");
    }

    public void getPressure()
    {
        System.out.println("Some pressure");
    }

    @Override
    public void registerObserver(Observer observer)
    {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer)
    {
        int index = observers.indexOf(observer);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers()
    {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * This method gets called
     * whenever the weather measurements
     * have been updated
     */
    public void measurementsChanged()
    {
        notifyObservers();
    }

    /**
     *
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
