package com.cserny.factories.Pizzas;

import com.cserny.factories.Ingredients.*;

import java.util.ArrayList;

/**
 * Created by user on 18.02.2016.
 */
public abstract class Pizza
{
    String name;
    Dough dough;
    Sauce sauce;
    Veggie[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clam clam;
    ArrayList<String> toppings = new ArrayList<String>();

    public abstract void prepare();

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

    public void setName(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return "";
    }
}
