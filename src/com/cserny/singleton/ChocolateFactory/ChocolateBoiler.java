package com.cserny.singleton.ChocolateFactory;

/**
 * Created by user on 19.02.2016.
 */
public class ChocolateBoiler
{
    private static volatile ChocolateBoiler instance;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler()
    {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance()
    {
        if (instance == null) {
            synchronized (ChocolateBoiler.class) {
                if (instance == null) {
                    instance = new ChocolateBoiler();
                }
            }
        }
        return instance;
    }

    public void fill()
    {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain()
    {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil()
    {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty()
    {
        return empty;
    }

    public boolean isBoiled()
    {
        return boiled;
    }
}
