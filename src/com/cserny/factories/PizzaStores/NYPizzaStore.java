package com.cserny.factories.PizzaStores;

import com.cserny.factories.IngredientFactories.NYIngredientFactory;
import com.cserny.factories.PizzaIngredientFactory;
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
        PizzaIngredientFactory ingredientFactory = new NYIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("Cheese Pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new NYPepperoniPizza(ingredientFactory);
            pizza.setName("NY Style Pepperoni Pizza");
        }

        return pizza;
    }
}
