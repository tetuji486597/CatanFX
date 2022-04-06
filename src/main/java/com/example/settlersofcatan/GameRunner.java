package com.example.settlersofcatan;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class GameRunner extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        Stage help = new Stage();
        FXMLLoader helpLoader = new FXMLLoader(getClass().getResource("help.fxml"));
        help.setTitle("How to Play");
        Scene helpScene = new Scene(helpLoader.load());
        help.setScene(helpScene);
        ParentPanel.setHelpPanel(help);
        help.setResizable(false);
        Initialize.init();
    }

    public static void main(String[] args) {
        launch();
    }
}