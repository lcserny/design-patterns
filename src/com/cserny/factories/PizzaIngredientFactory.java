package com.cserny.factories;

import com.cserny.factories.Ingredients.*;

/**
 * Created by user on 19.02.2016.
 */
public interface PizzaIngredientFactory
{
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggie[] createVeggies();
    Pepperoni createPepperoni();
    Clam createClams();
}
