package com.example.settlersofcatan;

import javafx.scene.image.Image;

public class Settlement {
    //private String color;
    private Player player;
    private Image mySettlement;

    public Settlement(Player player)
    {
        this.player = player;
        //this.color = owner.color;
        this.mySettlement = player.mySettlement;

    }
}
