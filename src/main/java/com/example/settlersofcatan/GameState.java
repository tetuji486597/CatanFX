package com.example.settlersofcatan;

import java.util.ArrayList;
import java.util.Random;

public class GameState{

    public static int numPlayers;
    Random rand = new Random();
    ArrayList<Player> playerList = new ArrayList<>();
    Player currentPlayer;

    public GameState(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public void shuffle(ArrayList<Tile> tiles){

    }
    public int rollDice(){
        //sum of 2 independent dice
        int die1 = rand.nextInt(6);
        int die2 = rand.nextInt(6);
        int diceRoll = die1+die2;
        return diceRoll;
    }
    public void sevenRolled(){

    }
    public void giveResources(){

    }
    public void incrementVictory(Player Player){
        Player.setVictoryPoints(Player.getVictoryPoints() + 1);
    }
    public void setUp(){

    }
    public Player nextPlayer(){
        return currentPlayer;
    }
}
