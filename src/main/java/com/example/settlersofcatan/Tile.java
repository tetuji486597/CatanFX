package com.example.settlersofcatan;

import java.util.ArrayList;

public class Tile {
    private ArrayList<Tile> adjacentTiles;
    private ArrayList<Vertex> adjacentVertices;
    private ArrayList<Edge> adjacentEdges;
    private String name;
    private int xCoord, yCoord, zCoord;
    private NumberToken numberToken;
    private boolean hasRobber;

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

    public NumberToken getToken() {
        return numberToken;
    }

    public boolean hasRobber() {
        return false;
    }

    public int getXCoord() { return xCoord;}

    public void setXCoord(int xCoord) {this.xCoord = xCoord;}

    public int getYCoord() { return yCoord;}

    public void setYCoord(int yCoord) {this.yCoord = yCoord;}

    public int getZCoord() { return zCoord;}

    public void setZCoord(int zCoord) {this.zCoord = zCoord;}
}
