package com.example.settlersofcatan;

import javafx.scene.image.Image;

import java.util.ArrayList;

public class Port {
    private javafx.scene.image.Image port;
    private ArrayList<Vertex> connectedVertices;
    private String name;
    public Port(String name, Image image) {
        this.name = name;
        port = image;
    }
    public Image getImage() {
        return port;
    }
    public String getType() {
        return name;
    }
    public String getResource() {
        switch(name) {
            case "BrickPort":
                return "Brick";
            case "OrePort":
                return "Ore";
            case "GrainPort":
                return "Grain";
            case "WoodPort":
                return "Wood";
            case "WoolPort":
                return "Wool";
            case "UnknownPort":
                return "ANY";
        }
        return "amogus";
    }

    public void setConnectedVertices() {

    }
}
