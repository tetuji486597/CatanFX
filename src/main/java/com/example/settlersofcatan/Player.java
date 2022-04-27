package com.example.settlersofcatan;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Stack;

public class Player {
    private int victoryPoints;
    private int cardCount;
    //Anjie: I changed color to public bc I need to access it
    //in Settlement & City classes (according to UML)
    private String color;
    private boolean hasMoreThan7;
    private Image mySettlement;
    private Image myCity;
    private int index;
    private ArrayList<ResourceCard> resourceDeck;
    private ArrayList<DevCard> devDeck;
    private ArrayList<Edge> roads;
    private ArrayList<Vertex> settlements;
    private ArrayList<Vertex> cities;

    public Player(String color, int index) {
        this.color = color;
        switch(color) {
            case "Blue":
                mySettlement = Initialize.buildings.get("BlueSettlement");
                myCity = Initialize.buildings.get("BlueCity");
                break;
            case "Green":
                mySettlement = Initialize.buildings.get("GreenSettlement");
                myCity = Initialize.buildings.get("GreenCity");
                break;
            case "Red":
                mySettlement = Initialize.buildings.get("RedSettlement");
                myCity = Initialize.buildings.get("RedCity");
                break;
            case "White":
                mySettlement = Initialize.buildings.get("WhiteSettlement");
                myCity = Initialize.buildings.get("WhiteCity");
                break;
        }
        this.index = index;
        roads = new ArrayList<>();
        resourceDeck = new ArrayList<>();
        devDeck = new ArrayList<>();
        settlements = new ArrayList<>();
        cities = new ArrayList<>();
    }

    public void addRoad(Edge edge) {
        roads.add(edge);
    }
    public void addSettlement(Vertex vertex) {
        settlements.add(vertex);
    }
    public String getColor() {
        return color;
    }
    public int getCardCount(){
        return 0;
    }
    public ArrayList<Vertex> getBuildableVertices(){
        return new ArrayList<>();
    }
    public ArrayList<Edge> getBuildableEdges(){return new ArrayList<>();}
    public ArrayList<Vertex> getOwnedSettlements() {return settlements;}
    public ArrayList<Edge> getOwnedEdges() {return roads;}
    public ArrayList<ResourceCard> getResourceDeck() {return resourceDeck;}
    public void addResources(ArrayList<ResourceCard> resources) {
        for(ResourceCard resource: resources) {
            resourceDeck.add(resource);
        }
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
        for(Vertex vertex: settlements) {
            if(vertex.getHasPort()) return true;
        }
        return false;
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

    public int getIndex() {
        return index;
    }
}
