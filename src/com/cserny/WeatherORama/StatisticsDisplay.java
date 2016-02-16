package com.cserny.WeatherORama;

import java.util.*;
import java.util.Observer;

/**
 * Created by user on 16.02.2016.
 */
public class StatisticsDisplay implements Observer, DisplayElement
{
    private float averageTemperature;
    private float minTemperature;
    private float maxTemperature;

    public StatisticsDisplay(Observable weatherData)
    {
        weatherData.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg)
    {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            maxTemperature = weatherData.getTemperature();
            minTemperature = (weatherData.getTemperature() - 2);
            averageTemperature = ((maxTemperature + minTemperature) / 2);
            display();
        }
    }

    @Override
    public void display()
    {
        System.out.println("Average, min and max temperature: " + averageTemperature + "/" + minTemperature + "/" + maxTemperature);
    }
}
