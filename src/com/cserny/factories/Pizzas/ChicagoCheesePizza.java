package com.cserny.factories.Pizzas;

import com.cserny.factories.IngredientFactories.ChicagoIngredientFactory;
import com.cserny.factories.PizzaIngredientFactory;

/**
 * Created by user on 18.02.2016.
 */
public class ChicagoCheesePizza extends Pizza
{
    PizzaIngredientFactory ingredientFactory;

    public ChicagoCheesePizza(PizzaIngredientFactory ingredientFactory)
    {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare()
    {
        System.out.println("Preparing " + name);

        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut()
    {
        System.out.println("Cutting the pizza into square slices");
    }
}
