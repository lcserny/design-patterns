package com.cserny.factories.Pizzas;

import java.util.ArrayList;

/**
 * Created by user on 18.02.2016.
 */
public abstract class Pizza
{
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<String>();

    public void prepare()
    {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings...");
        for (String topping : toppings) {
            System.out.println(" " + topping);
        }
    }

    public void bake()
    {
        System.out.println("Bake for 25 min at 180 degrees");
    }

    public void cut()
    {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box()
    {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName()
    {
        return name;
    }
}
