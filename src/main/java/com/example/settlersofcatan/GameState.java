package com.example.settlersofcatan;

import javafx.beans.binding.NumberBinding;
import javafx.scene.paint.Color;

import java.util.*;

public class GameState{

    public static int round;
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
    public static HashMap<String, String> tileToResource;
    public static ArrayList<String[]> newCards;
    public static Stack<DevCard> devBank;
    public static ArrayList<String> allDevCards;
    public static String[] allColors;
    public static GameBoardController controller;
    public static int firstPlayerIndex;
    public static int[] setUpDice;
    public static boolean iterateForward;
    public static boolean firstSettlementsPlaced;
    public static boolean gameStarted;
    public static boolean lastEdgePlaced;

    public GameState(int numPlayers) {

        round = 1;
        iterateForward = true;
        firstSettlementsPlaced = false;
        lastEdgePlaced = false;
        gameStarted = false;
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
        tileToResource = new HashMap<>();
        newCards = new ArrayList<>();
        tileToResource.put("Field", "Grain");
        tileToResource.put("Forest", "Wood");
        tileToResource.put("Hills", "Brick");
        tileToResource.put("Mountain", "Ore");
        tileToResource.put("Pasture", "Wool");

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
        allEdges[11].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[6],allEdges[10],allEdges[12],allEdges[19])));
        allEdges[12].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[7],allEdges[11],allEdges[13],allEdges[19])));
        allEdges[13].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[7],allEdges[12],allEdges[14],allEdges[20])));
        allEdges[14].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[8],allEdges[13],allEdges[15],allEdges[20])));
        allEdges[15].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[8],allEdges[14],allEdges[16],allEdges[21])));
        allEdges[16].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[9],allEdges[15],allEdges[17],allEdges[21])));
        allEdges[17].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[9],allEdges[16],allEdges[22])));
        allEdges[18].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[10],allEdges[23],allEdges[24])));
        allEdges[19].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[11],allEdges[12],allEdges[25],allEdges[26])));
        allEdges[20].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[13],allEdges[14],allEdges[27],allEdges[28])));
        allEdges[21].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[15],allEdges[16],allEdges[29],allEdges[30])));
        allEdges[22].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[17],allEdges[31],allEdges[32])));
        allEdges[23].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[18],allEdges[24],allEdges[33])));
        allEdges[24].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[18],allEdges[23],allEdges[25],allEdges[34])));
        allEdges[25].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[19],allEdges[24],allEdges[26],allEdges[34])));
        allEdges[26].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[19],allEdges[25],allEdges[27],allEdges[35])));
        allEdges[27].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[20],allEdges[26],allEdges[28],allEdges[35])));
        allEdges[28].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[20],allEdges[27],allEdges[29],allEdges[36])));
        allEdges[29].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[21],allEdges[28],allEdges[30],allEdges[36])));
        allEdges[30].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[21],allEdges[29],allEdges[31],allEdges[37])));
        allEdges[31].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[22],allEdges[30],allEdges[32],allEdges[37])));
        allEdges[32].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[22],allEdges[31],allEdges[38])));
        allEdges[33].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[23],allEdges[39])));
        allEdges[34].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[24],allEdges[25],allEdges[40],allEdges[41])));
        allEdges[35].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[26],allEdges[27],allEdges[42],allEdges[43])));
        allEdges[36].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[28],allEdges[29],allEdges[44],allEdges[45])));
        allEdges[37].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[30],allEdges[31],allEdges[46],allEdges[47])));
        allEdges[38].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[32],allEdges[48])));
        allEdges[39].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[33],allEdges[40],allEdges[49])));
        allEdges[40].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[34],allEdges[39],allEdges[41],allEdges[49])));
        allEdges[41].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[34],allEdges[40],allEdges[42],allEdges[50])));
        allEdges[42].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[35],allEdges[41],allEdges[43],allEdges[50])));
        allEdges[43].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[35],allEdges[42],allEdges[44],allEdges[51])));
        allEdges[44].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[36],allEdges[43],allEdges[45],allEdges[51])));
        allEdges[45].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[36],allEdges[44],allEdges[46],allEdges[52])));
        allEdges[46].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[37],allEdges[45],allEdges[47],allEdges[52])));
        allEdges[47].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[37],allEdges[46],allEdges[48],allEdges[53])));
        allEdges[48].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[38],allEdges[47],allEdges[53])));
        allEdges[49].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[39],allEdges[40],allEdges[54])));
        allEdges[50].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[41],allEdges[42],allEdges[55],allEdges[56])));
        allEdges[51].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[43],allEdges[44],allEdges[57],allEdges[58])));
        allEdges[52].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[45],allEdges[46],allEdges[59],allEdges[60])));
        allEdges[53].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[47],allEdges[48],allEdges[61])));
        allEdges[54].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[49],allEdges[55],allEdges[62])));
        allEdges[55].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[50],allEdges[54],allEdges[56],allEdges[62])));
        allEdges[56].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[50],allEdges[55],allEdges[57],allEdges[63])));
        allEdges[57].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[51],allEdges[56],allEdges[58],allEdges[63])));
        allEdges[58].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[51],allEdges[57],allEdges[59],allEdges[64])));
        allEdges[59].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[52],allEdges[58],allEdges[60],allEdges[64])));
        allEdges[60].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[52],allEdges[59],allEdges[61],allEdges[65])));
        allEdges[61].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[53],allEdges[60],allEdges[65])));
        allEdges[62].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[54],allEdges[55],allEdges[66])));
        allEdges[63].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[56],allEdges[57],allEdges[67],allEdges[68])));
        allEdges[64].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[58],allEdges[59],allEdges[69],allEdges[70])));
        allEdges[65].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[60],allEdges[61],allEdges[71])));
        allEdges[66].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[62],allEdges[67])));
        allEdges[67].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[63],allEdges[66],allEdges[68])));
        allEdges[68].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[63],allEdges[67],allEdges[69])));
        allEdges[69].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[64],allEdges[68],allEdges[70])));
        allEdges[70].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[64],allEdges[69],allEdges[71])));
        allEdges[71].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[65],allEdges[70])));

        allVertices[0].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[0],allEdges[1])));
        allVertices[1].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[2],allEdges[3])));
        allVertices[2].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[4],allEdges[5])));
        allVertices[3].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[0],allEdges[6])));
        allVertices[4].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[1],allEdges[2],allEdges[7])));
        allVertices[5].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[3],allEdges[4],allEdges[8])));
        allVertices[6].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[5],allEdges[9])));
        allVertices[7].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[6],allEdges[10],allEdges[11])));
        allVertices[8].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[7],allEdges[12],allEdges[13])));
        allVertices[9].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[8],allEdges[14],allEdges[15])));
        allVertices[10].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[9],allEdges[16],allEdges[17])));
        allVertices[11].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[10],allEdges[18])));
        allVertices[12].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[11],allEdges[12],allEdges[19])));
        allVertices[13].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[13],allEdges[14],allEdges[20])));
        allVertices[14].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[15],allEdges[16],allEdges[21])));
        allVertices[15].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[17],allEdges[22])));
        allVertices[16].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[18],allEdges[23],allEdges[24])));
        allVertices[17].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[19],allEdges[25],allEdges[26])));
        allVertices[18].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[20],allEdges[27],allEdges[28])));
        allVertices[19].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[21],allEdges[29],allEdges[30])));
        allVertices[20].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[22],allEdges[31],allEdges[32])));
        allVertices[21].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[23],allEdges[33])));
        allVertices[22].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[24],allEdges[25],allEdges[34])));
        allVertices[23].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[26],allEdges[27],allEdges[35])));
        allVertices[24].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[28],allEdges[29],allEdges[36])));
        allVertices[25].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[30],allEdges[31],allEdges[37])));
        allVertices[26].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[32],allEdges[38])));
        allVertices[27].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[33],allEdges[39])));
        allVertices[28].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[34],allEdges[40],allEdges[41])));
        allVertices[29].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[35],allEdges[42],allEdges[43])));
        allVertices[30].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[36],allEdges[44],allEdges[45])));
        allVertices[31].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[37],allEdges[46],allEdges[47])));
        allVertices[32].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[38],allEdges[48])));
        allVertices[33].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[39],allEdges[40],allEdges[49])));
        allVertices[34].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[41],allEdges[42],allEdges[50])));
        allVertices[35].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[43],allEdges[44],allEdges[51])));
        allVertices[36].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[45],allEdges[46],allEdges[52])));
        allVertices[37].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[47],allEdges[48],allEdges[53])));
        allVertices[38].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[49],allEdges[54])));
        allVertices[39].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[50],allEdges[55],allEdges[56])));
        allVertices[40].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[51],allEdges[57],allEdges[58])));
        allVertices[41].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[52],allEdges[59],allEdges[60])));
        allVertices[42].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[53],allEdges[61])));
        allVertices[43].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[54],allEdges[55],allEdges[62])));
        allVertices[44].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[56],allEdges[57],allEdges[63])));
        allVertices[45].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[58],allEdges[59],allEdges[64])));
        allVertices[46].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[60],allEdges[61],allEdges[65])));
        allVertices[47].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[62],allEdges[66])));
        allVertices[48].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[63],allEdges[67],allEdges[68])));
        allVertices[49].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[64],allEdges[69],allEdges[70])));
        allVertices[50].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[65],allEdges[71])));
        allVertices[51].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[66],allEdges[67])));
        allVertices[52].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[68],allEdges[69])));
        allVertices[53].setAdjacentEdges(new ArrayList<>(Arrays.asList(allEdges[70],allEdges[71])));

        allVertices[0].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[0])));
        allVertices[1].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[1])));
        allVertices[2].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[2])));
        allVertices[3].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[1])));
        allVertices[4].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[0],tiles[1])));
        allVertices[5].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[1],tiles[2])));
        allVertices[6].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[2])));
        allVertices[7].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[0],tiles[3])));
        allVertices[8].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[0],tiles[1],tiles[4])));
        allVertices[9].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[1],tiles[2],tiles[5])));
        allVertices[10].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[2],tiles[6])));
        allVertices[11].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[3])));
        allVertices[12].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[0],tiles[3],tiles[4])));
        allVertices[13].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[1],tiles[4],tiles[5])));
        allVertices[14].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[2],tiles[5],tiles[6])));
        allVertices[15].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[6])));
        allVertices[16].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[3],tiles[7])));
        allVertices[17].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[3],tiles[4],tiles[8])));
        allVertices[18].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[4],tiles[5],tiles[9])));
        allVertices[19].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[5],tiles[6],tiles[10])));
        allVertices[20].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[6],tiles[11])));
        allVertices[21].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[7])));
        allVertices[22].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[3],tiles[7],tiles[8])));
        allVertices[23].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[4],tiles[8],tiles[9])));
        allVertices[24].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[5],tiles[9],tiles[10])));
        allVertices[25].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[6],tiles[10],tiles[11])));
        allVertices[26].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[11])));
        allVertices[27].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[7])));
        allVertices[28].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[7],tiles[8],tiles[12])));
        allVertices[29].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[8],tiles[9],tiles[13])));
        allVertices[30].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[9],tiles[10],tiles[14])));
        allVertices[31].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[10],tiles[11],tiles[15])));
        allVertices[32].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[11])));
        allVertices[33].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[7],tiles[12])));
        allVertices[34].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[8],tiles[12],tiles[13])));
        allVertices[35].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[9],tiles[13],tiles[14])));
        allVertices[36].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[10],tiles[14],tiles[15])));
        allVertices[37].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[11],tiles[15])));
        allVertices[38].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[12])));
        allVertices[39].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[12],tiles[13],tiles[16])));
        allVertices[40].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[13],tiles[14],tiles[17])));
        allVertices[41].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[14],tiles[15],tiles[18])));
        allVertices[42].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[15])));
        allVertices[43].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[12],tiles[16])));
        allVertices[44].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[13],tiles[16],tiles[17])));
        allVertices[45].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[14],tiles[17],tiles[18])));
        allVertices[46].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[15],tiles[18])));
        allVertices[47].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[16])));
        allVertices[48].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[16],tiles[17])));
        allVertices[49].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[17],tiles[18])));
        allVertices[50].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[18])));
        allVertices[51].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[16])));
        allVertices[52].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[17])));
        allVertices[53].setAdjacentTiles(new ArrayList<>(Arrays.asList(tiles[18])));


    }

    public static void cardAssignment() {
        newCards.clear();
        for(int i = 0; i< numPlayers; i++) {
            Player thisPlayer = allPlayers.get(i);
            ArrayList<Vertex> ownedSettlements = thisPlayer.getOwnedSettlements();
            ArrayList<ResourceCard> cardsToAdd = new ArrayList<>();
            for(int j = 0; j < ownedSettlements.size(); j++) {
                for(int k = 0; k < ownedSettlements.get(j).getAdjacentTiles().size(); k++) {
                    String name = ownedSettlements.get(j).getAdjacentTiles().get(k).getName();
                    if(name.equals("Desert")) continue;
                    cardsToAdd.add(new ResourceCard(tileToResource.get(name), thisPlayer));
                    newCards.add(new String[] {Integer.toString(i+1), tileToResource.get(name)});
                }
            }
            thisPlayer.addResources(cardsToAdd);
        }
    }
    public int getLongestRoad() {
        HashMap<Integer, Integer> indexToRoadLength = new HashMap<>();
        for (int i =0; i < 72; i++) {
            boolean[] visited = new boolean[72];
            if(allEdges[i].getPlayerIndex() >= 0) {
                int roadLength = dfs(allEdges[i], visited, 0);
                if(indexToRoadLength.get(allEdges[i].getPlayerIndex()) == null || roadLength > indexToRoadLength.get(allEdges[i].getPlayerIndex())) {
                    indexToRoadLength.put(allEdges[i].getPlayerIndex(), roadLength);
                }
            }
        }
        int longestRoad = 0;
        int longestRoadPlayerIndex = -1;
        for(int player: indexToRoadLength.keySet()) {
            if(longestRoad > indexToRoadLength.get(player)) {
                longestRoad = indexToRoadLength.get(player);
                longestRoadPlayerIndex = player;
            }
        }
        return longestRoadPlayerIndex;
    }

    public int dfs(Edge edge, boolean[] visited, int count) {
        if(visited[edge.getBoardIndex()] || edge.getAdjacentEdges().isEmpty()) return count;
        for(Edge surround: edge.getAdjacentEdges()) {
            return dfs(surround, visited, count+1);
        }
        return -1;
    }


    //also checks if taken by another player
    public static boolean maintainsDistance(Vertex vertex) {
        if(vertex.getPlayerIndex() >= 0) return true;
        return false;
    }

    public static boolean isValidEdge(Edge edge) {
        ArrayList<Vertex> playersSettlements = currentPlayer.getOwnedSettlements();
        ArrayList<Edge> playersRoads = currentPlayer.getOwnedEdges();
        for(Edge thisEdge: playersRoads) {
            for(Edge adjacentEdge: thisEdge.getAdjacentEdges()) {
                if(adjacentEdge.equals(edge)) return true;
            }
        }
        for(Vertex thisVertex: playersSettlements) {
            for(Edge adjacentEdge: thisVertex.getAdjacentEdges()) {
                if(adjacentEdge.equals(edge)) return true;
            }
        }
        return false;
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
