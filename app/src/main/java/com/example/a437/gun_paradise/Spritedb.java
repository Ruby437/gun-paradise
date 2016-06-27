package com.example.a437.gun_paradise;

import java.util.ArrayList;

/**
 * Created by 437 on 27-Jun-16.
 * Spritedb organizes all the sprites in an ArrayList\<Sprite\>
 */
public class Spritedb {
    ArrayList<Sprite> sprites;

    public Spritedb(ArrayList<Sprite> sprites) {
        this.sprites = sprites;
    }

    public ArrayList<Sprite> getSprites() {
        return sprites;
    }
    public Sprite getSprite(int index){
        return this.getSprites().get(index);
    }
}
