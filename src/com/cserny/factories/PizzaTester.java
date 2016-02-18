package com.cserny.factories;

import com.cserny.factories.PizzaStores.ChicagoPizzaStore;
import com.cserny.factories.PizzaStores.NYPizzaStore;
import com.cserny.factories.PizzaStores.PizzaStore;
import com.cserny.factories.Pizzas.Pizza;

/**
 * Created by user on 18.02.2016.
 */
public class PizzaTester
{
    public static void main(String[] args)
    {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza nyPepperoniPizza = nyPizzaStore.orderPizza("pepperoni");
        System.out.println("Ordered a " + nyPepperoniPizza.getName() + "\r\n");

        Pizza chicagoCheesePizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("Ordered a " + chicagoCheesePizza.getName() + "\r\n");
    }
}
