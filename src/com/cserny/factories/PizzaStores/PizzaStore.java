package com.cserny.factories.PizzaStores;

import com.cserny.factories.Pizzas.Pizza;

/**
 * Created by user on 18.02.2016.
 */
public abstract class PizzaStore
{
    public Pizza orderPizza(String type)
    {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
