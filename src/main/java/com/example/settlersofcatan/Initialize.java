package com.example.settlersofcatan;

import javafx.scene.image.Image;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Initialize {
    //add desert tile
    public static Map<String, Image> tiles = new HashMap<>();
    public static Map<String, Image> resourceCards = new HashMap<>();
    public static Map<String, Image> buildings = new HashMap<>();
    public static Map<String, Image> numberTokens = new HashMap<>();
    public static Map<String, Image> ports = new HashMap<>();
    public static Map<String, Image> icons = new HashMap<>();
    public static Map<String, Image> players = new HashMap<>();
    public static Map<String, Image> devCards = new HashMap<>();
    public static Map.Entry robber;

    public static void init() throws IOException {
        //look into relative path
        robber = Map.entry("Robber", new Image(Initialize.class.getResourceAsStream("/images/other/robber.png")));

        tiles = Map.ofEntries(
                Map.entry("Field", new Image(Initialize.class.getResourceAsStream("/images/tiles/Field.png"))),
                Map.entry("Forest", new Image(Initialize.class.getResourceAsStream("/images/tiles/Forest.png"))),
                Map.entry("Hills", new Image(Initialize.class.getResourceAsStream("/images/tiles/Hills.png"))),
                Map.entry("Mountain", new Image(Initialize.class.getResourceAsStream("/images/tiles/Mountain.png"))),
                Map.entry("Pasture", new Image(Initialize.class.getResourceAsStream("/images/tiles/Pasture.png"))),
                Map.entry("Desert", new Image(Initialize.class.getResourceAsStream("/images/tiles/desert.png")))
        );

        resourceCards = Map.ofEntries(
                Map.entry("Brick", new Image(Initialize.class.getResourceAsStream("/images/resourceCards/brick.png"))),
                Map.entry("Grain", new Image(Initialize.class.getResourceAsStream("/images/resourceCards/grain.png"))),
                Map.entry("Ore", new Image(Initialize.class.getResourceAsStream("/images/resourceCards/ore.png"))),
                Map.entry("Wood", new Image(Initialize.class.getResourceAsStream("/images/resourceCards/wood.png"))),
                Map.entry("Wool", new Image(Initialize.class.getResourceAsStream("/images/resourceCards/wool.png"))),
                Map.entry("Back", new Image(Initialize.class.getResourceAsStream("/images/resourceCards/back.png"))),
                Map.entry("BuildManual", new Image(Initialize.class.getResourceAsStream("/images/resourceCards/buildmanual.png")))
        );

        devCards = Map.ofEntries(
                Map.entry("Chapel", new Image(Initialize.class.getResourceAsStream("/images/devCards/Chapel.jpg"))),
                Map.entry("GreatHall", new Image(Initialize.class.getResourceAsStream("/images/devCards/GreatHall.jpg"))),
                Map.entry("Knight", new Image(Initialize.class.getResourceAsStream("/images/devCards/Knight.jpg"))),
                Map.entry("Library", new Image(Initialize.class.getResourceAsStream("/images/devCards/Library.jpg"))),
                Map.entry("Market", new Image(Initialize.class.getResourceAsStream("/images/devCards/Market.jpg"))),
                Map.entry("Monopoly", new Image(Initialize.class.getResourceAsStream("/images/devCards/Monopoly.jpg"))),
                Map.entry("RoadBuilding", new Image(Initialize.class.getResourceAsStream("/images/devCards/RoadBuilding.jpg"))),
                Map.entry("University", new Image(Initialize.class.getResourceAsStream("/images/devCards/University.jpg"))),
                Map.entry("YearOfPlenty", new Image(Initialize.class.getResourceAsStream("/images/devCards/YearOfPlenty.jpg")))
        );

        buildings = Map.ofEntries(
                Map.entry("BlueCity", new Image(Initialize.class.getResourceAsStream("/images/buildings/blue-city.png"))),
                Map.entry("BlueSettlement", new Image(Initialize.class.getResourceAsStream("/images/buildings/blue-settlement.png"))),
                Map.entry("GreenCity", new Image(Initialize.class.getResourceAsStream("/images/buildings/green-city.png"))),
                Map.entry("GreenSettlement", new Image(Initialize.class.getResourceAsStream("/images/buildings/green-settlement.png"))),
                Map.entry("RedCity", new Image(Initialize.class.getResourceAsStream("/images/buildings/red-city.png"))),
                Map.entry("RedSettlement", new Image(Initialize.class.getResourceAsStream("/images/buildings/red-settlement.png"))),
                Map.entry("WhiteCity", new Image(Initialize.class.getResourceAsStream("/images/buildings/white-city.png"))),
                Map.entry("WhiteSettlement", new Image(Initialize.class.getResourceAsStream("/images/buildings/white-settlement.png")))
        );

        numberTokens = Map.ofEntries(
                Map.entry("A5", new Image(Initialize.class.getResourceAsStream("/images/numberTokens/A5.png"))),
                Map.entry("B2", new Image(Initialize.class.getResourceAsStream("/images/numberTokens/B2.png"))),
                Map.entry("C6", new Image(Initialize.class.getResourceAsStream("/images/numberTokens/C6.png"))),
                Map.entry("D3", new Image(Initialize.class.getResourceAsStream("/images/numberTokens/D3.png"))),
                Map.entry("E8", new Image(Initialize.class.getResourceAsStream("/images/numberTokens/E8.png"))),
                Map.entry("F10", new Image(Initialize.class.getResourceAsStream("/images/numberTokens/F10.png"))),
                Map.entry("G9", new Image(Initialize.class.getResourceAsStream("/images/numberTokens/G9.png"))),
                Map.entry("H12", new Image(Initialize.class.getResourceAsStream("/images/numberTokens/H12.png"))),
                Map.entry("I11", new Image(Initialize.class.getResourceAsStream("/images/numberTokens/I11.png"))),
                Map.entry("J4", new Image(Initialize.class.getResourceAsStream("/images/numberTokens/J4.png"))),
                Map.entry("K8", new Image(Initialize.class.getResourceAsStream("/images/numberTokens/K8.png"))),
                Map.entry("L10", new Image(Initialize.class.getResourceAsStream("/images/numberTokens/L10.png"))),
                Map.entry("M9", new Image(Initialize.class.getResourceAsStream("/images/numberTokens/M9.png"))),
                Map.entry("N4", new Image(Initialize.class.getResourceAsStream("/images/numberTokens/N4.png"))),
                Map.entry("O5", new Image(Initialize.class.getResourceAsStream("/images/numberTokens/O5.png"))),
                Map.entry("P6", new Image(Initialize.class.getResourceAsStream("/images/numberTokens/P6.png"))),
                Map.entry("Q3", new Image(Initialize.class.getResourceAsStream("/images/numberTokens/Q3.png"))),
                Map.entry("R11", new Image(Initialize.class.getResourceAsStream("/images/numberTokens/R11.png")))
        );

        ports = Map.ofEntries(
                Map.entry("BrickPort", new Image(Initialize.class.getResourceAsStream("/images/ports/BrickPort.png"))),
                Map.entry("GrainPort", new Image(Initialize.class.getResourceAsStream("/images/ports/GrainPort.png"))),
                Map.entry("OrePort", new Image(Initialize.class.getResourceAsStream("/images/ports/OrePort.png"))),
                Map.entry("UnknownPort", new Image(Initialize.class.getResourceAsStream("/images/ports/UnknownPort.png"))),
                Map.entry("WoodPort", new Image(Initialize.class.getResourceAsStream("/images/ports/WoodPort.png"))),
                Map.entry("WoolPort", new Image(Initialize.class.getResourceAsStream("/images/ports/WoolPort.png")))
        );

        icons = Map.ofEntries(
                Map.entry("buildicon", new Image(Initialize.class.getResourceAsStream("/images/other/buildicon.png"))),
                Map.entry("cancelicon", new Image(Initialize.class.getResourceAsStream("/images/other/cancelicon.png"))),
                Map.entry("confirmicon", new Image(Initialize.class.getResourceAsStream("/images/other/confirmicon.png"))),
                Map.entry("diceicon", new Image(Initialize.class.getResourceAsStream("/images/other/diceicon2.png"))),
                Map.entry("endicon", new Image(Initialize.class.getResourceAsStream("/images/other/endicon.png"))),
                Map.entry("helpicon", new Image(Initialize.class.getResourceAsStream("/images/other/helpicon.png"))),
                Map.entry("robicon", new Image(Initialize.class.getResourceAsStream("/images/other/robicon.png"))),
                Map.entry("tradeicon", new Image(Initialize.class.getResourceAsStream("/images/other/tradeicon.png")))
        );

        players = Map.ofEntries(
                Map.entry("white", new Image(Initialize.class.getResourceAsStream("/images/players/white.png"))),
                Map.entry("blue", new Image(Initialize.class.getResourceAsStream("/images/players/blue.png"))),
                Map.entry("green", new Image(Initialize.class.getResourceAsStream("/images/players/green.png"))),
                Map.entry("red", new Image(Initialize.class.getResourceAsStream("/images/players/red.png")))
        );
    }
}