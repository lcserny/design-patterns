package com.cserny.factories.Pizzas;

import com.cserny.factories.PizzaIngredientFactory;

/**
 * Created by user on 18.02.2016.
 */
public class NYPepperoniPizza extends Pizza
{
    PizzaIngredientFactory ingredientFactory;

    public NYPepperoniPizza(PizzaIngredientFactory ingredientFactory)
    {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare()
    {
        System.out.println("Preparing " + name);

        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();

        toppings.add("Grated Reggiano Cheese");
    }
}
