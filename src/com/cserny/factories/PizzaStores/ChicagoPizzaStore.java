package com.cserny.factories.PizzaStores;

import com.cserny.factories.Pizzas.ChicagoCheesePizza;
import com.cserny.factories.Pizzas.PepperoniPizza;
import com.cserny.factories.Pizzas.Pizza;

/**
 * Created by user on 18.02.2016.
 */
public class ChicagoPizzaStore extends PizzaStore
{
    @Override
    public Pizza createPizza(String type)
    {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new ChicagoCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }

        return pizza;
    }
}
