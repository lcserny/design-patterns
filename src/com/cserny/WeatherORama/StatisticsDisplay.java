package com.cserny.WeatherORama;

/**
 * Created by user on 16.02.2016.
 */
public class StatisticsDisplay implements Observer, DisplayElement
{
    private float averageTemperature;
    private float minTemperature;
    private float maxTemperature;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure)
    {
        maxTemperature = temp;
        minTemperature = (temp - 2);
        averageTemperature = ((maxTemperature + minTemperature) / 2);
        display();
    }

    @Override
    public void display()
    {
        System.out.println("Average, min and max temperature: " + averageTemperature + "/" + minTemperature + "/" + maxTemperature);
    }
}
