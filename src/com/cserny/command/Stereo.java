package com.cserny.command;

/**
 * Created by user on 19.02.2016.
 */
public class Stereo
{
    int volume = 0;
    String medium = "not set";
    String name;

    public Stereo(String name)
    {
        this.name = name;
    }

    public void on()
    {
        System.out.println(name + ": Stereo on");
    }

    public void off()
    {
        System.out.println(name + ": Stereo off");
    }

    public void setCD()
    {
        medium = "CD";
        System.out.println(name + ": Stereo set to " + medium);
    }

    public void setDVD()
    {
        medium = "DVD";
        System.out.println(name + ": Stereo set to " + medium);
    }

    public void setRadio()
    {
        medium = "Radio";
        System.out.println(name + ": Stereo set to " + medium);
    }

    public void setVolume(int volume)
    {
        this.volume = volume;
        System.out.println(name + ": Volume of Stereo set to " + this.volume);
    }

    public String getName()
    {
        return name;
    }
}
