package com.example.settlersofcatan;

import javafx.scene.image.Image;

import java.util.ArrayList;

public class Tile {
    private ArrayList<Tile> adjacentTiles;
    private ArrayList<Vertex> adjacentVertices;
    private ArrayList<Edge> adjacentEdges;
    private javafx.scene.image.Image tile;
    private ArrayList<Port> connectedPorts;
    private boolean hasPort;
    private String name;
    private int[] coords;
    private int numberToken;
    private Vertex[] myVertices;
    public Edge[] myEdges;
    private boolean hasRobber;
    private boolean isDesert;

    public Tile(String str, Image img, int[] coords, int token) {
        myVertices = new Vertex[6];
        name = str;
        tile = img;
        hasPort = false;
        this.coords = coords;
        hasRobber = false;
        numberToken = token;
    }

    public Image getImage() {
        return tile;
    }
    public String getName() {return name;}
    public void setVertices(Vertex[] vertices) {
        myVertices = vertices;
    }
    public Vertex[] getVertices() {return myVertices;}
    public void setEdges(Edge[] edges) {
        myEdges = edges;
    }
    public ArrayList<Tile> getAdjacentTiles() {
        return new ArrayList<>();
    }


    public ArrayList<Edge> getAdjacentEdges() {
        return new ArrayList<>();
    }

    public ArrayList<Player> getPlayers() {
        return new ArrayList<>();
    }

    public void setToken(int num) {numberToken = num;}
    public int getToken() {
        return numberToken;
    }

    public boolean getHasRobber() {
        return hasRobber;
    }
    public void setHasRobber(boolean hasRobber) {
        this.hasRobber = hasRobber;
    }

    public int[] getCoords() {
        return coords;
    }
}
