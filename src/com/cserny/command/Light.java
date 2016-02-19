package com.cserny.command;

/**
 * Created by user on 19.02.2016.
 */
public class Light
{
    String name;

    public Light(String name)
    {
        this.name = name;
    }

    public void on()
    {
        System.out.println(name + ": Lights on");
    }

    public void off()
    {
        System.out.println(name + ": Lights off");
    }

    public String getName()
    {
        return name;
    }
}
