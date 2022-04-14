package com.example.settlersofcatan;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TabPane;
import javafx.scene.control.Tooltip;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {

    @FXML
    private ComboBox<String> dropdown;

    @FXML
    private TabPane tabPane;

    public void showHelp(ActionEvent event) throws IOException {
        ParentPanel.helpPanel.show();
    }

    public void startGame(ActionEvent event) throws IOException {
        String numPlayers = dropdown.getValue();
        if(numPlayers.isEmpty()) throw new NumberFormatException();
        System.out.println("number of players: " + numPlayers);
        ParentPanel.menuPanel.hide();
        Stage game = new Stage();
        FXMLLoader gameLoader = new FXMLLoader(getClass().getResource("game-board.fxml"));
        game.setTitle("Settlers of Catan");//
        Scene gameScene = new Scene(gameLoader.load());
        game.setResizable(false);
        game.setScene(gameScene);
        ParentPanel.setGamePanel(game);
        ParentPanel.gamePanel.show();
        GameState gameState = new GameState(Integer.parseInt(numPlayers));
    }
}
