package com.cserny.SimUDuck;

/**
 * Created by user on 15.02.2016.
 */
public class DuckCall implements QuackBehavior
{
    Quack quack = new Quack();

    public void quack()
    {
        quack.quack();
    }
}
