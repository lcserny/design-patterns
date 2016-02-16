package com.cserny.WeatherORama;

/**
 * Created by user on 16.02.2016.
 */
public interface Observer
{
    void update(float temp, float humidity, float pressure);
}
