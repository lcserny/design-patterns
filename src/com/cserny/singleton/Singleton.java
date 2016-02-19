package com.cserny.singleton;

/**
 * Created by user on 19.02.2016.
 */
public class Singleton
{
    private static Singleton instance;

    private Singleton() { }

    public static Singleton getInstance()
    {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
