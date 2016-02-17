package com.cserny.StarBuzzCoffee;

/**
 * Created by user on 17.02.2016.
 */
public abstract class Beverage
{
    String description = "unknown description";

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public abstract double cost();
}
