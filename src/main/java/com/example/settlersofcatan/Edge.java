package com.example.settlersofcatan;
import java.util.ArrayList;

public class Edge {
    private Vertex endVertex1;
    private Vertex endVertex2;
    private int boardIndex;
    private Tile[] myTiles;
    private boolean hasPlayer;

    public Edge(int index) {
        boardIndex = index;
    }

    public void setMyTiles(Tile[] tiles) {
        this.myTiles = tiles;
    }

    public ArrayList<Tile> getSurroundingTiles(){
        return new ArrayList<>();
    }

    public void setHasPlayer(boolean hasPlayer) {
        this.hasPlayer = hasPlayer;
    }
    public boolean getHasPlayer() {
        return hasPlayer;
    }

}
