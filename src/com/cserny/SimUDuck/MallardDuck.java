package com.cserny.SimUDuck;

/**
 * Created by user on 15.02.2016.
 */
public class MallardDuck extends Duck
{
    public MallardDuck()
    {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display()
    {
        System.out.println("I'm a real MallardDuck");
    }
}
