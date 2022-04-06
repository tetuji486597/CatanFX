package com.example.settlersofcatan;

import java.util.ArrayList;

public class Player extends GameState{
    int victoryPoints;

    public int getCardCount(){
        return 0;
    }
    public ArrayList<Vertex> getBuildableVertices(){
        return new ArrayList<>();
    }
    public ArrayList<Edge> getBuildableEdges(){
        return new ArrayList<>();
    }

    public int getVictoryPoints(){
        return victoryPoints;
    }
    public int setVictoryPoints(int points){
        victoryPoints = points;
        return points;
    }
}
