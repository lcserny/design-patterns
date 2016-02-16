package com.cserny.WeatherORama;

/**
 * Created by user on 16.02.2016.
 */
public interface Subject
{
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
