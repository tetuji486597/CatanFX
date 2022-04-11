package com.example.settlersofcatan;
import java.util.ArrayList;

public class ResourceCard {
    private javafx.scene.image.Image resourceImage;
    private ArrayList<String> getResCards;
    private static String resCards[];

    public ResourceCard(){
        resCards = new String[] {"Lumber","Brick","Grain","Ore","Wool"};
    }

    private void getResource(Player player, String x){
        getResCards.add(x);
        player.resDeck.add(x);
    }
}
