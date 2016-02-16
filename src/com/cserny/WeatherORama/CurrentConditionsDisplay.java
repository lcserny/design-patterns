package com.cserny.WeatherORama;

import java.util.*;
import java.util.Observer;

/**
 * Created by user on 16.02.2016.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement
{
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable weatherData)
    {
        weatherData.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg)
    {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            temperature = weatherData.getTemperature();
            humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display()
    {
        System.out.println("Current conditions: " + temperature + " C degrees and " + humidity + "% humidity");
    }
}
