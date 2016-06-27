package com.example.a437.gun_paradise.enemies;

/**
 * Created by 437 on 27-Jun-16.
 * Default implementation of enemy, no armor, no shield.
 */
public class Target extends Enemy{
    public Target(double enIncrement, double health, double reward) {
        super(enIncrement, health, reward, 0, 0);
    }
}
