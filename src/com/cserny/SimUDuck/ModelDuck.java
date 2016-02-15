package com.cserny.SimUDuck;

/**
 * Created by user on 15.02.2016.
 */
public class ModelDuck extends Duck
{
    public ModelDuck()
    {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display()
    {
        System.out.println("I'm a model duck");
    }
}
