package com.cserny.WeatherORama;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.*;
import java.util.Observer;

/**
 * Created by user on 16.02.2016.
 */
public class ForecastDisplay implements Observer, DisplayElement
{
    private String currentForecast;
    private ArrayList<String> forecasts = new ArrayList<String>(Arrays.asList(
        "Improving weather on the way!",
        "Watch out for cooler, rainy weather",
        "More of the same"
    ));

    public ForecastDisplay(Observable weatherData)
    {
        weatherData.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg)
    {
        if (o instanceof WeatherData) {
            currentForecast = forecasts.get(new Random().nextInt(forecasts.size()));
            display();
        }
    }

    @Override
    public void display()
    {
        System.out.println("Forecast: " + currentForecast);
    }
}
