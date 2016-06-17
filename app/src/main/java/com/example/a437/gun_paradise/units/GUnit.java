package com.example.a437.gun_paradise.units;

import com.example.a437.gun_paradise.Player;

/**
 * Created by 437 on 15-Jun-16.
 */
public abstract class GUnit {

    private GUnitDamage dmg;
    private GUnitPrice price;
    private int unitID;
    private int count;
    private String unitName;

    public GUnitDamage getDmg() {
        return dmg;
    }

    public GUnitPrice getPrice() {
        return price;
    }

    public int getUnitID() {
        return unitID;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitname(String unitname) {
        this.unitName = unitname;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean buy(Player p){
        double cPrice = this.getPrice().getCurrentPrice();
    if (p.getMoney()>=cPrice){
        p.pay(cPrice);
        this.getPrice().increment();
        this.setCount(this.getCount()+1);
            return true;
    }
        else {
            return false;
        }
    }



    protected GUnit(GUnitDamage dmg, GUnitPrice price, int unitID, int count, String unitname) {
        this.dmg = dmg;
        this.price = price;
        this.unitID = unitID;
        this.count = count;
        this.unitName = unitname;
    }
}
