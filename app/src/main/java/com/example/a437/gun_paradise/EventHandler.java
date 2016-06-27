package com.example.a437.gun_paradise;

import android.os.Parcel;
import android.os.Parcelable;

import com.example.a437.gun_paradise.enemies.*;

/**
 * Created by 437 on 21-Jun-16.
 * EventHandler to do all actions during application runtime.
 */
public class EventHandler implements Parcelable{
    int taps;

    protected EventHandler(Parcel in) {
        taps = in.readInt();
    }
public Enemy generateEnemy(Enemytype enType, double enIncrement){
    switch (enType) {
        case Target: return new Target(enIncrement, Math.ceil(1*(2+enIncrement)), Math.ceil(1*(1+enIncrement))); //no armor, no shield
        default: return new Target (0.0,1.0,1.0);
    }
}
    public static final Creator<EventHandler> CREATOR = new Creator<EventHandler>() {
        @Override
        public EventHandler createFromParcel(Parcel in) {
            return new EventHandler(in);
        }

        @Override
        public EventHandler[] newArray(int size) {
            return new EventHandler[size];
        }
    };

    public int getTaps() {
        return taps;
    }

    public void tap (int count) {
       for (int i = count; i>0;i--){
           tap();
           //todo statistics

       }
    }
    public void tap () {this.taps++;}

    public EventHandler(int taps) {
        this.taps = taps;
    }

    @Override
    public int describeContents() {
        return getTaps();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(taps);
    }
}
