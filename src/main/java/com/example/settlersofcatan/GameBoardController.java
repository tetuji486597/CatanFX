package com.example.settlersofcatan;

import javafx.fxml.FXML;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GameBoardController {

    public static Label[] playerNumLabels;
    public static ImageView[] playerLabels;
    public static ImageView[] playerImages;
    public static Rectangle[] devDecks;
    public static Rectangle[] resDecks;
    public static Rectangle[] EdgeMarkers;
    public static Rectangle[] VertexMarkers;
    public static HashMap<int[], ImageView> tilesMap;
    public static HashMap<String, ImageView> color2label;
    public static HashMap<ImageView, ImageView> label2icon;
    public static HashMap<ImageView, Rectangle> label2resdeck;
    public static HashMap<ImageView, Rectangle> label2devdeck;
    public static ImageView[] tileViews;
    public static ImageView[] portViews;
    public static ImageView[] tokenViews;


    @FXML
    private ImageView BlueColorLabel;

    @FXML
    private Rectangle BlueDevDeck;

    @FXML
    private ImageView BlueIcon;

    @FXML
    private Rectangle BlueResourceDeck;

    @FXML
    private ImageView BrickCard;

    @FXML
    private Label BrickLabel;

    @FXML
    private Button BuildButton;

    @FXML
    private Button CancelButton;

    @FXML
    private Button ConfirmButton;

    @FXML
    private ImageView DevCard;

    @FXML
    private Label DevLabel;

    @FXML
    private ImageView EdgeMarker;

    @FXML
    private Rectangle EdgeMarker0;

    @FXML
    private Rectangle EdgeMarker1;

    @FXML
    private Rectangle EdgeMarker10;

    @FXML
    private Rectangle EdgeMarker11;

    @FXML
    private Rectangle EdgeMarker12;

    @FXML
    private Rectangle EdgeMarker13;

    @FXML
    private Rectangle EdgeMarker14;

    @FXML
    private Rectangle EdgeMarker15;

    @FXML
    private Rectangle EdgeMarker16;

    @FXML
    private Rectangle EdgeMarker17;

    @FXML
    private Rectangle EdgeMarker18;

    @FXML
    private Rectangle EdgeMarker19;

    @FXML
    private Rectangle EdgeMarker2;

    @FXML
    private Rectangle EdgeMarker20;

    @FXML
    private Rectangle EdgeMarker21;

    @FXML
    private Rectangle EdgeMarker22;

    @FXML
    private Rectangle EdgeMarker23;

    @FXML
    private Rectangle EdgeMarker24;

    @FXML
    private Rectangle EdgeMarker25;

    @FXML
    private Rectangle EdgeMarker26;

    @FXML
    private Rectangle EdgeMarker27;

    @FXML
    private Rectangle EdgeMarker28;

    @FXML
    private Rectangle EdgeMarker29;

    @FXML
    private Rectangle EdgeMarker3;

    @FXML
    private Rectangle EdgeMarker30;

    @FXML
    private Rectangle EdgeMarker31;

    @FXML
    private Rectangle EdgeMarker32;

    @FXML
    private Rectangle EdgeMarker33;

    @FXML
    private Rectangle EdgeMarker34;

    @FXML
    private Rectangle EdgeMarker35;

    @FXML
    private Rectangle EdgeMarker36;

    @FXML
    private Rectangle EdgeMarker37;

    @FXML
    private Rectangle EdgeMarker38;

    @FXML
    private Rectangle EdgeMarker39;

    @FXML
    private Rectangle EdgeMarker4;

    @FXML
    private Rectangle EdgeMarker40;

    @FXML
    private Rectangle EdgeMarker41;

    @FXML
    private Rectangle EdgeMarker42;

    @FXML
    private Rectangle EdgeMarker43;

    @FXML
    private Rectangle EdgeMarker44;

    @FXML
    private Rectangle EdgeMarker45;

    @FXML
    private Rectangle EdgeMarker46;

    @FXML
    private Rectangle EdgeMarker47;

    @FXML
    private Rectangle EdgeMarker48;

    @FXML
    private Rectangle EdgeMarker49;

    @FXML
    private Rectangle EdgeMarker5;

    @FXML
    private Rectangle EdgeMarker50;

    @FXML
    private Rectangle EdgeMarker51;

    @FXML
    private Rectangle EdgeMarker52;

    @FXML
    private Rectangle EdgeMarker53;

    @FXML
    private Rectangle EdgeMarker54;

    @FXML
    private Rectangle EdgeMarker55;

    @FXML
    private Rectangle EdgeMarker56;

    @FXML
    private Rectangle EdgeMarker57;

    @FXML
    private Rectangle EdgeMarker58;

    @FXML
    private Rectangle EdgeMarker59;

    @FXML
    private Rectangle EdgeMarker6;

    @FXML
    private Rectangle EdgeMarker60;

    @FXML
    private Rectangle EdgeMarker61;

    @FXML
    private Rectangle EdgeMarker62;

    @FXML
    private Rectangle EdgeMarker63;

    @FXML
    private Rectangle EdgeMarker64;

    @FXML
    private Rectangle EdgeMarker65;

    @FXML
    private Rectangle EdgeMarker66;

    @FXML
    private Rectangle EdgeMarker67;

    @FXML
    private Rectangle EdgeMarker68;

    @FXML
    private Rectangle EdgeMarker69;

    @FXML
    private Rectangle EdgeMarker7;

    @FXML
    private Rectangle EdgeMarker70;

    @FXML
    private Rectangle EdgeMarker71;

    @FXML
    private Rectangle EdgeMarker8;

    @FXML
    private Rectangle EdgeMarker9;

    @FXML
    private Button EndTurnButton;

    @FXML
    private ImageView GrainCard;

    @FXML
    private Label GrainLabel;

    @FXML
    private ImageView GreenColorLabel;

    @FXML
    private Rectangle GreenDevDeck;

    @FXML
    private ImageView GreenIcon;

    @FXML
    private Rectangle GreenResourceDeck;

    @FXML
    private Button HelpButton;

    @FXML
    private ImageView OreCard;

    @FXML
    private Label OreLabel;

    @FXML
    private Label Player1Label;

    @FXML
    private Label Player2Label;

    @FXML
    private Label Player3Label;

    @FXML
    private Label Player4Label;

    @FXML
    private Button StealButton;

    @FXML
    private Button TradeButton;

    @FXML
    private Rectangle VertexMarker0;

    @FXML
    private Rectangle VertexMarker1;

    @FXML
    private Rectangle VertexMarker10;

    @FXML
    private Rectangle VertexMarker11;

    @FXML
    private Rectangle VertexMarker12;

    @FXML
    private Rectangle VertexMarker13;

    @FXML
    private Rectangle VertexMarker14;

    @FXML
    private Rectangle VertexMarker15;

    @FXML
    private Rectangle VertexMarker16;

    @FXML
    private Rectangle VertexMarker17;

    @FXML
    private Rectangle VertexMarker18;

    @FXML
    private Rectangle VertexMarker19;

    @FXML
    private Rectangle VertexMarker2;

    @FXML
    private Rectangle VertexMarker20;

    @FXML
    private Rectangle VertexMarker21;

    @FXML
    private Rectangle VertexMarker22;

    @FXML
    private Rectangle VertexMarker23;

    @FXML
    private Rectangle VertexMarker24;

    @FXML
    private Rectangle VertexMarker25;

    @FXML
    private Rectangle VertexMarker26;

    @FXML
    private Rectangle VertexMarker27;

    @FXML
    private Rectangle VertexMarker28;

    @FXML
    private Rectangle VertexMarker29;

    @FXML
    private Rectangle VertexMarker3;

    @FXML
    private Rectangle VertexMarker30;

    @FXML
    private Rectangle VertexMarker31;

    @FXML
    private Rectangle VertexMarker32;

    @FXML
    private Rectangle VertexMarker33;

    @FXML
    private Rectangle VertexMarker34;

    @FXML
    private Rectangle VertexMarker35;

    @FXML
    private Rectangle VertexMarker36;

    @FXML
    private Rectangle VertexMarker37;

    @FXML
    private Rectangle VertexMarker38;

    @FXML
    private Rectangle VertexMarker39;

    @FXML
    private Rectangle VertexMarker4;

    @FXML
    private Rectangle VertexMarker40;

    @FXML
    private Rectangle VertexMarker41;

    @FXML
    private Rectangle VertexMarker42;

    @FXML
    private Rectangle VertexMarker43;

    @FXML
    private Rectangle VertexMarker44;

    @FXML
    private Rectangle VertexMarker45;

    @FXML
    private Rectangle VertexMarker46;

    @FXML
    private Rectangle VertexMarker47;

    @FXML
    private Rectangle VertexMarker48;

    @FXML
    private Rectangle VertexMarker49;

    @FXML
    private Rectangle VertexMarker5;

    @FXML
    private Rectangle VertexMarker50;

    @FXML
    private Rectangle VertexMarker51;

    @FXML
    private Rectangle VertexMarker52;

    @FXML
    private Rectangle VertexMarker53;

    @FXML
    private Rectangle VertexMarker6;

    @FXML
    private Rectangle VertexMarker7;

    @FXML
    private Rectangle VertexMarker8;

    @FXML
    private Rectangle VertexMarker9;

    @FXML
    private ImageView WhiteColorLabel;

    @FXML
    private Rectangle WhiteDevDeck;

    @FXML
    private ImageView WhiteIcon;

    @FXML
    private Rectangle WhiteResourceDeck;

    @FXML
    private ImageView WoodCard;

    @FXML
    private Label WoodLabel;

    @FXML
    private ImageView WoolCard;

    @FXML
    private Label WoolLabel;

    @FXML
    private ImageView RedColorLabel;

    @FXML
    private Rectangle RedDevDeck;

    @FXML
    private ImageView RedIcon;

    @FXML
    private Rectangle RedResourceDeck;

    @FXML
    private ImageView boardBase;

    @FXML
    private ImageView p1;

    @FXML
    private ImageView p2;

    @FXML
    private ImageView p3;

    @FXML
    private ImageView p4;

    @FXML
    private ImageView p5;

    @FXML
    private ImageView p6;

    @FXML
    private ImageView p7;

    @FXML
    private ImageView p8;

    @FXML
    private ImageView p9;

    @FXML
    private ImageView r0c0;

    @FXML
    private ImageView r0c1;

    @FXML
    private ImageView r0c2;

    @FXML
    private ImageView r1c0;

    @FXML
    private ImageView r1c1;

    @FXML
    private ImageView r1c2;

    @FXML
    private ImageView r1c3;

    @FXML
    private ImageView r2c0;

    @FXML
    private ImageView r2c1;

    @FXML
    private ImageView r2c2;

    @FXML
    private ImageView r2c3;

    @FXML
    private ImageView r2c4;

    @FXML
    private ImageView r3c0;

    @FXML
    private ImageView r3c1;

    @FXML
    private ImageView r3c2;

    @FXML
    private ImageView r3c3;

    @FXML
    private ImageView r4c0;

    @FXML
    private ImageView r4c1;

    @FXML
    private ImageView r4c2;

    @FXML
    private Button startButton;

    @FXML
    private ImageView tokenA;

    @FXML
    private ImageView tokenB;

    @FXML
    private ImageView tokenC;

    @FXML
    private ImageView tokenD;

    @FXML
    private ImageView tokenE;

    @FXML
    private ImageView tokenF;

    @FXML
    private ImageView tokenG;

    @FXML
    private ImageView tokenH;

    @FXML
    private ImageView tokenI;

    @FXML
    private ImageView tokenJ;

    @FXML
    private ImageView tokenK;

    @FXML
    private ImageView tokenL;

    @FXML
    private ImageView tokenM;

    @FXML
    private ImageView tokenN;

    @FXML
    private ImageView tokenO;

    @FXML
    private ImageView tokenP;

    @FXML
    private ImageView tokenQ;

    @FXML
    private ImageView tokenR;

    @FXML
    private Button RollDiceButton;

    @FXML
    public void initialize() throws FileNotFoundException{
        GameState.controller = this;

        color2label = new HashMap<>();
        label2icon = new HashMap<>();
        label2resdeck = new HashMap<>();
        label2devdeck = new HashMap<>();

        color2label.put("Blue", BlueColorLabel);
        color2label.put("Green", GreenColorLabel);
        color2label.put("White", WhiteColorLabel);
        color2label.put("Red", RedColorLabel);

        label2icon.put(BlueColorLabel, BlueIcon);
        label2icon.put(GreenColorLabel, GreenIcon);
        label2icon.put(WhiteColorLabel, WhiteIcon);
        label2icon.put(RedColorLabel, RedIcon);

        label2resdeck.put(BlueColorLabel, BlueResourceDeck);
        label2resdeck.put(GreenColorLabel, GreenResourceDeck);
        label2resdeck.put(WhiteColorLabel, WhiteResourceDeck);
        label2resdeck.put(RedColorLabel, RedResourceDeck);

        label2devdeck.put(BlueColorLabel, BlueDevDeck);
        label2devdeck.put(GreenColorLabel, GreenDevDeck);
        label2devdeck.put(WhiteColorLabel, WhiteDevDeck);
        label2devdeck.put(RedColorLabel, RedDevDeck);

        playerNumLabels = new Label[] {Player1Label, Player2Label, Player3Label, Player4Label};
        resDecks = new Rectangle[]{BlueResourceDeck, GreenResourceDeck, WhiteResourceDeck, RedResourceDeck};
        devDecks = new Rectangle[]{BlueDevDeck, GreenDevDeck, WhiteDevDeck, RedDevDeck};
        playerLabels = new ImageView[] {GreenColorLabel, WhiteColorLabel, RedColorLabel, BlueColorLabel};
        playerImages = new ImageView[] {GreenIcon, WhiteIcon, BlueIcon, RedIcon};
        tileViews = new ImageView[] {r0c0,r0c1,r0c2,r1c0,r1c1,r1c2,r1c3,r2c0,r2c1,r2c2,r2c3,r2c4,r3c0,r3c1,r3c2,r3c3,r4c0,r4c1,r4c2};
        portViews = new ImageView[]{p1,p2,p3,p4,p5,p6,p7,p8,p9};
        EdgeMarkers = new Rectangle[] {EdgeMarker0,EdgeMarker1,EdgeMarker2,EdgeMarker3,EdgeMarker4,EdgeMarker5,EdgeMarker6,EdgeMarker7,EdgeMarker8,EdgeMarker9,EdgeMarker10,EdgeMarker11,EdgeMarker12,EdgeMarker13,EdgeMarker14,EdgeMarker15,EdgeMarker16,EdgeMarker17,EdgeMarker18,EdgeMarker19,EdgeMarker20,EdgeMarker21,EdgeMarker22,EdgeMarker23,EdgeMarker24,EdgeMarker25,EdgeMarker26,EdgeMarker27,EdgeMarker28,EdgeMarker29,EdgeMarker30,EdgeMarker31,EdgeMarker32,EdgeMarker33,EdgeMarker34,EdgeMarker35,EdgeMarker36,EdgeMarker37,EdgeMarker38,EdgeMarker39,EdgeMarker40,EdgeMarker41,EdgeMarker42,EdgeMarker43,EdgeMarker44,EdgeMarker45,EdgeMarker46,EdgeMarker47,EdgeMarker48,EdgeMarker49,EdgeMarker50,EdgeMarker51,EdgeMarker52,EdgeMarker53,EdgeMarker54,EdgeMarker55,EdgeMarker56,EdgeMarker57,EdgeMarker58,EdgeMarker59,EdgeMarker60,EdgeMarker61,EdgeMarker62,EdgeMarker63,EdgeMarker64,EdgeMarker65,EdgeMarker66,EdgeMarker67,EdgeMarker68,EdgeMarker69,EdgeMarker70,EdgeMarker71};
        VertexMarkers = new Rectangle[] {VertexMarker0,VertexMarker1,VertexMarker2,VertexMarker3,VertexMarker4,VertexMarker5,VertexMarker6,VertexMarker7,VertexMarker8,VertexMarker9,VertexMarker10,VertexMarker11,VertexMarker12,VertexMarker13,VertexMarker14,VertexMarker15,VertexMarker16,VertexMarker17,VertexMarker18,VertexMarker19,VertexMarker20,VertexMarker21,VertexMarker22,VertexMarker23,VertexMarker24,VertexMarker25,VertexMarker26,VertexMarker27,VertexMarker28,VertexMarker29,VertexMarker30,VertexMarker31,VertexMarker32,VertexMarker33,VertexMarker34,VertexMarker35,VertexMarker36,VertexMarker37,VertexMarker38,VertexMarker39,VertexMarker40,VertexMarker41,VertexMarker42,VertexMarker43,VertexMarker44,VertexMarker45,VertexMarker46,VertexMarker47,VertexMarker48,VertexMarker49,VertexMarker50,VertexMarker51,VertexMarker52,VertexMarker53};
        tokenViews = new ImageView[] {tokenA, tokenB, tokenC, tokenD, tokenE, tokenF, tokenG, tokenH, tokenI, tokenJ, tokenK, tokenL, tokenM, tokenN, tokenO, tokenP, tokenQ, tokenR};

        for(Label label: playerNumLabels) {
            label.setVisible(false);
        }
        for(ImageView image: tokenViews) {
            image.setVisible(false);
        }
        for(ImageView image: playerLabels) {
            image.setVisible(false);
        }
        for(ImageView image: playerImages) {
            image.setVisible(false);
        }
        for(ImageView image: tileViews) {
            image.setVisible(false);
        }
        for(ImageView image: portViews) {
            image.setVisible(false);
        }
        for(Rectangle rect: EdgeMarkers) {
            rect.setVisible(false);
        }
        for(Rectangle rect: VertexMarkers) {
            rect.setVisible(false);
        }
        for(Rectangle rect: resDecks) {
            rect.setVisible(false);
        }
        for(Rectangle rect: devDecks) {
            rect.setVisible(false);
        }


    }
    @FXML
    public void startGame() {
        startButton.setVisible(false);
        Tile[] tiles = GameState.tiles;
        for(int i = 0; i < tileViews.length; i++) {
            tileViews[i].setImage(tiles[i].getImage());
        }
        for(ImageView image: tileViews) {
            image.setVisible(true);
        }
        Port[] ports = GameState.ports;
        for(int i = 0; i < portViews.length; i++) {
            portViews[i].setImage(ports[i].getImage());
        }
        for(ImageView image: portViews) {
            image.setVisible(true);
        }
        for(ImageView image: tokenViews) {
            image.setVisible(true);
        }
        int numPlayers = GameState.numPlayers;
        String[] colors = GameState.allColors;
        for(int i = 0; i < numPlayers; i++) {
            ImageView label = color2label.get(colors[i]);
            playerNumLabels[i].setVisible(true);
            label.setVisible(true);
            label2icon.get(label).setVisible(true);
            label2resdeck.get(label).setVisible(true);
            label2devdeck.get(label).setVisible(true);
        }
        ConfirmButton.setTooltip(new Tooltip("Confirm a trade with another player"));
        CancelButton.setTooltip(new Tooltip("Cancel a trade with another player"));
        BuildButton.setTooltip(new Tooltip("Open the build panel and start building!"));
        TradeButton.setTooltip(new Tooltip("Open the trade panel and trade your resources!"));
        StealButton.setTooltip(new Tooltip("Steal from another player"));
        EndTurnButton.setTooltip(new Tooltip("End this turn"));
        HelpButton.setTooltip(new Tooltip("Open help menu"));
        Tooltip diceButtonTip = new Tooltip("Roll Dice!");
        diceButtonTip.setStyle("-fx-font-size: 15");
        RollDiceButton.setTooltip(diceButtonTip);
    }

    @FXML
    public void showHelp() {
        ParentPanel.helpPanel.show();
    }

    @FXML
    public void showTrade() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Trade.fxml"));
        Scene tradeScene = new Scene(fxmlLoader.load());
        stage.setTitle("Trade");
        stage.setResizable(false);
        stage.setScene(tradeScene);
        ParentPanel.setTradePanel(stage);
        stage.show();
    }

    @FXML
    public void showResourceView() {

    }

    @FXML
    public void showDevView() {

    }

    //edge marker clcieked adn vertex marker clicked
}
