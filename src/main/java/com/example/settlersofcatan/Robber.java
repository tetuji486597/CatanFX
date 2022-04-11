package com.example.settlersofcatan;

import java.util.ArrayList;

public class Robber {
    public int xCor;
    public int yCor;
    public int zCor;
    public ArrayList<Integer> robberLocation(int x, int y, int z){
        x = xCor;
        y = yCor;
        z = zCor;
        return robLoc();
    }
    public ArrayList<Integer> robLoc(){
        return robberLocation(xCor, yCor, zCor);
    }

    public int getXCoord(){
        return xCor;
    }
    public int getYCoord(){
        return yCor;
    }
    public int getZCoord(){
        return zCor;
    }
}
