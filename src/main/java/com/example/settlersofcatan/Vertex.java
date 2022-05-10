package com.example.settlersofcatan;

import java.util.ArrayList;

public class Vertex {
    private Tile referenceHex;

    private boolean hasBridgeToPort;
    private int boardIndex;
    private int playerIndex;
    private Tile[] myTiles;
    private javafx.scene.shape.Rectangle myRect;
    private ArrayList<Vertex> adjacentVertices;
    private ArrayList<Edge> adjacentEdges;
    private ArrayList<Tile> adjacentTiles;
    private boolean isCity;
    private Port myPort;
    private boolean hasPort;

    public Vertex(int index) {
        playerIndex = -1;
        myPort = null;
        hasPort = false;
        isCity = false;
        adjacentVertices = new ArrayList<>();
        adjacentEdges = new ArrayList<>();
        boardIndex = index;
    }
    public ArrayList<Tile> getSurroundingTiles(){
        return new ArrayList<>();
    }
//    private Player getPlayer(){}
    public void setMyTiles(Tile[] tiles) {
        myTiles = tiles;
    }
    public void setAdjacentVertices(ArrayList<Vertex> listVertices) {
        adjacentVertices = listVertices;
    }
    public void setAdjacentEdges(ArrayList<Edge> listEdges) {adjacentEdges = listEdges;}
    public ArrayList<Edge> getAdjacentEdges(){return adjacentEdges;}
    public void setPlayerIndex(int playerIndex){
        this.playerIndex = playerIndex;
    }
    public ArrayList<Tile> getAdjacentTiles() { return adjacentTiles;}
    public void setAdjacentTiles(ArrayList<Tile> adjacentTiles) { this.adjacentTiles = adjacentTiles;}
    public void setPort(Port port) {
        myPort = port;
    }
    public Port getPort() {
        return myPort;
    }
    public void setIsCity(boolean isCity) {this.isCity = isCity;}
    public boolean getIsCity() {return isCity;}
    public void setHasPort(boolean hasPort) {
        this.hasPort = hasPort;
    }
    public boolean getHasPort() {
        return hasPort;
    }
    //instead of hasPlayer, use player index and -1 if its index doesnt exist
    public int getPlayerIndex() {
        return playerIndex;
    }
    public int getBoardIndex() {return boardIndex;}
    public ArrayList<Vertex> getAdjacentVertices() {return adjacentVertices;}
}
