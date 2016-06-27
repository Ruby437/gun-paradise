package com.example.a437.gun_paradise;

/**
 * Created by 437 on 27-Jun-16.
 * Stage is a class that is the current level the player is on and includes enemies, has a theme and a sprite to be visible to the player.
 */
public class Stage {
    private Theme theme;
    private Sprite sprite;

    public Stage(Theme theme, Sprite sprite) {
        this.theme = theme;
        this.sprite = sprite;
    }

    public Stage(Theme theme) {
        this.theme = theme;
    }

    public Stage() {
        this.theme = Theme.city;
    }
}
