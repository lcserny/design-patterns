package com.cserny.factories.PizzaStores;

import com.cserny.factories.IngredientFactories.ChicagoIngredientFactory;
import com.cserny.factories.PizzaIngredientFactory;
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
        PizzaIngredientFactory ingredientFactory = new ChicagoIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new ChicagoCheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Deep Dish Cheese Pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
            pizza.setName("Pepperoni Pizza");
        }

        return pizza;
    }
}
