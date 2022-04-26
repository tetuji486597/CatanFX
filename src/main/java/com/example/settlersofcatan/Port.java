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
    public void setConnectedVertices() {

    }
}
