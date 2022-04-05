package com.example.settlersofcatan;

import javafx.scene.image.Image;

import java.util.HashMap;
import java.util.Map;

public class Initialize {
    public static Map<String, Image> tiles = new HashMap<>();
    public static Map<String, Image> resourceCards = new HashMap<>();
    public static Map<String, Image> buildings = new HashMap<>();
    public static Map<String, Image> numberTokens = new HashMap<>();
    public static Map<String, Image> robber = new HashMap<>();

    public static void init() {
        tiles = Map.ofEntries(
                Map.entry("Field", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/tiles/Field.png"))),
                Map.entry("Forest", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/tiles/Forest.png"))),
                Map.entry("Hills", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/tiles/Hills.png"))),
                Map.entry("Mountain", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/tiles/Mountain.png"))),
                Map.entry("Pasture", new Image(Initialize.class.getClassLoader().getResourceAsStream("images/tiles/Pasture.png")))
        );

        resourceCards = Map.ofEntries(

        )
    }
}
