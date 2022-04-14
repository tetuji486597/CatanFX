package com.example.settlersofcatan;

import javafx.event.ActionEvent;
import javafx.scene.image.Image;

import java.io.IOException;
import java.util.*;

public class GameState{

    public static int numPlayers;
    public static ArrayList<Player> allPlayers;
    public static Player currentPlayer;
    public static Robber robber;
    public int robberXCoord;
    public int robberYCoord;
    public static String[] allTiles;
    public static Tile[] tiles;
    public static int[][] pos;
    public static HashMap<String, Tile> tilesMap;
    public static HashMap<String, Tile> posMap;
    public static String[] allTokens;
    public static String[] allPorts;
    public static Vertex[] allVertices;
    public static Edge[] allEdges;
    public static Port[] ports;
    public static HashMap<String, Integer> tokenMap;
    public static HashMap<String, Integer> resourceBank;
    public static Stack<DevCard> devBank;
    public static ArrayList<String> allDevCards;
    public static String[] allColors;
    public static GameBoardController controller;


    public GameState(int numPlayers) {

        this.numPlayers = numPlayers;

        allVertices = new Vertex[54];
        for(int i = 0; i < 54; i++) {
            allVertices[i] = new Vertex(i);
        }
        allEdges = new Edge[72];
        for(int i = 0; i < 72; i++) {
            allEdges[i] = new Edge(i);
        }
        allTiles = new String[] {"Pasture","Pasture","Pasture","Pasture", "Field","Field","Field","Field", "Mountain","Mountain","Mountain", "Hills","Hills","Hills", "Forest","Forest","Forest","Forest","Desert"};
        allTokens  = new String[] {"A5", "L10", "K8", "B2", "M9", "R11", "J4", "C6", "N4", "Q3", "I11", "D3", "O5", "P6", "H12", "E8", "F10", "G9"};
        tokenMap = new HashMap<>();
        int[] numbers = new int[] {5,10,8,2,9,11,4,6,4,3,11,3,5,6,12,8,10,9};
        for(int i = 0; i < numbers.length; i++) {
            tokenMap.put(allTokens[i], numbers[i]);
        }
        devBank = new Stack<>();

        allPorts = new String[] {"UnknownPort", "UnknownPort", "UnknownPort", "UnknownPort", "BrickPort", "GrainPort", "WoodPort", "WoolPort", "OrePort"};
        List<String> portShuffle = Arrays.asList(allPorts);
        Collections.shuffle(portShuffle);
        ports = new Port[9];
        allPorts = portShuffle.toArray(new String[portShuffle.size()]);
        for(int i = 0; i < 9; i++) {
            Port port = new Port(allPorts[i], Initialize.ports.get(allPorts[i]));
            ports[i] = port;
        }
        pos = new int[][] {
                {0,0},{0,1},{0,2},
              {1,0},{1,1},{1,2},{1,3},
            {2,0},{2,1},{2,2},{2,3},{2,4},
              {3,0},{3,1},{3,2},{3,3},
                {4,0},{4,1},{4,2},
        };
        List<String> tileShuffle = Arrays.asList(allTiles);
        Collections.shuffle(tileShuffle);
        allTiles = tileShuffle.toArray(new String[tileShuffle.size()]);
        tiles = new Tile[19];
        tilesMap = new HashMap<>();
        posMap = new HashMap<>();
        resourceBank = new HashMap<>();
        devBank = new Stack<>();

        boolean hasFoundDesert = false;
        for(int i = 0; i < 19; i++) {
            if(allTiles[i].equals("Desert")) {
                Tile desertTile = new Tile("Desert", Initialize.tiles.get("Desert"), pos[i], 0);
                tiles[i] = desertTile;
                tilesMap.put("Desert", desertTile);
                posMap.put(Arrays.toString(pos[i]), desertTile);
                hasFoundDesert = true;
                continue;
            }
            int num = hasFoundDesert ? numbers[i-1] : numbers[i];
            Tile tile = new Tile(allTiles[i], Initialize.tiles.get(allTiles[i]),  pos[i], num);
            tiles[i] = tile;
            tilesMap.put(allTiles[i], tile);
            posMap.put(Arrays.toString(pos[i]), tiles[i]);
        }
        for(int i = 0; i < 19; i++) {
            System.out.println(allTiles[i] + " " + Arrays.toString(pos[i]) + " " + tiles[i].getToken());
        }
        allColors = new String[] {"Blue", "Green", "White", "Red"};

        resourceBank.put("Grain", 19);
        resourceBank.put("Wood", 19);
        resourceBank.put("Wool", 19);
        resourceBank.put("Ore", 19);
        resourceBank.put("Brick", 19);
        allPlayers = new ArrayList<>();
        for(int i = 0; i < numPlayers; i++) {
            currentPlayer = new Player(allColors[i], i);
            allPlayers.add(currentPlayer);
        }
        allDevCards = new ArrayList<>();
        for(int i = 0; i < 13; i++) allDevCards.add("Knight");
        allDevCards.add("University");
        allDevCards.add("Library");
        allDevCards.add("Chapel");
        allDevCards.add("Market");
        allDevCards.add("GreatHall");
        for(int i = 0; i < 2; i++) allDevCards.add("YearOfPlenty");
        for(int i = 0; i < 2; i++) allDevCards.add("RoadBuilding");
        for(int i = 0; i < 2; i++) allDevCards.add("Monopoly");
        for(int i = 0; i < allDevCards.size(); i++) {
            boolean isVictory = false;
            String thisCard = allDevCards.get(i);
            if(thisCard.equals("University") ||
                    thisCard.equals("Library") ||
                    thisCard.equals("Chapel") ||
                    thisCard.equals("Market") ||
                    thisCard.equals("GreatHall"))
                isVictory = true;
            devBank.push(new DevCard(thisCard, isVictory));
        }
        tiles[0].setVertices(new Vertex[] {allVertices[0],allVertices[3],allVertices[4],allVertices[7],allVertices[8],allVertices[12]});
        tiles[0].setVertices(new Vertex[] {allVertices[0],allVertices[3],allVertices[4],allVertices[7],allVertices[8],allVertices[12]});
        tiles[0].setVertices(new Vertex[] {allVertices[0],allVertices[3],allVertices[4],allVertices[7],allVertices[8],allVertices[12]});
        tiles[0].setVertices(new Vertex[] {allVertices[0],allVertices[3],allVertices[4],allVertices[7],allVertices[8],allVertices[12]});
        tiles[0].setVertices(new Vertex[] {allVertices[0],allVertices[3],allVertices[4],allVertices[7],allVertices[8],allVertices[12]});
        tiles[0].setVertices(new Vertex[] {allVertices[0],allVertices[3],allVertices[4],allVertices[7],allVertices[8],allVertices[12]});
        tiles[0].setVertices(new Vertex[] {allVertices[0],allVertices[3],allVertices[4],allVertices[7],allVertices[8],allVertices[12]});
        tiles[0].setVertices(new Vertex[] {allVertices[0],allVertices[3],allVertices[4],allVertices[7],allVertices[8],allVertices[12]});
        tiles[0].setVertices(new Vertex[] {allVertices[0],allVertices[3],allVertices[4],allVertices[7],allVertices[8],allVertices[12]});
        tiles[0].setVertices(new Vertex[] {allVertices[0],allVertices[3],allVertices[4],allVertices[7],allVertices[8],allVertices[12]});
        tiles[0].setVertices(new Vertex[] {allVertices[0],allVertices[3],allVertices[4],allVertices[7],allVertices[8],allVertices[12]});
        tiles[0].setVertices(new Vertex[] {allVertices[0],allVertices[3],allVertices[4],allVertices[7],allVertices[8],allVertices[12]});
        tiles[0].setVertices(new Vertex[] {allVertices[0],allVertices[3],allVertices[4],allVertices[7],allVertices[8],allVertices[12]});
        tiles[0].setVertices(new Vertex[] {allVertices[0],allVertices[3],allVertices[4],allVertices[7],allVertices[8],allVertices[12]});
        tiles[0].setVertices(new Vertex[] {allVertices[0],allVertices[3],allVertices[4],allVertices[7],allVertices[8],allVertices[12]});
        tiles[0].setVertices(new Vertex[] {allVertices[0],allVertices[3],allVertices[4],allVertices[7],allVertices[8],allVertices[12]});
        tiles[0].setVertices(new Vertex[] {allVertices[0],allVertices[3],allVertices[4],allVertices[7],allVertices[8],allVertices[12]});
        tiles[0].setVertices(new Vertex[] {allVertices[0],allVertices[3],allVertices[4],allVertices[7],allVertices[8],allVertices[12]});
        tiles[0].setVertices(new Vertex[] {allVertices[0],allVertices[3],allVertices[4],allVertices[7],allVertices[8],allVertices[12]});
    }

    public int rollDice(){
        //sum of 2 independent dice
        Random rand = new Random();
        int die1 = rand.nextInt(6);
        int die2 = rand.nextInt(6);
        int diceRoll = die1+die2;
        return diceRoll;
    }
    public void sevenRolled(){
        if (rollDice() == 7){
            //do stuff
        }
    }
    public void giveResources(){

    }
    public void incrementVictory(Player player){
        player.setVictoryPoints(player.getVictoryPoints() + 1);
    }

    public void setUp(){

    }
    public Player nextPlayer(){
        return currentPlayer;
    }

    public ArrayList<Integer> getRobberLocation(){
        return setRobberLocation(robber.getXCoord(), robber.getYCoord());
    }

    public ArrayList<Integer> setRobberLocation(int x, int y){
        return robber.robberLocation(x,y);
    }
    public void moveRobber(int x, int y){
        setRobberLocation(x,y);
    }

    public ArrayList<Player>getRobberAdjacentPlayers(){
        return new ArrayList<>();
    }

    public ArrayList<Player> checkGreaterThan7(){
        return new ArrayList();
    }

    public int findLongestRoad(Player player){
        return 0;
    }

    public boolean secondRoadViolated(){
        return false;
    }

    public boolean enoughCardsRequired(){
        return false;
    }

    public boolean onePlayerOnShortage(){
        return false;
    }

    public boolean maintainsDistanceRule(){
        return false;
    }


}
