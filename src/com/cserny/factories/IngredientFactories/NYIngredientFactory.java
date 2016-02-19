package com.cserny.factories.IngredientFactories;

import com.cserny.factories.Ingredients.*;
import com.cserny.factories.Ingredients.Cheeses.RegiannoCheese;
import com.cserny.factories.PizzaIngredientFactory;

/**
 * Created by user on 19.02.2016.
 */
public class NYIngredientFactory implements PizzaIngredientFactory
{
    @Override
    public Dough createDough()
    {
        return new Dough();
    }

    @Override
    public Cheese createCheese()
    {
        return new RegiannoCheese();
    }

    @Override
    public Clam createClams()
    {
        return new Clam();
    }

    @Override
    public Pepperoni createPepperoni()
    {
        return new Pepperoni();
    }

    @Override
    public Sauce createSauce()
    {
        return new Sauce();
    }

    @Override
    public Veggie[] createVeggies()
    {
        return new Veggie[0];
    }
}
