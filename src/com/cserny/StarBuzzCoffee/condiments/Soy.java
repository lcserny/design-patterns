package com.cserny.StarBuzzCoffee.condiments;

import com.cserny.StarBuzzCoffee.Beverage;
import com.cserny.StarBuzzCoffee.CondimentDecorator;

/**
 * Created by user on 17.02.2016.
 */
public class Soy extends CondimentDecorator
{
    Beverage beverage;

    public Soy(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public String getDescription()
    {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost()
    {
        return .15 + beverage.cost();
    }
}
