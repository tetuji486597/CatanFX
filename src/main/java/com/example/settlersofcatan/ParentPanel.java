package com.example.settlersofcatan;

import javafx.stage.Stage;

public class ParentPanel {
    static Stage helpPanel;
    static Stage gamePanel;
    public static Stage victoryPanel;

    public static void setHelpPanel(Stage s) {helpPanel = s;}
    public static void setGamePanel(Stage s) {gamePanel = s;}
    public static void setVictoryPanel(Stage s) {victoryPanel = s;}
}
