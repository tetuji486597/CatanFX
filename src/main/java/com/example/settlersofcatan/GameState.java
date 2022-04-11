package com.example.settlersofcatan;

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
    public static HashMap<String, Integer> tokenMap;
    public static HashMap<String, Integer> resourceBank;
    public static Stack<DevCard> devBank;
    public static ArrayList<String> allDevCards;
    public String[] allColors;

    public GameState(int numPlayers) {

        this.numPlayers = numPlayers;

        allTiles = new String[] {"Pasture","Pasture","Pasture","Pasture", "Field","Field","Field","Field", "Mountain","Mountain","Mountain", "Hills","Hills","Hills", "Forest","Forest","Forest","Forest"};
        allTokens  = new String[] {"A5", "L10", "K8", "B2", "M9", "R11", "J4", "C6", "N4", "Q3", "I11", "D3", "O5", "P6", "H12", "E8", "F10", "G9"};
        tokenMap = new HashMap<>();
        int[] numbers = new int[] {5,10,8,2,9,11,4,6,4,3,11,3,5,6,12,8,10,9};
        for(int i = 0; i < numbers.length; i++) {
            tokenMap.put(allTokens[i], numbers[i]);
        }
        devBank = new Stack<>();

        allPorts = new String[] {"UnknownPort", "UnknownPort", "UnknownPort", "UnknownPort", "UnknownPort", "BrickPort", "GrainPort", "WoodPort", "WoolPort", "OrePort"};
        pos = new int[][] {
                {0,0},{0,1},{0,2},
              {1,0},{1,1},{1,2},{1,3},
            {2,0},{2,1},{2,3},{2,4},
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

        for(int i = 0; i < 18; i++) {
            Tile tile = new Tile(allTiles[i], Initialize.tiles.get(allTiles[i]),  pos[i], numbers[i]);
            tiles[i] = tile;
            tilesMap.put(allTiles[i], tile);
            posMap.put(Arrays.toString(pos[i]), tiles[i]);
        }
        Tile desertTile = new Tile("Desert", Initialize.tiles.get("Desert"), new int[]{2,2}, 0);
        tiles[18] = desertTile;
        tilesMap.put("Desert", desertTile);
        posMap.put("[2, 2]", desertTile);
        allColors = new String[] {"Blue", "Green", "White", "Red"};
        List<String> colorShuffle = Arrays.asList(allColors);
        Collections.shuffle(colorShuffle);
        allColors = colorShuffle.toArray(new String[colorShuffle.size()]);

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
    }

    public void shuffle(ArrayList<Tile> tiles){

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

    }
    public void giveResources(){

    }
    public void incrementVictory(Player Player){
        Player.setVictoryPoints(Player.getVictoryPoints() + 1);
    }
    public void setUp(){

    }
    public Player nextPlayer(){
        return currentPlayer;
    }

    public ArrayList<Integer> getRobberLocation(){
        return setRobberLocation(robber.getXCoord(), robber.getYCoord(), robber.getZCoord());
    }

    public ArrayList<Integer> setRobberLocation(int x, int y, int z){
        return robber.robberLocation(x,y,z);
    }
    public void moveRobber(int x, int y, int z){
        setRobberLocation(x,y,z);
    }

    public ArrayList<Player>getRobberAdjacentPlayers(){
        return new ArrayList<>();
    }

    public ArrayList<Player> checkGreaterThan7(){
        return new ArrayList();
    }

//    public int findLongestRoad(Player player){}
//
//    public boolean secondRoadViolated(){}
//
//    public boolean enoughCardsRequired(){}
//
//    public boolean onePlayerOnShortage(){}
//
//    public boolean maintainsDistanceRule(){}
}
