package com.example.settlersofcatan;
import java.util.ArrayList;

public class Vertex {
    Tile referenceHex;
    int vertexIndex;
    boolean hasBridgeToPort;

    private ArrayList<Tile> getSurroundingTiles(){
        return new ArrayList<>();
    }
//    private Player getPlayer(){}

    private boolean hasPlayer(){
        return false;

    }
}
