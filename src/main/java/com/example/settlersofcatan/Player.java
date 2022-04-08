package com.example.settlersofcatan;

import java.util.ArrayList;
import java.util.Stack;

public class Player {
    int victoryPoints;
    int cardCount;
    Stack<ResourceCard> resourceDeck = new Stack<ResourceCard>();
    Stack<DevCard> devDeck = new Stack<DevCard>();
    ArrayList<Settlement> settlements = new ArrayList<Settlement>();
    ArrayList<City> cities = new ArrayList<City>();

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
    public boolean buyBuilding(ArrayList Building) {
//        /*if (/*player has resources*/) {
//            /*remove resources*/
//            return true;
//            if (/*building is city*/) {
//                victoryPoints += 2;
//            }
//            if (/*building is settlement*/) {
//                victoryPoints++;
//            }
//        } else
            return false;
    }

    public boolean buyRoad() {
        return true;
    }
    public boolean buyDevCard() {
        //add dev cards to player deck
        // remove appropriate resources,
        return true;
        //else
            //return false;
    }

        public boolean hasPort() {
            return true;
        }

        public boolean isMyTurn() {
            return true;
        }

    public int getVictoryPoints(){
        return victoryPoints;
    }
    public int setVictoryPoints(int points){
        victoryPoints = points;
        return points;
    }
}
