package com.cserny.WeatherORama;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by user on 16.02.2016.
 */
public class ForecastDisplay implements Observer, DisplayElement
{
    private ArrayList<String> forecasts = new ArrayList<String>(Arrays.asList(
        "Improving weather on the way!",
        "Watch out for cooler, rainy weather",
        "More of the same"
    ));
    private String currentForecast;
    private Random randomGenerator;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);

        randomGenerator = new Random();
    }

    @Override
    public void update(float temp, float humidity, float pressure)
    {
        currentForecast = forecasts.get(randomGenerator.nextInt(forecasts.size()));
        display();
    }

    @Override
    public void display()
    {
        System.out.println("Forecast: " + currentForecast);
    }
}
