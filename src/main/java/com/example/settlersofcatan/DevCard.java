package com.example.settlersofcatan;

import javafx.scene.image.Image;

public class DevCard {
    private String type;
    private Image myImage;
    private boolean isVictory;
    public DevCard(String type, boolean isVictory) {
        this.type = type;
        myImage = Initialize.devCards.get(type);
        this.isVictory = isVictory;
    }
}
