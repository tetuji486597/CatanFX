package com.example.settlersofcatan;

import javafx.stage.Stage;

public class ParentPanel {
    static Stage menuPanel;
    static Stage helpPanel;
    static Stage gamePanel;
    static Stage tradePanel;
    static Stage buildPanel;
    public static Stage victoryPanel;

    public static void setMenuPanel(Stage s) {menuPanel = s;}

    public static void setHelpPanel(Stage s) {helpPanel = s;}
    public static void setGamePanel(Stage s) {gamePanel = s;}

    public static void setBuildPanel(Stage s) {buildPanel = s;}
    public static void setTradePanel(Stage s) {tradePanel = s;}
    public static void setVictoryPanel(Stage s) {victoryPanel = s;}
}
