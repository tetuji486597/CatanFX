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
    }

    public ArrayList<Vertex> getAdjacentVertices() {
    }

    public ArrayList<Edge> getAdjacentEdges() {
    }

    public ArrayList<Player> getPlayers() {
    }

    public NumberToken getToken() {
    }

    public boolean hasRobber() {
    }

    public int getXCoord() { return xCoord;}

    public int setXCoord(int xCoord) {this.xCoord = xCoord;}

    public int getYCoord() { return yCoord;}

    public int setYCoord(int yCoord) {this.yCoord = yCoord;}

    public int getZCoord() { return zCoord;}

    public int setZCoord(int zCoord) {this.zCoord = zCoord;}
}
