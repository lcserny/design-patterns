package com.cserny.singleton;

/**
 * Created by user on 19.02.2016.
 */
public class MyClassTester
{
    public static void main(String[] args)
    {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1);

        System.out.println(singleton.equals(singleton1));
    }
}
