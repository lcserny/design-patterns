package com.cserny.StarBuzzCoffee.beverages;

import com.cserny.StarBuzzCoffee.Beverage;

/**
 * Created by user on 17.02.2016.
 */
public class Espresso extends Beverage
{
    public Espresso()
    {
        setDescription("Espresso");
    }

    @Override
    public double cost()
    {
        return 1.99;
    }
}
