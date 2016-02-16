package com.cserny.WeatherORama;

import java.util.ArrayList;
import java.util.Observable;

/**
 * Created by user on 16.02.2016.
 */
public class WeatherData extends Observable
{
    private float temperature;
    private float humidity;
    private float pressure;

    public float getTemperature()
    {
        return temperature;
    }

    public float getHumidity()
    {
        return humidity;
    }

    public float getPressure()
    {
        return pressure;
    }

    /**
     * This method gets called
     * whenever the weather measurements
     * have been updated
     */
    public void measurementsChanged()
    {
        super.setChanged();
        super.notifyObservers();
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
