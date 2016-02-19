package com.cserny.factories.IngredientFactories;

import com.cserny.factories.Ingredients.*;
import com.cserny.factories.Ingredients.Doughs.ThickCrustDough;
import com.cserny.factories.Ingredients.Pepperonis.RedPepper;
import com.cserny.factories.PizzaIngredientFactory;

/**
 * Created by user on 19.02.2016.
 */
public class ChicagoIngredientFactory implements PizzaIngredientFactory
{
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

    @Override
    public Pepperoni createPepperoni()
    {
        return new RedPepper();
    }

    @Override
    public Clam createClams()
    {
        return new Clam();
    }

    @Override
    public Cheese createCheese()
    {
        return new Cheese();
    }

    @Override
    public Dough createDough()
    {
        return new ThickCrustDough();
    }
}
