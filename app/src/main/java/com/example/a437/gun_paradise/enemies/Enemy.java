package com.example.a437.gun_paradise.enemies;

/**
 * Created by 437 on 27-Jun-16.
 */
public abstract class Enemy {
    double enIncrement;
    double health;
    double reward;
    double armor; //Armor substracts from every hit, favoring single target damage. Does not affect tap damage.
    double shield;  //the maximum amount of damage you can do with 1 strike. This can be overcome by tapping.

    public Enemy(double enIncrement, double health, double reward, int armor, int shield) {
        this.enIncrement = enIncrement;
        this.health = health;
        this.reward = reward;
        this.armor = armor;
        this.shield = shield;
    }

    public Enemy() {
    }

    public double getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public double getEnIncrement() {
        return enIncrement;
    }

    public void setEnIncrement(double enIncrement) {
        this.enIncrement = enIncrement;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public double getReward() {
        return reward;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }
}
