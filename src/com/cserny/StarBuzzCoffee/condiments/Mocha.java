package com.cserny.StarBuzzCoffee.condiments;

import com.cserny.StarBuzzCoffee.Beverage;
import com.cserny.StarBuzzCoffee.CondimentDecorator;

/**
 * Created by user on 17.02.2016.
 */
public class Mocha extends CondimentDecorator
{
    Beverage beverage;

    public Mocha(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public String getDescription()
    {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost()
    {
        return .20 + beverage.cost();
    }
}
