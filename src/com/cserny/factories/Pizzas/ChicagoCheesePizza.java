package com.cserny.factories.Pizzas;

/**
 * Created by user on 18.02.2016.
 */
public class ChicagoCheesePizza extends Pizza
{
    public ChicagoCheesePizza()
    {
        name = "Chicago Style Deep Dish Cheese Pizza ";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut()
    {
        System.out.println("Cutting the pizza into square slices");
    }
}
