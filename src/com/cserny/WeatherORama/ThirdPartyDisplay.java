package com.cserny.WeatherORama;

/**
 * Created by user on 16.02.2016.
 */
public class ThirdPartyDisplay implements Observer, DisplayElement
{
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public ThirdPartyDisplay(Subject weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure)
    {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display()
    {
        System.out.println("Display something else based on measurements");
    }
}
