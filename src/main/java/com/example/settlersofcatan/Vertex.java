package com.example.settlersofcatan;

import java.util.ArrayList;

public class Vertex {
    private Tile referenceHex;
    private int vertexIndex;
    private boolean hasBridgeToPort;
    private int boardIndex;
    private Tile[] myTiles;
    private javafx.scene.shape.Rectangle myRect;
    private ArrayList<Vertex> adjacentVertices;
    private boolean hasPlayer;

    public Vertex(int index) {
        adjacentVertices = new ArrayList<>();
        hasPlayer = false;
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
    public void setHasPlayer(boolean hasPlayer){
        this.hasPlayer = hasPlayer;
    }
    public boolean getHasPlayer() {
        return hasPlayer;
    }

}
