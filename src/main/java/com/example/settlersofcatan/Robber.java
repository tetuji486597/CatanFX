package com.example.settlersofcatan;

import java.util.ArrayList;
import javafx.scene.image.Image;

public class Robber {
    private int xCor;
    private int yCor;
    private String robber;
    private javafx.scene.image.Image Robber;

    public Robber (String str, Image img){
        Robber = img;
        robber = str;
    }

    public ArrayList<Integer> robberLocation(int x, int y){
        x = xCor;
        y = yCor;
        return robLoc();
    }
    private ArrayList<Integer> robLoc(){
        return robberLocation(xCor, yCor);
    }

    public int getXCoord(){
        return xCor;
    }
    public int getYCoord(){
        return yCor;
    }
}
