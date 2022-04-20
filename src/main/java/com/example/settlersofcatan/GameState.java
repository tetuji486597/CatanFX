package com.example.settlersofcatan;

import javafx.beans.binding.NumberBinding;
import javafx.scene.paint.Color;

import java.util.*;

public class GameState{

    public static int numPlayers;
    public static ArrayList<Player> allPlayers;
    public static Player currentPlayer;
    public static int currentPlayerIndex;
    public static Robber robber;
    public int robberXCoord;
    public int robberYCoord;
    public static String[] allTiles;
    public static Tile[] tiles;
    public static int[][] pos;
    public static int[][] tokenPos;
    public static HashMap<String, Tile> tilesMap;
    public static HashMap<String, Tile> posMap;
    public static HashMap<Integer, Player> playerMap;
    public static String[] allTokens;
    public static NumberToken[] tokens;
    public static String[] allPorts;
    public static Vertex[] allVertices;
    public static Edge[] allEdges;
    public static Port[] ports;
    public static HashMap<String, javafx.scene.paint.Color> nameToColor;
    public static HashMap<String, Integer> tokenMap;
    public static HashMap<String, Integer> resourceBank;
    public static Stack<DevCard> devBank;
    public static ArrayList<String> allDevCards;
    public static String[] allColors;
    public static GameBoardController controller;
    public static int firstPlayerIndex;
    public static int[] setUpDice;
    public static boolean gameStarted = false;

    public GameState(int numPlayers) {

        this.numPlayers = numPlayers;
        firstPlayerIndex = -1;

        setUpDice = new int[numPlayers];

        allVertices = new Vertex[54];
        for(int i = 0; i < 54; i++) {
            allVertices[i] = new Vertex(i);
        }
        allEdges = new Edge[72];
        for(int i = 0; i < 72; i++) {
            allEdges[i] = new Edge(i);
        }
        allTiles = new String[] {"Pasture","Pasture","Pasture","Pasture", "Field","Field","Field","Field", "Mountain","Mountain","Mountain", "Hills","Hills","Hills", "Forest","Forest","Forest","Forest","Desert"};
        allTokens  = new String[] {"A5", "B2", "C6", "D3", "E8", "F10", "G9", "H12", "I11", "J4", "K8", "L10", "M9", "N4", "O5", "P6", "Q3", "R11"};

        tokenMap = new HashMap<>();
        int[] numbers = new int[] {5,2,6,3,8,10,9,12,11,4,8,10,9,4,5,6,3,11};
        for(int i = 0; i < numbers.length; i++) {
            tokenMap.put(allTokens[i], numbers[i]);
        }

        tokens = new NumberToken[allTokens.length];
        for(int i  = 0; i < allTokens.length; i++) {
            tokens[i] = new NumberToken(tokenMap.get(allTokens[i]), Initialize.numberTokens.get(allTokens[i]));
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
        tokenPos = new int[][] {
                {0,0},{1,0},{2,0},
            {3,0},{4,0},{4,1},{4,2},
          {3,3},{2,4},{1,3},{0,2},{0,1},
            {1,1},{2,1},{3,1},{3,2},
                {2,3},{1,2},{2,2}
        };
        pos = new int[][] {
                {0,0},{0,1},{0,2},
              {1,0},{1,1},{1,2},{1,3},
            {2,0},{2,1},{2,2},{2,3},{2,4},
              {3,0},{3,1},{3,2},{3,3},
                {4,0},{4,1},{4,2}
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
        nameToColor = new HashMap<>();
        nameToColor.put("Blue", Color.LIGHTBLUE);
        nameToColor.put("Green", Color.LIGHTGREEN);
        nameToColor.put("White", Color.WHITE);
        nameToColor.put("Red", Color.INDIANRED);


        resourceBank.put("Grain", 19);
        resourceBank.put("Wood", 19);
        resourceBank.put("Wool", 19);
        resourceBank.put("Ore", 19);
        resourceBank.put("Brick", 19);
        allPlayers = new ArrayList<>();

        playerMap = new HashMap<>();
        for(int i = 1; i <= numPlayers; i++) {
            currentPlayer = new Player(allColors[i-1], i);
            allPlayers.add(currentPlayer);
            playerMap.put(i, currentPlayer);
        }
        currentPlayer = playerMap.get(1);
        currentPlayerIndex = 1;
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
        tiles[1].setVertices(new Vertex[] {allVertices[1],allVertices[4],allVertices[5],allVertices[8],allVertices[9],allVertices[13]});
        tiles[2].setVertices(new Vertex[] {allVertices[2],allVertices[5],allVertices[6],allVertices[9],allVertices[10],allVertices[14]});
        tiles[3].setVertices(new Vertex[] {allVertices[7],allVertices[11],allVertices[12],allVertices[16],allVertices[17],allVertices[22]});
        tiles[4].setVertices(new Vertex[] {allVertices[8],allVertices[12],allVertices[13],allVertices[17],allVertices[18],allVertices[23]});
        tiles[5].setVertices(new Vertex[] {allVertices[9],allVertices[13],allVertices[14],allVertices[18],allVertices[19],allVertices[24]});
        tiles[6].setVertices(new Vertex[] {allVertices[10],allVertices[14],allVertices[15],allVertices[19],allVertices[20],allVertices[25]});
        tiles[7].setVertices(new Vertex[] {allVertices[16],allVertices[21],allVertices[22],allVertices[27],allVertices[28],allVertices[33]});
        tiles[8].setVertices(new Vertex[] {allVertices[17],allVertices[22],allVertices[23],allVertices[28],allVertices[29],allVertices[34]});
        tiles[9].setVertices(new Vertex[] {allVertices[18],allVertices[23],allVertices[24],allVertices[29],allVertices[30],allVertices[35]});
        tiles[10].setVertices(new Vertex[] {allVertices[19],allVertices[24],allVertices[25],allVertices[30],allVertices[31],allVertices[36]});
        tiles[11].setVertices(new Vertex[] {allVertices[20],allVertices[25],allVertices[26],allVertices[31],allVertices[32],allVertices[37]});
        tiles[12].setVertices(new Vertex[] {allVertices[28],allVertices[33],allVertices[34],allVertices[38],allVertices[39],allVertices[43]});
        tiles[13].setVertices(new Vertex[] {allVertices[29],allVertices[34],allVertices[35],allVertices[39],allVertices[40],allVertices[44]});
        tiles[14].setVertices(new Vertex[] {allVertices[30],allVertices[35],allVertices[36],allVertices[40],allVertices[41],allVertices[45]});
        tiles[15].setVertices(new Vertex[] {allVertices[31],allVertices[36],allVertices[37],allVertices[41],allVertices[42],allVertices[46]});
        tiles[16].setVertices(new Vertex[] {allVertices[39],allVertices[43],allVertices[44],allVertices[47],allVertices[48],allVertices[51]});
        tiles[17].setVertices(new Vertex[] {allVertices[40],allVertices[44],allVertices[45],allVertices[48],allVertices[49],allVertices[52]});
        tiles[18].setVertices(new Vertex[] {allVertices[41],allVertices[45],allVertices[46],allVertices[49],allVertices[50],allVertices[53]});

        tiles[0].setEdges(new Edge[] {allEdges[0],allEdges[1],allEdges[6],allEdges[7],allEdges[11],allEdges[12]});
        tiles[1].setEdges(new Edge[] {allEdges[2],allEdges[3],allEdges[7],allEdges[8],allEdges[13],allEdges[14]});
        tiles[2].setEdges(new Edge[] {allEdges[4],allEdges[5],allEdges[8],allEdges[9],allEdges[15],allEdges[16]});
        tiles[3].setEdges(new Edge[] {allEdges[10],allEdges[11],allEdges[18],allEdges[19],allEdges[24],allEdges[25]});
        tiles[4].setEdges(new Edge[] {allEdges[12],allEdges[13],allEdges[19],allEdges[20],allEdges[26],allEdges[27]});
        tiles[5].setEdges(new Edge[] {allEdges[14],allEdges[15],allEdges[20],allEdges[21],allEdges[28],allEdges[29]});
        tiles[6].setEdges(new Edge[] {allEdges[16],allEdges[17],allEdges[21],allEdges[22],allEdges[30],allEdges[31]});
        tiles[7].setEdges(new Edge[] {allEdges[23],allEdges[24],allEdges[33],allEdges[34],allEdges[39],allEdges[40]});
        tiles[8].setEdges(new Edge[] {allEdges[25],allEdges[26],allEdges[34],allEdges[35],allEdges[41],allEdges[42]});
        tiles[9].setEdges(new Edge[] {allEdges[27],allEdges[28],allEdges[35],allEdges[36],allEdges[43],allEdges[44]});
        tiles[10].setEdges(new Edge[] {allEdges[29],allEdges[30],allEdges[36],allEdges[37],allEdges[45],allEdges[46]});
        tiles[11].setEdges(new Edge[] {allEdges[31],allEdges[32],allEdges[37],allEdges[38],allEdges[47],allEdges[48]});
        tiles[12].setEdges(new Edge[] {allEdges[40],allEdges[41],allEdges[49],allEdges[50],allEdges[54],allEdges[55]});
        tiles[13].setEdges(new Edge[] {allEdges[42],allEdges[43],allEdges[50],allEdges[51],allEdges[56],allEdges[57]});
        tiles[14].setEdges(new Edge[] {allEdges[44],allEdges[45],allEdges[51],allEdges[52],allEdges[58],allEdges[59]});
        tiles[15].setEdges(new Edge[] {allEdges[46],allEdges[47],allEdges[52],allEdges[53],allEdges[60],allEdges[61]});
        tiles[16].setEdges(new Edge[] {allEdges[55],allEdges[56],allEdges[62],allEdges[63],allEdges[66],allEdges[67]});
        tiles[17].setEdges(new Edge[] {allEdges[57],allEdges[58],allEdges[63],allEdges[64],allEdges[68],allEdges[69]});
        tiles[18].setEdges(new Edge[] {allEdges[59],allEdges[60],allEdges[64],allEdges[65],allEdges[70],allEdges[71]});

        allVertices[0].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[3],allVertices[4])));
        allVertices[1].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[4],allVertices[5])));
        allVertices[2].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[5],allVertices[6])));
        allVertices[3].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[0],allVertices[7])));
        allVertices[4].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[0],allVertices[8],allVertices[1])));
        allVertices[5].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[1],allVertices[2],allVertices[9])));
        allVertices[6].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[2],allVertices[10])));
        allVertices[7].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[3],allVertices[11],allVertices[12])));
        allVertices[8].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[4],allVertices[12],allVertices[13])));
        allVertices[9].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[5],allVertices[13],allVertices[14])));
        allVertices[10].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[6],allVertices[14],allVertices[15])));
        allVertices[11].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[7],allVertices[16])));
        allVertices[12].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[7],allVertices[8],allVertices[17])));
        allVertices[13].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[8],allVertices[9],allVertices[18])));
        allVertices[14].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[9],allVertices[10],allVertices[19])));
        allVertices[15].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[10],allVertices[20])));
        allVertices[16].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[11],allVertices[21],allVertices[22])));
        allVertices[17].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[12],allVertices[22],allVertices[23])));
        allVertices[18].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[13],allVertices[23],allVertices[24])));
        allVertices[19].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[14],allVertices[24],allVertices[25])));
        allVertices[20].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[15],allVertices[25],allVertices[26])));
        allVertices[21].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[16],allVertices[27])));
        allVertices[22].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[16],allVertices[17],allVertices[28])));
        allVertices[23].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[17],allVertices[18],allVertices[29])));
        allVertices[24].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[18],allVertices[19],allVertices[30])));
        allVertices[25].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[19],allVertices[20],allVertices[31])));
        allVertices[26].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[20],allVertices[32])));
        allVertices[27].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[21],allVertices[33])));
        allVertices[28].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[22],allVertices[33],allVertices[34])));
        allVertices[29].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[23],allVertices[34],allVertices[35])));
        allVertices[30].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[24],allVertices[35],allVertices[36])));
        allVertices[31].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[25],allVertices[36],allVertices[37])));
        allVertices[32].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[26],allVertices[37])));
        allVertices[33].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[27],allVertices[28],allVertices[38])));
        allVertices[34].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[28],allVertices[29],allVertices[39])));
        allVertices[35].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[29],allVertices[30],allVertices[40])));
        allVertices[36].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[30],allVertices[31],allVertices[41])));
        allVertices[37].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[31],allVertices[32],allVertices[42])));
        allVertices[38].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[33],allVertices[43])));
        allVertices[39].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[34],allVertices[43],allVertices[44])));
        allVertices[40].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[35],allVertices[44],allVertices[45])));
        allVertices[41].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[36],allVertices[45],allVertices[46])));
        allVertices[42].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[37],allVertices[46])));
        allVertices[43].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[38],allVertices[39],allVertices[47])));
        allVertices[44].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[39],allVertices[40],allVertices[48])));
        allVertices[45].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[40],allVertices[41],allVertices[49])));
        allVertices[46].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[41],allVertices[42],allVertices[50])));
        allVertices[47].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[43],allVertices[51])));
        allVertices[48].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[44],allVertices[51],allVertices[52])));
        allVertices[49].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[45],allVertices[52],allVertices[53])));
        allVertices[50].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[46],allVertices[53])));
        allVertices[51].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[47],allVertices[48])));
        allVertices[52].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[48],allVertices[49])));
        allVertices[53].setAdjacentVertices(new ArrayList<>(Arrays.asList(allVertices[49],allVertices[50])));

        allEdges[0].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[1],allEdges[6])));
        allEdges[1].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[0],allEdges[2],allEdges[7])));
        allEdges[2].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[1],allEdges[3],allEdges[7])));
        allEdges[3].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[2],allEdges[4],allEdges[8])));
        allEdges[4].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[3],allEdges[5],allEdges[8])));
        allEdges[5].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[4],allEdges[9])));
        allEdges[6].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[0],allEdges[10],allEdges[11])));
        allEdges[7].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[1],allEdges[2],allEdges[12],allEdges[13])));
        allEdges[8].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[3],allEdges[4],allEdges[14],allEdges[15])));
        allEdges[9].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[5],allEdges[16],allEdges[17])));
        allEdges[10].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[6],allEdges[11],allEdges[18])));



    }

    //also checks if taken by another player
    public static boolean maintainsDistance(Vertex vertex) {
        if(vertex.getHasPlayer()) return true;
        return false;
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
