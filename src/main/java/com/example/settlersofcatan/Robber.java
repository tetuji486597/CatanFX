package com.example.settlersofcatan;

import java.util.ArrayList;

public class Robber {
    public int xCor;
    public int yCor;
    public ArrayList<Integer> robberLocation(int x, int y){
        x = xCor;
        y = yCor;
        return robLoc();
    }
    public ArrayList<Integer> robLoc(){
        return robberLocation(xCor, yCor);
    }

    public int getXCoord(){
        return xCor;
    }
    public int getYCoord(){
        return yCor;
    }
}
