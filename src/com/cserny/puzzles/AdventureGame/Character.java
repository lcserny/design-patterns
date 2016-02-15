package com.cserny.puzzles.AdventureGame;

/**
 * Created by user on 15.02.2016.
 */
public abstract class Character
{
    WeaponBehavior weaponBehavior;

    public abstract void fight();

    public void setWeapon(WeaponBehavior weapon)
    {
        weaponBehavior = weapon;
    }
}
