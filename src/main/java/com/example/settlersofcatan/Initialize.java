package com.example.settlersofcatan;

import javafx.scene.image.Image;

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
    public static Map.Entry robber;

    public static void init() {
        robber = Map.entry("Robber", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/other/robber.png")));

        tiles = Map.ofEntries(
                Map.entry("Field", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/tiles/Field.png"))),
                Map.entry("Forest", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/tiles/Forest.png"))),
                Map.entry("Hills", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/tiles/Hills.png"))),
                Map.entry("Mountain", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/tiles/Mountain.png"))),
                Map.entry("Pasture", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/tiles/Pasture.png")))
        );

        resourceCards = Map.ofEntries(
                Map.entry("Brick", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/resourceCards/brick.png"))),
                Map.entry("Grain", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/resourceCards/grain.png"))),
                Map.entry("Ore", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/resourceCards/ore.png"))),
                Map.entry("Wood", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/resourceCards/wood.png"))),
                Map.entry("Wool", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/resourceCards/wool.png")))
        );

        buildings = Map.ofEntries(
                Map.entry("BlueCity", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/buildings/blue-city.png"))),
                Map.entry("BlueSettlement", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/buildings/blue-settlement.png"))),
                Map.entry("GreenCity", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/buildings/green-city.png"))),
                Map.entry("GreenSettlement", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/buildings/green-settlement.png"))),
                Map.entry("OrangeCity", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/buildings/orange-city.png"))),
                Map.entry("OrangeSettlement", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/buildings/orange-settlement.png"))),
                Map.entry("WhiteCity", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/buildings/white-city.png"))),
                Map.entry("WhiteSettlement", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/buildings/white-settlement.png")))
        );

        numberTokens = Map.ofEntries(
                Map.entry("A5", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/numberTokens/A5.png"))),
                Map.entry("A5", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/numberTokens/B2.png"))),
                Map.entry("A5", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/numberTokens/C6.png"))),
                Map.entry("A5", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/numberTokens/D3.png"))),
                Map.entry("A5", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/numberTokens/E8.png"))),
                Map.entry("A5", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/numberTokens/F10.png"))),
                Map.entry("A5", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/numberTokens/G9.png"))),
                Map.entry("A5", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/numberTokens/H12.png"))),
                Map.entry("A5", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/numberTokens/I11.png"))),
                Map.entry("A5", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/numberTokens/J4.png"))),
                Map.entry("A5", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/numberTokens/K8.png"))),
                Map.entry("A5", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/numberTokens/L10.png"))),
                Map.entry("A5", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/numberTokens/M9.png"))),
                Map.entry("A5", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/numberTokens/N4.png"))),
                Map.entry("A5", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/numberTokens/O5.png"))),
                Map.entry("A5", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/numberTokens/P6.png"))),
                Map.entry("A5", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/numberTokens/Q3.png"))),
                Map.entry("A5", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/numberTokens/R11.png")))
        );

        ports = Map.ofEntries(
                Map.entry("BrickPort", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/ports/BrickPort.png"))),
                Map.entry("GrainPort", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/ports/GrainPort.png"))),
                Map.entry("OrePort", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/ports/OrePort.png"))),
                Map.entry("UnknownPort", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/ports/UnknownPort.png"))),
                Map.entry("WoodPort", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/ports/WoodPort.png"))),
                Map.entry("WoolPort", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/ports/WoolPort.png")))
        );

        icons = Map.ofEntries(
                Map.entry("buildicon", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/other/buildicon.png"))),
                Map.entry("cancelicon", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/other/cancelicon.png"))),
                Map.entry("confirmicon", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/other/confirmicon.png"))),
                Map.entry("diceicon", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/other/diceicon.png"))),
                Map.entry("endicon", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/other/endicon.png"))),
                Map.entry("helpicon", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/other/helpicon.png"))),
                Map.entry("robicon", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/other/robicon.png"))),
                Map.entry("tradeicon", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/other/tradeicon.png")))
        );
    }
}
