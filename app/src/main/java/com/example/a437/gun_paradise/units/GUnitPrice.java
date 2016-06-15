package com.example.a437.gun_paradise.units;

/**
 * Created by 437 on 15-Jun-16.
 */
public class GUnitPrice {
    private final double basePrice;
    private double increment;
    private double currentPrice;

    public GUnitPrice(){
        basePrice = 1;
        increment = 1;
        currentPrice = basePrice;
    }
    public GUnitPrice(GUnit u){
        switch(u.getUnitID()){
            case 1: basePrice = constants.noob_sPrice;
                break;
            default: basePrice = 2147483647;

        }
    }

    public double getIncrement() {
        return increment;
    }

    public void setIncrement(double increment) {
        this.increment = increment;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getBasePrice() {
        return basePrice;
    }
    public void increment(){
        setCurrentPrice(getCurrentPrice()*(1+getIncrement()));
    }
}
