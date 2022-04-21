package com.example.settlersofcatan;
import java.util.ArrayList;

public class Edge {
    private Vertex endVertex1;
    private Vertex endVertex2;
    private int boardIndex;
    private Tile[] myTiles;
    private ArrayList<Edge> adjacentEdges;
    private int playerIndex;

    public Edge(int index) {
        playerIndex = -1;
        boardIndex = index;
        adjacentEdges = new ArrayList<>();
    }

    public void setMyTiles(Tile[] tiles) {
        this.myTiles = tiles;
    }

    public void setAdjacentEdges(ArrayList<Edge> listEdges) {
        adjacentEdges = listEdges;
    }
    public ArrayList<Edge> getAdjacentEdges() {
        return adjacentEdges;
    }
    public ArrayList<Tile> getSurroundingTiles(){
        return new ArrayList<>();
    }

    public void setPlayerIndex(int playerIndex) {
        this.playerIndex = playerIndex;
    }
    public int getPlayerIndex() {
        return playerIndex;
    }
    public int getBoardIndex() {return boardIndex;}
}
