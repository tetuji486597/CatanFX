package com.example.settlersofcatan;
import java.util.ArrayList;

public class Vertex {
    private Tile referenceHex;
    private int vertexIndex;
    private boolean hasBridgeToPort;
    private int boardIndex;
    private Tile[] myTiles;

    public Vertex(int index) {
        boardIndex = index;
    }
    public ArrayList<Tile> getSurroundingTiles(){
        return new ArrayList<>();
    }
//    private Player getPlayer(){}
    public void setMyTiles(Tile[] tiles) {
        myTiles = tiles;
    }
    public boolean hasPlayer(){
        return false;

    }
}
