package com.example.settlersofcatan;

public class City {
    private String color;
    private Player owner;

    public City(Player owner)
    {
        this.owner = owner;
        this.color = owner.getColor();
    }
}
