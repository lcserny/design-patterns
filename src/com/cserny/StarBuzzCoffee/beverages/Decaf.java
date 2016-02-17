package com.cserny.StarBuzzCoffee.beverages;

import com.cserny.StarBuzzCoffee.Beverage;

/**
 * Created by user on 17.02.2016.
 */
public class Decaf extends Beverage
{
    public Decaf()
    {
        setDescription("Decaf Coffee");
    }

    @Override
    public double cost()
    {
        return .69;
    }
}
