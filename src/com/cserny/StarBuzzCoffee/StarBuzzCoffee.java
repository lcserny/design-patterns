package com.cserny.StarBuzzCoffee;

import com.cserny.StarBuzzCoffee.beverages.DarkRoast;
import com.cserny.StarBuzzCoffee.beverages.Espresso;
import com.cserny.StarBuzzCoffee.beverages.HouseBlend;
import com.cserny.StarBuzzCoffee.condiments.Mocha;
import com.cserny.StarBuzzCoffee.condiments.Soy;
import com.cserny.StarBuzzCoffee.condiments.Whip;

/**
 * Created by user on 17.02.2016.
 */
public class StarBuzzCoffee
{
    public static void main(String[] args)
    {
        Beverage expresso = new Espresso();
        System.out.println(expresso.getDescription() + " cost: " + expresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + " cost: " + darkRoast.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " cost: " + houseBlend.cost());
    }
}
