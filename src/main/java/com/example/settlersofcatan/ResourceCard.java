package com.example.settlersofcatan;
import javafx.scene.image.Image;

import java.util.ArrayList;

public class ResourceCard {
    private javafx.scene.image.Image resourceImage;
    private String name;
    private Player owner;

    public ResourceCard(String name, Player owner){

        this.name = name;
        this.owner = owner;
        resourceImage = Initialize.resourceCards.get(name);
    }

    public String getType() {
        return name;
    }
    public Image getResourceImage() {
        return resourceImage;
    }
}
