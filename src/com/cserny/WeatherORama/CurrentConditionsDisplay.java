package com.cserny.WeatherORama;

/**
 * Created by user on 16.02.2016.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement
{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure)
    {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display()
    {
        System.out.println("Current conditions: " + temperature + " C degrees and " + humidity + "% humidity");
    }
}
