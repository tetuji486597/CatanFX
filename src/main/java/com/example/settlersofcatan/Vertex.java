package com.example.settlersofcatan;

import java.util.ArrayList;

public class Vertex {
    private Tile referenceHex;
    private int vertexIndex;
    private boolean hasBridgeToPort;
    private int boardIndex;
    private Tile[] myTiles;
    private javafx.scene.shape.Rectangle myRect;
    private boolean hasPlayer;

    public Vertex(int index) {
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
    public void setHasPlayer(boolean hasPlayer){
        this.hasPlayer = hasPlayer;
    }
    public boolean getHasPlayer() {
        return hasPlayer;
    }

}
