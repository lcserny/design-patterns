package com.cserny.factories.PizzaStores;

import com.cserny.factories.Pizzas.CheesePizza;
import com.cserny.factories.Pizzas.NYPepperoniPizza;
import com.cserny.factories.Pizzas.Pizza;

/**
 * Created by user on 18.02.2016.
 */
public class NYPizzaStore extends PizzaStore
{
    @Override
    public Pizza createPizza(String type)
    {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NYPepperoniPizza();
        }

        return pizza;
    }
}
