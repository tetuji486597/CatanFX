package com.example.settlersofcatan;
import java.util.ArrayList;

public class Edge {
    private Vertex endVertex1;
    private Vertex endVertex2;
    private int boardIndex;
    public Edge(int index) {
        boardIndex = index;
    }

    private ArrayList<Tile> getSurroundingTiles(){
        return new ArrayList<>();
    }

}
