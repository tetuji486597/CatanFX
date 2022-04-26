package com.example.settlersofcatan;

import javafx.animation.*;
import javafx.fxml.FXML;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

public class GameBoardController {

    public static Label[] playerNumLabels;
    public static ImageView[] playerLabels;
    public static ImageView[] playerImages;
    public static Rectangle[] devDecks;
    public static Rectangle[] resDecks;
    public static Rectangle[] EdgeMarkers;
    public static Rectangle[] VertexMarkers;
    public static ImageView[] numberTokens;
    public static HashMap<int[], ImageView> tokenMap;
    public static HashMap<String, ImageView> color2label;
    public static HashMap<ImageView, ImageView> label2icon;
    public static HashMap<ImageView, Rectangle> label2resdeck;
    public static HashMap<ImageView, Rectangle> label2devdeck;
    public static ImageView[] resNdevLabels;
    public static ImageView[] tileViews;
    public static ImageView[] portViews;
    public static ImageView[] tokenViews;
    public static ImageView[] playerCards;
//

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
    private ImageView PlayerCard1;

    @FXML
    private ImageView PlayerCard10;

    @FXML
    private ImageView PlayerCard11;

    @FXML
    private ImageView PlayerCard12;

    @FXML
    private ImageView PlayerCard13;

    @FXML
    private ImageView PlayerCard14;

    @FXML
    private ImageView PlayerCard15;

    @FXML
    private ImageView PlayerCard16;

    @FXML
    private ImageView PlayerCard17;

    @FXML
    private ImageView PlayerCard18;

    @FXML
    private ImageView PlayerCard19;

    @FXML
    private ImageView PlayerCard2;

    @FXML
    private ImageView PlayerCard20;

    @FXML
    private ImageView PlayerCard21;

    @FXML
    private ImageView PlayerCard3;

    @FXML
    private ImageView PlayerCard4;

    @FXML
    private ImageView PlayerCard5;

    @FXML
    private ImageView PlayerCard6;

    @FXML
    private ImageView PlayerCard7;

    @FXML
    private ImageView PlayerCard8;

    @FXML
    private ImageView PlayerCard9;

    @FXML
    private Label ResourceViewText;

    @FXML
    private DialogPane ResourcePanel;

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
    private ImageView devLabel1;

    @FXML
    private ImageView devLabel2;

    @FXML
    private ImageView devLabel3;

    @FXML
    private ImageView devLabel4;

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
    private ImageView resLabel1;

    @FXML
    private ImageView resLabel2;

    @FXML
    private ImageView resLabel3;

    @FXML
    private ImageView resLabel4;

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
    private ImageView tokenNull;

    @FXML
    private Button RollDiceButton;

    @FXML
    private TextArea ActivityLog;

    @FXML
    private Label MainLabel;

    @FXML
    private DialogPane Trade4For1;

    @FXML
    private DialogPane TradeMenu;
    @FXML
    private Button bankButton;
    @FXML
    private Button portButton;

    @FXML
    private Button otherButton;

    @FXML
    public void initialize() throws FileNotFoundException{
        GameState.controller = this;
        color2label = new HashMap<>();
        label2icon = new HashMap<>();
        label2resdeck = new HashMap<>();
        label2devdeck = new HashMap<>();
        tokenMap = new HashMap<>();

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
        resNdevLabels = new ImageView[] {resLabel1, devLabel1, resLabel2, devLabel2, resLabel3, devLabel3, resLabel4, devLabel4};
        playerImages = new ImageView[] {GreenIcon, WhiteIcon, BlueIcon, RedIcon};
        tileViews = new ImageView[] {r0c0,r0c1,r0c2,r1c0,r1c1,r1c2,r1c3,r2c0,r2c1,r2c2,r2c3,r2c4,r3c0,r3c1,r3c2,r3c3,r4c0,r4c1,r4c2};
        portViews = new ImageView[]{p1,p2,p3,p4,p5,p6,p7,p8,p9};
        EdgeMarkers = new Rectangle[] {EdgeMarker0,EdgeMarker1,EdgeMarker2,EdgeMarker3,EdgeMarker4,EdgeMarker5,EdgeMarker6,EdgeMarker7,EdgeMarker8,EdgeMarker9,EdgeMarker10,EdgeMarker11,EdgeMarker12,EdgeMarker13,EdgeMarker14,EdgeMarker15,EdgeMarker16,EdgeMarker17,EdgeMarker18,EdgeMarker19,EdgeMarker20,EdgeMarker21,EdgeMarker22,EdgeMarker23,EdgeMarker24,EdgeMarker25,EdgeMarker26,EdgeMarker27,EdgeMarker28,EdgeMarker29,EdgeMarker30,EdgeMarker31,EdgeMarker32,EdgeMarker33,EdgeMarker34,EdgeMarker35,EdgeMarker36,EdgeMarker37,EdgeMarker38,EdgeMarker39,EdgeMarker40,EdgeMarker41,EdgeMarker42,EdgeMarker43,EdgeMarker44,EdgeMarker45,EdgeMarker46,EdgeMarker47,EdgeMarker48,EdgeMarker49,EdgeMarker50,EdgeMarker51,EdgeMarker52,EdgeMarker53,EdgeMarker54,EdgeMarker55,EdgeMarker56,EdgeMarker57,EdgeMarker58,EdgeMarker59,EdgeMarker60,EdgeMarker61,EdgeMarker62,EdgeMarker63,EdgeMarker64,EdgeMarker65,EdgeMarker66,EdgeMarker67,EdgeMarker68,EdgeMarker69,EdgeMarker70,EdgeMarker71};
        VertexMarkers = new Rectangle[] {VertexMarker0,VertexMarker1,VertexMarker2,VertexMarker3,VertexMarker4,VertexMarker5,VertexMarker6,VertexMarker7,VertexMarker8,VertexMarker9,VertexMarker10,VertexMarker11,VertexMarker12,VertexMarker13,VertexMarker14,VertexMarker15,VertexMarker16,VertexMarker17,VertexMarker18,VertexMarker19,VertexMarker20,VertexMarker21,VertexMarker22,VertexMarker23,VertexMarker24,VertexMarker25,VertexMarker26,VertexMarker27,VertexMarker28,VertexMarker29,VertexMarker30,VertexMarker31,VertexMarker32,VertexMarker33,VertexMarker34,VertexMarker35,VertexMarker36,VertexMarker37,VertexMarker38,VertexMarker39,VertexMarker40,VertexMarker41,VertexMarker42,VertexMarker43,VertexMarker44,VertexMarker45,VertexMarker46,VertexMarker47,VertexMarker48,VertexMarker49,VertexMarker50,VertexMarker51,VertexMarker52,VertexMarker53};
        tokenViews = new ImageView[] {tokenA, tokenB, tokenC, tokenD, tokenE, tokenF, tokenG, tokenH, tokenI, tokenJ, tokenK, tokenL, tokenM, tokenN, tokenO, tokenP, tokenQ, tokenR, tokenNull};
        playerCards = new ImageView[] {PlayerCard1,PlayerCard2,PlayerCard3,PlayerCard4,PlayerCard5,PlayerCard6,PlayerCard7,PlayerCard8,PlayerCard9,PlayerCard10,PlayerCard11,PlayerCard12,PlayerCard13,PlayerCard14,PlayerCard15,PlayerCard16,PlayerCard17,PlayerCard18,PlayerCard19,PlayerCard20,PlayerCard21};
        TradeMenu.setVisible(false);
        Trade4For1.setVisible(false);
        ResourcePanel.setVisible(false);
        for(Label label: playerNumLabels) {
            label.setVisible(false);
        }
        for(ImageView image: tokenViews) {
            image.setVisible(false);
        }
        for(ImageView image: playerLabels) {
            image.setVisible(false);
        }
        for (ImageView image: resNdevLabels) {
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
        for(Rectangle rect: VertexMarkers) {
            rect.setDisable(true);
        }
        for(Rectangle rect: EdgeMarkers) {
            rect.setDisable(true);
        }
        RollDiceButton.setDisable(true);
        ConfirmButton.setDisable(true);
        CancelButton.setDisable(true);
        BuildButton.setDisable(true);
        TradeButton.setDisable(true);
        StealButton.setDisable(true);
        EndTurnButton.setDisable(true);
        HelpButton.setDisable(true);
    }
    @FXML
    public void startGame() {
        startButton.setVisible(false);
        int[][] tokenPos = GameState.tokenPos;
        for(int i = 0; i < tokenPos.length; i++) {
            tokenMap.put(tokenPos[i], tokenViews[i]);
        }
        NumberToken[] tokens = GameState.tokens;
        int[] desertPos = GameState.tilesMap.get("Desert").getCoords();
        int desx = desertPos[0];
        int desy = desertPos[1];
        boolean desertFound = false;
        for(int i = 0; i < tokenPos.length; i++) {
            int x = tokenPos[i][0];
            int y = tokenPos[i][1];
            if(x == desx && y == desy) {
                tokenViews[i].setImage((Image) Initialize.robber.getValue());
                desertFound = true;
                continue;
            }
            int posForImage = desertFound ? i-1 : i;
            tokenMap.get(tokenPos[i]).setImage(tokens[posForImage].getImage());
            GameState.posMap.get(Arrays.toString(tokenPos[i])).setToken(GameState.numbers[posForImage]);
        }
        for(int i = 0; i < 19; i++) {
            System.out.println(GameState.allTiles[i] + " " + Arrays.toString(GameState.pos[i]) + " " + GameState.tiles[i].getToken());
        }
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
        for (int i = 0; i < GameState.numPlayers*2; i++) {
            resNdevLabels[i].setVisible(true);
            resNdevLabels[++i].setVisible(true);
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
        ConfirmButton.setDisable(false);
        CancelButton.setDisable(false);
//        BuildButton.setDisable(false);
//        TradeButton.setDisable(false);
//        StealButton.setDisable(false);
//        EndTurnButton.setDisable(false);
        HelpButton.setDisable(false);
        GameState.currentPlayer = GameState.playerMap.get(1);
        ActivityLog.setEditable(false);
        ActivityLog.appendText("Determine which player goes first: \n" );
        appendBoth("Player " + 1 + ", roll the dice");
        RollDiceButton.setDisable(false);
    }

    public void setUp() throws InterruptedException {
        int[] results = GameState.setUpDice;
        int max = results[0];
        int index = 0;
        for(int i = 1; i < results.length; i++) {
            if(results[i] > max) {
                max = results[i];
                index = i;
            }
        }
        index+=1;

        GameState.firstPlayerIndex = index;
        appendBoth("Player " + index + " goes first!");

        PauseTransition pauseTransition = new PauseTransition(Duration.seconds(1.5));
        int finalIndex = index;
        pauseTransition.setOnFinished(e -> MainLabel.setText("Player " + finalIndex + ", choose the location of your first settlement"));
        pauseTransition.play();
        GameState.currentPlayerIndex = index;
        GameState.currentPlayer = GameState.playerMap.get(GameState.currentPlayerIndex);
        placeSettlement();
    }

    public void placeSettlement() {
        /*
    if the vertex has a player on it,
    that vertex set visible false
    the surrounding vertex set visible false
     */
        Vertex[] vertices = GameState.allVertices;
        for(int i = 0; i < vertices.length; i++) {
            VertexMarkers[i].setVisible(true);
            VertexMarkers[i].setDisable(false);
        }
        for(int i = 0; i < vertices.length; i++) {
            if(GameState.maintainsDistance(vertices[i])) {
                ArrayList<Vertex> surroundingVertices = vertices[i].getAdjacentVertices();
                for(int j = 0; j < surroundingVertices.size(); j++)
                {
                    int surroundingIndex = surroundingVertices.get(j).getBoardIndex();
                    VertexMarkers[surroundingIndex].setVisible(false);
                    VertexMarkers[surroundingIndex].setDisable(true);
                }
                VertexMarkers[i].setDisable(true);

            }
        }
    }

    public void placeEdge() {
        Edge[] edges = GameState.allEdges;
        for(int i = 0; i < edges.length; i++) {
            if(GameState.isValidEdge(edges[i])) {
                EdgeMarkers[i].setVisible(true);
                EdgeMarkers[i].setDisable(false);
            }
        }
    }

    @FXML public void showHelp() { ParentPanel.helpPanel.show(); }

    @FXML
    public void showTrade() throws IOException { TradeMenu.setVisible(true); }
    @FXML
    public void closeTradeMenu() { TradeMenu.setVisible(false); }

    @FXML
    public void showTrade4For1() throws IOException {
        Player currentPlayer = GameState.currentPlayer;
        ActivityLog.appendText("Player " + currentPlayer.getIndex() + " choose to trade with bank (4:1)\n");
        TradeMenu.setVisible(false);
        Trade4For1.setVisible(true);
    }
    @FXML
    public void closeTrade4For1() throws IOException { Trade4For1.setVisible(false); }

    @FXML
    public void rollDice() throws InterruptedException {
        RollDiceButton.setDisable(true);
        Random rand = new Random();
        int die1 = rand.nextInt(6) + 1;
        int die2 = rand.nextInt(6) + 1;
        int diceRoll = die1+die2;
        if(GameState.gameStarted) {
            Player player = GameState.currentPlayer;
            int index = player.getIndex();
            appendBoth("Player " + index + " rolled " + diceRoll +"\n");
            cardAssignment(false, diceRoll);
            if(diceRoll == 7) {
                appendBoth("Move the Robber to Another Tile"+"\n");
                ArrayList<Integer> previousRobberLocation = GameState.getRobberLocation();
                //moveRobber();
                ArrayList<Integer> currentRobberLocation = GameState.getRobberLocation();
                if(!previousRobberLocation.equals(currentRobberLocation)){
                    BuildButton.setDisable(false);
                    TradeButton.setDisable(false);
                    EndTurnButton.setDisable(false);
                }
            }
            else{
                BuildButton.setDisable(false);
                TradeButton.setDisable(false);
                EndTurnButton.setDisable(false);
            }

        }
        else {
            ActivityLog.appendText("Player " + GameState.currentPlayerIndex + " rolled " + diceRoll + "\n\n");
            GameState.setUpDice[GameState.currentPlayerIndex-1] = diceRoll;
            if(GameState.currentPlayerIndex != GameState.numPlayers) {
                GameState.currentPlayerIndex = GameState.currentPlayerIndex + 1;
                GameState.currentPlayer = GameState.playerMap.get(GameState.currentPlayerIndex);
                appendBoth("Player " + GameState.currentPlayerIndex + ", roll the dice");
                RollDiceButton.setDisable(false);
            }
            else {
                RollDiceButton.setDisable(true);
                setUp();
            }
        }
    }
    public void moveRobber(){

    }
    public void appendBoth(String str) {
        ActivityLog.appendText(str+"\n");
        MainLabel.setText(str);
    }

    public void MarkerPressed(int index) {
        VertexMarkers[index].setFill(GameState.nameToColor.get(GameState.currentPlayer.getColor()));
        GameState.allVertices[index].setPlayerIndex(GameState.currentPlayerIndex);
        for(int i = 0; i < VertexMarkers.length; i++) {
            VertexMarkers[i].setDisable(true);
            if(GameState.allVertices[i].getPlayerIndex() <= 0) VertexMarkers[i].setVisible(false);
        }
        VertexMarkers[index].setVisible(true);
        GameState.currentPlayer.addSettlement(GameState.allVertices[index]);
        if(!GameState.gameStarted) {
            String roadNum = GameState.firstSettlementsPlaced ? "second" : "first";
            MainLabel.setText("Now select your "+roadNum+" Road location");
            placeEdge();
        }
    }


    public void EdgePressed(int index) {
        EdgeMarkers[index].setFill(GameState.nameToColor.get(GameState.currentPlayer.getColor()));
        GameState.allEdges[index].setPlayerIndex(GameState.currentPlayerIndex);
        GameState.currentPlayer.addRoad(GameState.allEdges[index]);
        for(int i = 0; i < EdgeMarkers.length; i++) {
            EdgeMarkers[i].setDisable(true);
            if(GameState.allEdges[i].getPlayerIndex() <= 0) EdgeMarkers[i].setVisible(false);
        }
        nextTurn();
        EdgeMarkers[index].setVisible(true);
        if(!GameState.gameStarted) {
            String settlementNum = GameState.firstSettlementsPlaced ? "second" : "first";
            MainLabel.setText("Next, Player " + GameState.currentPlayerIndex + ", choose the location of your " + settlementNum + " settlement");
            placeSettlement();
        }
    }

    public void cardAssignment(boolean isFirst, int numRolled) {
        GameState.cardAssignment(isFirst, numRolled);
        ActivityLog.appendText("\n-----Resources Distributed-----\n");
        if(GameState.newCards.isEmpty()) appendBoth("NO RESOURCES DISTRIBUTED!");
        else {
            for(String[] newCard: GameState.newCards) {
                String cardName = newCard[1];
                ActivityLog.appendText("Player " + newCard[0] + " received a " + cardName+"!\n");
                switch (cardName) {
                    case "Brick":
                        BrickLabel.setText(Integer.toString(Integer.parseInt(BrickLabel.getText())-1));
                        break;
                    case "Grain":
                        GrainLabel.setText(Integer.toString(Integer.parseInt(GrainLabel.getText())-1));
                        break;
                    case "Ore":
                        OreLabel.setText(Integer.toString(Integer.parseInt(OreLabel.getText())-1));
                        break;
                    case "Wood":
                        WoodLabel.setText(Integer.toString(Integer.parseInt(WoodLabel.getText())-1));
                        break;
                    case "Wool":
                        WoolLabel.setText(Integer.toString(Integer.parseInt(WoolLabel.getText())-1));
                        break;
                }
            }
        }
        ActivityLog.appendText("--------------------------------------\n\n");
    }

    //1,2,3,4
    public void nextTurn() {
        BuildButton.setDisable(true);
        TradeButton.setDisable(true);
        EndTurnButton.setDisable(true);
        int nextTurn = GameState.iterateForward? (GameState.currentPlayerIndex % GameState.numPlayers) + 1 : (GameState.currentPlayerIndex+(GameState.numPlayers-1)) % GameState.numPlayers;
        if(nextTurn == 0) nextTurn = GameState.numPlayers;
        if(GameState.lastEdgePlaced) {
            GameState.gameStarted = true;
            GameState.lastEdgePlaced = false;
            int current = (nextTurn+(GameState.numPlayers-1)) % GameState.numPlayers;
            if(current == 0) current = GameState.numPlayers;
            GameState.currentPlayerIndex = current;
            GameState.iterateForward = true;

            cardAssignment(true, 0);
            MainLabel.setText("Game Started! Player " + current + " roll the dice!");
            ActivityLog.appendText("---Round "+GameState.round+"---\n");
            RollDiceButton.setDisable(false);
        }
        else if(GameState.gameStarted) {
            GameState.currentPlayerIndex = nextTurn;
            MainLabel.setText("Round " + GameState.round +"! Player " + nextTurn + " roll the dice!");
            ActivityLog.appendText("---Round "+GameState.round+"---\n");
            RollDiceButton.setDisable(false);
        }
        else {
            if(!GameState.gameStarted){
                if(nextTurn == GameState.firstPlayerIndex) {
                    if(!GameState.firstSettlementsPlaced) {
                        GameState.firstSettlementsPlaced = true;
                        GameState.iterateForward = false;
                        nextTurn = GameState.currentPlayerIndex;
                    }
                    else {
                        GameState.lastEdgePlaced = true;
                    }
                }
            }
            GameState.currentPlayerIndex = nextTurn;
        }

        GameState.currentPlayer = GameState.playerMap.get(GameState.currentPlayerIndex);
    }

    public void openResourcePanel(int playerIndex) {
        for(int i = 0; i < playerCards.length; i++) {
            playerCards[i].setImage(null);
        }
        ResourcePanel.setVisible(false);
        ResourcePanel.setVisible(true);
        ResourceViewText.setText("Player "+playerIndex+"'s Resource Deck");
        for(int i = 0; i < GameState.playerMap.get(playerIndex).getResourceDeck().size(); i++) {
            playerCards[i].setImage(GameState.playerMap.get(playerIndex).getResourceDeck().get(i).getResourceImage());
        }
    }

    @FXML
    public void endTurn() {
        GameState.round = GameState.round + 1;
        nextTurn();
    }

    @FXML
    public void closeResourcePanel() {
        for(int i = 0; i < playerCards.length; i++) {
            playerCards[i].setImage(null);
        }
        ResourcePanel.setVisible(false);
    }

    @FXML
    public void showDevView1() {}

    @FXML
    public void showDevView2() {}

    @FXML
    public void showDevView3() {}

    @FXML
    public void showDevView4() {}

    @FXML
    public void showResourceView1() {
        openResourcePanel(1);
    }

    @FXML
    public void showResourceView2() {
        openResourcePanel(2);
    }

    @FXML
    public void showResourceView3() {
        openResourcePanel(3);
    }

    @FXML
    public void showResourceView4() {
        openResourcePanel(4);
    }

    @FXML
    public void Marker0Pressed() {
        MarkerPressed(0);
    }

    @FXML
    public void Marker1Pressed() {
        MarkerPressed(1);
    }

    @FXML
    public void Marker2Pressed() {
        MarkerPressed(2);
    }

    @FXML
    public void Marker3Pressed() {
        MarkerPressed(3);
    }

    @FXML
    public void Marker4Pressed() {
        MarkerPressed(4);
    }

    @FXML
    public void Marker5Pressed() {
        MarkerPressed(5);
    }

    @FXML
    public void Marker6Pressed() {
        MarkerPressed(6);
    }

    @FXML
    public void Marker7Pressed() {
        MarkerPressed(7);
    }

    @FXML
    public void Marker8Pressed() {
        MarkerPressed(8);
    }

    @FXML
    public void Marker9Pressed() {
        MarkerPressed(9);
    }

    @FXML
    public void Marker10Pressed() {
        MarkerPressed(10);
    }

    @FXML
    public void Marker11Pressed() {
        MarkerPressed(11);
    }

    @FXML
    public void Marker12Pressed() {
        MarkerPressed(12);
    }

    @FXML
    public void Marker13Pressed() {
        MarkerPressed(13);
    }

    @FXML
    public void Marker14Pressed() {
        MarkerPressed(14);
    }

    @FXML
    public void Marker15Pressed() {
        MarkerPressed(15);
    }

    @FXML
    public void Marker16Pressed() {
        MarkerPressed(16);
    }

    @FXML
    public void Marker17Pressed() {
        MarkerPressed(17);
    }

    @FXML
    public void Marker18Pressed() {
        MarkerPressed(18);
    }

    @FXML
    public void Marker19Pressed() {
        MarkerPressed(19);
    }

    @FXML
    public void Marker20Pressed() {
        MarkerPressed(20);
    }

    @FXML
    public void Marker21Pressed() {
        MarkerPressed(21);
    }

    @FXML
    public void Marker22Pressed() {
        MarkerPressed(22);
    }

    @FXML
    public void Marker23Pressed() {
        MarkerPressed(23);
    }

    @FXML
    public void Marker24Pressed() {
        MarkerPressed(24);
    }

    @FXML
    public void Marker25Pressed() {
        MarkerPressed(25);
    }

    @FXML
    public void Marker26Pressed() {
        MarkerPressed(26);
    }

    @FXML
    public void Marker27Pressed() {
        MarkerPressed(27);
    }

    @FXML
    public void Marker28Pressed() {
        MarkerPressed(28);
    }

    @FXML
    public void Marker29Pressed() {
        MarkerPressed(29);
    }

    @FXML
    public void Marker30Pressed() {
        MarkerPressed(30);
    }

    @FXML
    public void Marker31Pressed() {
        MarkerPressed(31);
    }

    @FXML
    public void Marker32Pressed() {
        MarkerPressed(32);
    }

    @FXML
    public void Marker33Pressed() {
        MarkerPressed(33);
    }

    @FXML
    public void Marker34Pressed() {
        MarkerPressed(34);
    }

    @FXML
    public void Marker35Pressed() {
        MarkerPressed(35);
    }

    @FXML
    public void Marker36Pressed() {
        MarkerPressed(36);
    }

    @FXML
    public void Marker37Pressed() {
        MarkerPressed(37);
    }

    @FXML
    public void Marker38Pressed() {
        MarkerPressed(38);
    }

    @FXML
    public void Marker39Pressed() {
        MarkerPressed(39);
    }

    @FXML
    public void Marker40Pressed() {
        MarkerPressed(40);
    }

    @FXML
    public void Marker41Pressed() {
        MarkerPressed(41);
    }

    @FXML
    public void Marker42Pressed() {
        MarkerPressed(42);
    }

    @FXML
    public void Marker43Pressed() {
        MarkerPressed(43);
    }

    @FXML
    public void Marker44Pressed() {
        MarkerPressed(44);
    }

    @FXML
    public void Marker45Pressed() {
        MarkerPressed(45);
    }

    @FXML
    public void Marker46Pressed() {
        MarkerPressed(46);
    }

    @FXML
    public void Marker47Pressed() {
        MarkerPressed(47);
    }

    @FXML
    public void Marker48Pressed() {
        MarkerPressed(48);
    }

    @FXML
    public void Marker49Pressed() {
        MarkerPressed(49);
    }

    @FXML
    public void Marker50Pressed() {
        MarkerPressed(50);
    }

    @FXML
    public void Marker51Pressed() {
        MarkerPressed(51);
    }

    @FXML
    public void Marker52Pressed() {
        MarkerPressed(52);
    }

    @FXML
    public void Marker53Pressed() {
        MarkerPressed(53);
    }

    @FXML
    public void Edge0Pressed() {
        EdgePressed(0);
    }

    @FXML
    public void Edge1Pressed() {
        EdgePressed(1);
    }

    @FXML
    public void Edge2Pressed() {
        EdgePressed(2);
    }

    @FXML
    public void Edge3Pressed() {
        EdgePressed(3);
    }

    @FXML
    public void Edge4Pressed() {
        EdgePressed(4);
    }

    @FXML
    public void Edge5Pressed() {
        EdgePressed(5);
    }

    @FXML
    public void Edge6Pressed() {
        EdgePressed(6);
    }

    @FXML
    public void Edge7Pressed() {
        EdgePressed(7);
    }

    @FXML
    public void Edge8Pressed() {
        EdgePressed(8);
    }

    @FXML
    public void Edge9Pressed() {
        EdgePressed(9);
    }

    @FXML
    public void Edge10Pressed() {
        EdgePressed(10);
    }

    @FXML
    public void Edge11Pressed() {
        EdgePressed(11);
    }

    @FXML
    public void Edge12Pressed() {
        EdgePressed(12);
    }

    @FXML
    public void Edge13Pressed() {
        EdgePressed(13);
    }

    @FXML
    public void Edge14Pressed() {
        EdgePressed(14);
    }

    @FXML
    public void Edge15Pressed() {
        EdgePressed(15);
    }

    @FXML
    public void Edge16Pressed() {
        EdgePressed(16);
    }

    @FXML
    public void Edge17Pressed() {
        EdgePressed(17);
    }

    @FXML
    public void Edge18Pressed() {
        EdgePressed(18);
    }

    @FXML
    public void Edge19Pressed() {
        EdgePressed(19);
    }

    @FXML
    public void Edge20Pressed() {
        EdgePressed(20);
    }

    @FXML
    public void Edge21Pressed() {
        EdgePressed(21);
    }

    @FXML
    public void Edge22Pressed() {
        EdgePressed(22);
    }

    @FXML
    public void Edge23Pressed() {
        EdgePressed(23);
    }

    @FXML
    public void Edge24Pressed() {
        EdgePressed(24);
    }

    @FXML
    public void Edge25Pressed() {
        EdgePressed(25);
    }

    @FXML
    public void Edge26Pressed() {
        EdgePressed(26);
    }

    @FXML
    public void Edge27Pressed() {
        EdgePressed(27);
    }

    @FXML
    public void Edge28Pressed() {
        EdgePressed(28);
    }

    @FXML
    public void Edge29Pressed() {
        EdgePressed(29);
    }

    @FXML
    public void Edge30Pressed() {
        EdgePressed(30);
    }

    @FXML
    public void Edge31Pressed() {
        EdgePressed(31);
    }

    @FXML
    public void Edge32Pressed() {
        EdgePressed(32);
    }

    @FXML
    public void Edge33Pressed() {
        EdgePressed(33);
    }

    @FXML
    public void Edge34Pressed() {
        EdgePressed(34);
    }

    @FXML
    public void Edge35Pressed() {
        EdgePressed(35);
    }

    @FXML
    public void Edge36Pressed() {
        EdgePressed(36);
    }

    @FXML
    public void Edge37Pressed() {
        EdgePressed(37);
    }

    @FXML
    public void Edge38Pressed() {
        EdgePressed(38);
    }

    @FXML
    public void Edge39Pressed() {
        EdgePressed(39);
    }

    @FXML
    public void Edge40Pressed() {
        EdgePressed(40);
    }

    @FXML
    public void Edge41Pressed() {
        EdgePressed(41);
    }

    @FXML
    public void Edge42Pressed() {
        EdgePressed(42);
    }

    @FXML
    public void Edge43Pressed() {
        EdgePressed(43);
    }

    @FXML
    public void Edge44Pressed() {
        EdgePressed(44);
    }

    @FXML
    public void Edge45Pressed() {
        EdgePressed(45);
    }

    @FXML
    public void Edge46Pressed() {
        EdgePressed(46);
    }

    @FXML
    public void Edge47Pressed() {
        EdgePressed(47);
    }

    @FXML
    public void Edge48Pressed() {
        EdgePressed(48);
    }

    @FXML
    public void Edge49Pressed() {
        EdgePressed(49);
    }

    @FXML
    public void Edge50Pressed() {
        EdgePressed(50);
    }

    @FXML
    public void Edge51Pressed() {
        EdgePressed(51);
    }

    @FXML
    public void Edge52Pressed() {
        EdgePressed(52);
    }

    @FXML
    public void Edge53Pressed() {
        EdgePressed(53);
    }

    @FXML
    public void Edge54Pressed() {
        EdgePressed(54);
    }

    @FXML
    public void Edge55Pressed() {
        EdgePressed(55);
    }

    @FXML
    public void Edge56Pressed() {
        EdgePressed(56);
    }

    @FXML
    public void Edge57Pressed() {
        EdgePressed(57);
    }

    @FXML
    public void Edge58Pressed() {
        EdgePressed(58);
    }

    @FXML
    public void Edge59Pressed() {
        EdgePressed(59);
    }

    @FXML
    public void Edge60Pressed() {
        EdgePressed(60);
    }

    @FXML
    public void Edge61Pressed() {
        EdgePressed(61);
    }

    @FXML
    public void Edge62Pressed() {
        EdgePressed(62);
    }

    @FXML
    public void Edge63Pressed() {
        EdgePressed(63);
    }

    @FXML
    public void Edge64Pressed() {
        EdgePressed(64);
    }

    @FXML
    public void Edge65Pressed() {
        EdgePressed(65);
    }

    @FXML
    public void Edge66Pressed() {
        EdgePressed(66);
    }

    @FXML
    public void Edge67Pressed() {
        EdgePressed(67);
    }

    @FXML
    public void Edge68Pressed() {
        EdgePressed(68);
    }

    @FXML
    public void Edge69Pressed() {
        EdgePressed(69);
    }

    @FXML
    public void Edge70Pressed() {
        EdgePressed(70);
    }

    @FXML
    public void Edge71Pressed() {
        EdgePressed(71);
    }

}
