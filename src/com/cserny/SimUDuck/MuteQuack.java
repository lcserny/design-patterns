package com.cserny.SimUDuck;

/**
 * Created by user on 15.02.2016.
 */
public class MuteQuack implements QuackBehavior
{
    public void quack()
    {
        System.out.println("<< Silence >>");
    }
}
