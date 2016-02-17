package com.cserny.StarBuzzCoffee.beverages;

import com.cserny.StarBuzzCoffee.Beverage;

/**
 * Created by user on 17.02.2016.
 */
public class DarkRoast extends Beverage
{
    public DarkRoast()
    {
        setDescription("Dark Roast Coffee");
    }

    @Override
    public double cost()
    {
        return 1.09;
    }
}
