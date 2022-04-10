package com.example.settlersofcatan;

import javafx.scene.image.Image;

import java.util.ArrayList;

public class Tile {
    private ArrayList<Tile> adjacentTiles;
    private ArrayList<Vertex> adjacentVertices;
    private ArrayList<Edge> adjacentEdges;
    private javafx.scene.image.Image tile;
    private String name;
    private int[] coords;
    private int numberToken;
    private boolean hasRobber;
    private boolean isDesert;

    public Tile(String str, Image img, int[] coords, int token) {
        name = str;
        tile = img;
        this.coords = coords;
        hasRobber = false;
        numberToken = token;
    }
    public ArrayList<Tile> getAdjacentTiles() {
        return new ArrayList<>();
    }

    public ArrayList<Vertex> getAdjacentVertices() {
        return new ArrayList<>();
    }

    public ArrayList<Edge> getAdjacentEdges() {
        return new ArrayList<>();
    }

    public ArrayList<Player> getPlayers() {
        return new ArrayList<>();
    }

    public int getToken() {
        return numberToken;
    }

    public boolean hasRobber() {
        return false;
    }

    public int[] getCoords() {
        return coords;
    }
}
