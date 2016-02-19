package com.cserny.command;

/**
 * Created by user on 19.02.2016.
 */
public class GarageDoor
{
    String name;

    public GarageDoor(String name)
    {
        this.name = name;
    }

    public void open()
    {
        System.out.println(name + ": Opening garage door");
    }

    public void close()
    {
        System.out.println(name + ": Closing garage door");
    }

    public String getName()
    {
        return name;
    }
}
