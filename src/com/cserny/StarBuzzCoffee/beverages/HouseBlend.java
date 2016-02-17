package com.cserny.StarBuzzCoffee.beverages;

import com.cserny.StarBuzzCoffee.Beverage;

/**
 * Created by user on 17.02.2016.
 */
public class HouseBlend extends Beverage
{
    public HouseBlend()
    {
        setDescription("House Blend Coffee");
    }

    @Override
    public double cost()
    {
        return .89;
    }
}
