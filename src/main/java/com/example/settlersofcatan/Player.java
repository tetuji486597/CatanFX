package com.example.settlersofcatan;

import java.util.ArrayList;
import java.util.Stack;

public class Player extends GameState{
    int victoryPoints;

    Stack<ResourceCard> resourceDeck = new Stack<ResourceCard>();
    Stack<DevCard> devDeck = new Stack<DevCard>();
    ArrayList<Settlement> settlements = new ArrayList<Settlement>();
    ArrayList<City> cities = new ArrayList<City>();
    int cardCount, victoryPoints;

    public int getCardCount(){
        return 0;
    }
    public ArrayList<Vertex> getBuildableVertices(){
        return new ArrayList<>();
    }
    public ArrayList<Edge> getBuildableEdges(){
        return new ArrayList<>();
    }
    public void takeAllResources(Stack ResourceCard) {

    }
    public void stealCard(boolean Player) {

    }
    public boolean
    









    public int getVictoryPoints(){
        return victoryPoints;
    }
    public int setVictoryPoints(int points){
        victoryPoints = points;
        return points;
    }
}
