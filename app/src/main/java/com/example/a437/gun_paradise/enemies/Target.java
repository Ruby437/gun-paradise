package com.example.a437.gun_paradise.enemies;

/**
 * Created by 437 on 27-Jun-16.
 */
public class Target extends Enemy{
    public Target(double enIncrement, double health, double reward) {
        super(enIncrement, health, reward, 0, 0);
    }
    public static Target generateTarget (double enIncrement){
        return new Target(enIncrement, Math.ceil(1*(2+enIncrement)), Math.ceil(1*(1+enIncrement)));
    }
}
