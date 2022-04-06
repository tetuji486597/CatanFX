package com.example.settlersofcatan;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void showHelp(ActionEvent event) throws IOException {
        ParentPanel.helpPanel.show();
    }

    public void startGame(ActionEvent event) throws IOException {
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        FXMLLoader gameLoader = new FXMLLoader(getClass().getResource("game-board.fxml"));
        stage.setTitle("Settlers of Catan");
        Scene gameScene = new Scene(gameLoader.load());
        stage.setResizable(false);
        stage.setScene(gameScene);
        stage.show();
    }

}
