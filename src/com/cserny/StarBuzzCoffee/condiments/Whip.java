package com.cserny.StarBuzzCoffee.condiments;

import com.cserny.StarBuzzCoffee.Beverage;
import com.cserny.StarBuzzCoffee.CondimentDecorator;

/**
 * Created by user on 17.02.2016.
 */
public class Whip extends CondimentDecorator
{
    Beverage beverage;

    public Whip(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public String getDescription()
    {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost()
    {
        return .19 + beverage.cost();
    }
}
