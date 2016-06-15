package com.example.a437.gun_paradise;

/**
 * Created by 437 on 15-Jun-16.
 */
public class Player {

    boolean cheatStatus;
    boolean funMode;
    String playerName;
    double money;

    public boolean isCheatStatus() {
        return cheatStatus;
    }

    public double getMoney() {
        return money;
    }

    public void pay(double price) {
        this.money-=price;
    }

    public void setCheatStatus(boolean cheatStatus) {
        this.cheatStatus = cheatStatus;
        if (cheatStatus = true){setFunMode(true);}
    }

    public boolean isFunMode() {
        return funMode;
    }

    public void setFunMode(boolean funMode) {
        this.funMode = funMode;
    }

    public String getPlayerName() {
        return playerName;
    }

    public Player(boolean cs, String pn, boolean turnTheFunOn){
       cheatStatus = cs;
       playerName = pn;
        funMode = turnTheFunOn;
    }
    public Player(){
        cheatStatus = false;
        playerName = "437";
        funMode = true;
    }

}
