package com.example.settlersofcatan;

import javafx.scene.image.Image;

public class DevCard {
    private String type;
    private Image myImage;
    private boolean isVictory;
    private boolean justBought;
    public DevCard(String type, boolean isVictory) {
        this.type = type;
        justBought = true;
        myImage = Initialize.devCards.get(type);
        this.isVictory = isVictory;
    }
    public String getType() {
        return type;
    }
    public Image getImage() {
        return myImage;
    }
    public boolean getIsVictory() {
        return isVictory;
    }

    public boolean isJustBought() {
        return justBought;
    }

    public void setJustBought(boolean justBought) {
        this.justBought = justBought;
    }
}
