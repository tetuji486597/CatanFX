package com.example.settlersofcatan;
import java.util.ArrayList;

public class Vertex {
    private Tile referenceHex;
    private int vertexIndex;
    private boolean hasBridgeToPort;
    private int boardIndex;

    public Vertex(int index) {
        boardIndex = index;
    }
    private ArrayList<Tile> getSurroundingTiles(){
        return new ArrayList<>();
    }
//    private Player getPlayer(){}

    private boolean hasPlayer(){
        return false;

    }
}
