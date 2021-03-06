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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
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
    public static ImageView[] devCards;
    public static Label[] tradeLabels;
    public static Pane[] buildPanes;
    public static Pane[] devCardPanes;
    //
    public static Pane[] resourcePane;

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
    private DialogPane TradePanel;

    @FXML
    private DialogPane TradeMenu;
    @FXML
    private Label tradeBrickLabel;

    @FXML
    private Label tradeGrainLabel;

    @FXML
    private Label tradeOreLabel;

    @FXML
    private Label tradeWoodLabel;

    @FXML
    private Label tradeWoolLabel;

    @FXML
    private Button bankButton;
    @FXML
    private Button portButton;

    @FXML
    private Pane resourcePane1;
    @FXML
    private Pane resourcePane2;
    @FXML
    private Pane resourcePane3;
    @FXML
    private Pane resourcePane4;
    @FXML
    private Pane resourcePane5;
    @FXML
    private Pane resourcePane6;
    @FXML
    private Pane resourcePane7;
    @FXML
    private Pane resourcePane8;
    @FXML
    private Pane resourcePane9;
    @FXML
    private Pane resourcePane10;
    @FXML
    private Pane resourcePane11;
    @FXML
    private Pane resourcePane12;
    @FXML
    private Pane resourcePane13;
    @FXML
    private Pane resourcePane14;
    @FXML
    private Pane resourcePane15;
    @FXML
    private Pane resourcePane16;
    @FXML
    private Pane resourcePane17;
    @FXML
    private Pane resourcePane18;
    @FXML
    private Pane resourcePane19;
    @FXML
    private Pane resourcePane20;
    @FXML
    private Pane resourcePane21;

    @FXML
    private ImageView portButtonImage;

    @FXML
    private ImageView bankButtonImage;
    @FXML
    private Button otherButton;
    @FXML
    private ComboBox<String> offerDropdown;
    @FXML
    private ComboBox<String> requestDropdown;
    @FXML
    private ComboBox<String> portDropdown;
    @FXML
    private Spinner<Integer> offerSpinner;
    @FXML
    private Spinner<Integer> requestSpinner;
    @FXML
    private Label tradeErrorMessage;
    @FXML
    private Label tradeLabel;
    @FXML
    private Label buildErrorMessage;
    @FXML
    private DialogPane buildPanel;
    @FXML
    private Pane roadPane;
    @FXML
    private Pane settlementPane;
    @FXML
    private Pane cityPane;
    @FXML
    private Pane devcardPane;


    @FXML
    private Pane devCardPane1;

    @FXML
    private Pane devCardPane2;

    @FXML
    private Pane devCardPane3;

    @FXML
    private Pane devCardPane4;

    @FXML
    private Pane devCardPane5;

    @FXML
    private Pane devCardPane6;

    @FXML
    private ImageView devCard1;

    @FXML
    private ImageView devCard2;

    @FXML
    private ImageView devCard3;

    @FXML
    private ImageView devCard4;

    @FXML
    private ImageView devCard5;

    @FXML
    private ImageView devCard6;
    @FXML
    private Label othersTradeTitle;
    @FXML
    private Label othersTradeOffer;
    @FXML
    private Label othersTradeRequest;
    @FXML
    private Button confirmTradeButton;
    @FXML
    private DialogPane othersTradePanel;
    @FXML
    private Label othersTradeErrorMessage;

    @FXML
    private Label roadsRemaining;
    @FXML
    private Label settlementsRemaining;
    @FXML
    private Label citiesRemaining;
    @FXML
    private Button removeCardsButton;
    @FXML
    private Button exitResourcePanelButton;
    @FXML
    private Label whoToStealLabel;
    @FXML
    private ComboBox<String> stealDropdown;
    @FXML
    private Label stealErrorMessage;
    @FXML
    private Button stealCardButton;
    @FXML
    private Label resourceStolen;
    @FXML
    private Button exitStealButton;
    @FXML
    private DialogPane stealPanel;
    @FXML
    private DialogPane devCardPanel;
    @FXML
    private Label devCardLabel;
    @FXML
    private Button useDevCardButton;
    @FXML
    private Label devCardErrorMessage;
    @FXML
    private Text bankDisabledText;
    @FXML
    private Label longestRoadLabel;
    @FXML
    private Label victoryPointsLabel;

    @FXML
    public void initialize() throws FileNotFoundException {
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

        devCards = new ImageView[] {devCard1, devCard2, devCard3, devCard4, devCard5, devCard6};
        devCardPanes = new Pane[] {devCardPane1, devCardPane2, devCardPane3, devCardPane4, devCardPane5, devCardPane6};
        resourcePane = new Pane[]{resourcePane1, resourcePane2, resourcePane3, resourcePane4, resourcePane5, resourcePane6, resourcePane7, resourcePane8, resourcePane9, resourcePane10, resourcePane11, resourcePane12, resourcePane13, resourcePane14, resourcePane15, resourcePane16, resourcePane17, resourcePane18, resourcePane19, resourcePane20, resourcePane21};
        playerNumLabels = new Label[]{Player1Label, Player2Label, Player3Label, Player4Label};
        resDecks = new Rectangle[]{BlueResourceDeck, GreenResourceDeck, WhiteResourceDeck, RedResourceDeck};
        devDecks = new Rectangle[]{BlueDevDeck, GreenDevDeck, WhiteDevDeck, RedDevDeck};
        playerLabels = new ImageView[]{GreenColorLabel, WhiteColorLabel, RedColorLabel, BlueColorLabel};
        resNdevLabels = new ImageView[]{resLabel1, devLabel1, resLabel2, devLabel2, resLabel3, devLabel3, resLabel4, devLabel4};
        playerImages = new ImageView[]{GreenIcon, WhiteIcon, BlueIcon, RedIcon};
        tileViews = new ImageView[]{r0c0, r0c1, r0c2, r1c0, r1c1, r1c2, r1c3, r2c0, r2c1, r2c2, r2c3, r2c4, r3c0, r3c1, r3c2, r3c3, r4c0, r4c1, r4c2};
        portViews = new ImageView[]{p1, p2, p3, p4, p5, p6, p7, p8, p9};
        EdgeMarkers = new Rectangle[]{EdgeMarker0, EdgeMarker1, EdgeMarker2, EdgeMarker3, EdgeMarker4, EdgeMarker5, EdgeMarker6, EdgeMarker7, EdgeMarker8, EdgeMarker9, EdgeMarker10, EdgeMarker11, EdgeMarker12, EdgeMarker13, EdgeMarker14, EdgeMarker15, EdgeMarker16, EdgeMarker17, EdgeMarker18, EdgeMarker19, EdgeMarker20, EdgeMarker21, EdgeMarker22, EdgeMarker23, EdgeMarker24, EdgeMarker25, EdgeMarker26, EdgeMarker27, EdgeMarker28, EdgeMarker29, EdgeMarker30, EdgeMarker31, EdgeMarker32, EdgeMarker33, EdgeMarker34, EdgeMarker35, EdgeMarker36, EdgeMarker37, EdgeMarker38, EdgeMarker39, EdgeMarker40, EdgeMarker41, EdgeMarker42, EdgeMarker43, EdgeMarker44, EdgeMarker45, EdgeMarker46, EdgeMarker47, EdgeMarker48, EdgeMarker49, EdgeMarker50, EdgeMarker51, EdgeMarker52, EdgeMarker53, EdgeMarker54, EdgeMarker55, EdgeMarker56, EdgeMarker57, EdgeMarker58, EdgeMarker59, EdgeMarker60, EdgeMarker61, EdgeMarker62, EdgeMarker63, EdgeMarker64, EdgeMarker65, EdgeMarker66, EdgeMarker67, EdgeMarker68, EdgeMarker69, EdgeMarker70, EdgeMarker71};
        VertexMarkers = new Rectangle[]{VertexMarker0, VertexMarker1, VertexMarker2, VertexMarker3, VertexMarker4, VertexMarker5, VertexMarker6, VertexMarker7, VertexMarker8, VertexMarker9, VertexMarker10, VertexMarker11, VertexMarker12, VertexMarker13, VertexMarker14, VertexMarker15, VertexMarker16, VertexMarker17, VertexMarker18, VertexMarker19, VertexMarker20, VertexMarker21, VertexMarker22, VertexMarker23, VertexMarker24, VertexMarker25, VertexMarker26, VertexMarker27, VertexMarker28, VertexMarker29, VertexMarker30, VertexMarker31, VertexMarker32, VertexMarker33, VertexMarker34, VertexMarker35, VertexMarker36, VertexMarker37, VertexMarker38, VertexMarker39, VertexMarker40, VertexMarker41, VertexMarker42, VertexMarker43, VertexMarker44, VertexMarker45, VertexMarker46, VertexMarker47, VertexMarker48, VertexMarker49, VertexMarker50, VertexMarker51, VertexMarker52, VertexMarker53};
        tokenViews = new ImageView[]{tokenA, tokenB, tokenC, tokenD, tokenE, tokenF, tokenG, tokenH, tokenI, tokenJ, tokenK, tokenL, tokenM, tokenN, tokenO, tokenP, tokenQ, tokenR, tokenNull};
        playerCards = new ImageView[]{PlayerCard1, PlayerCard2, PlayerCard3, PlayerCard4, PlayerCard5, PlayerCard6, PlayerCard7, PlayerCard8, PlayerCard9, PlayerCard10, PlayerCard11, PlayerCard12, PlayerCard13, PlayerCard14, PlayerCard15, PlayerCard16, PlayerCard17, PlayerCard18, PlayerCard19, PlayerCard20, PlayerCard21};
        tradeLabels = new Label[]{tradeBrickLabel, tradeGrainLabel, tradeOreLabel, tradeWoodLabel, tradeWoolLabel};
        buildPanes = new Pane[]{roadPane, settlementPane, cityPane, devcardPane};
        TradeMenu.setVisible(false);
        TradePanel.setVisible(false);
        buildPanel.setVisible(false);
        ResourcePanel.setVisible(false);
        stealPanel.setVisible(false);
        devCardPanel.setVisible(false);
        othersTradePanel.setVisible(false);
        for (Label label : playerNumLabels) {
            label.setVisible(false);
        }
        for (ImageView image : tokenViews) {
            image.setVisible(false);
            image.setDisable(true);
        }
        for (ImageView image : playerLabels) {
            image.setVisible(false);
        }
        for (ImageView image : resNdevLabels) {
            image.setVisible(false);
        }
        for (ImageView image : playerImages) {
            image.setVisible(false);
        }
        for (ImageView image : tileViews) {
            image.setVisible(false);
        }
        for (ImageView image : portViews) {
            image.setVisible(false);
        }
        for (Rectangle rect : EdgeMarkers) {
            rect.setVisible(false);
        }
        for (Rectangle rect : VertexMarkers) {
            rect.setVisible(false);
        }
        for (Rectangle rect : resDecks) {
            rect.setVisible(false);
        }
        for (Rectangle rect : devDecks) {
            rect.setVisible(false);
        }
        for (Rectangle rect : VertexMarkers) {
            rect.setDisable(true);
        }
        for (Rectangle rect : EdgeMarkers) {
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
        removeCardsButton.setVisible(false);
        useDevCardButton.setDisable(true);
        offerDropdown.getItems().removeAll(offerDropdown.getItems());
        offerDropdown.getItems().addAll("Brick", "Ore", "Grain", "Wood", "Wool");
        requestDropdown.getItems().removeAll(offerDropdown.getItems());
        requestDropdown.getItems().addAll("Brick", "Ore", "Grain", "Wood", "Wool");
        portDropdown.setVisible(false);
        tradeErrorMessage.setVisible(false);
        devCardErrorMessage.setVisible(false);
        othersTradeErrorMessage.setVisible(false);
        resourceStolen.setVisible(false);
        stealErrorMessage.setVisible(false);
        offerSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 21));
        requestSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 21));
    }

    @FXML
    public void startGame() {
        startButton.setVisible(false);
        int[][] tokenPos = GameState.tokenPos;
        for (int i = 0; i < tokenPos.length; i++) {
            tokenMap.put(tokenPos[i], tokenViews[i]);
        }
        NumberToken[] tokens = GameState.tokens;
        int[] desertPos = GameState.tilesMap.get("Desert").getCoords();
        int desx = desertPos[0];
        int desy = desertPos[1];
        boolean desertFound = false;
        for (int i = 0; i < tokenPos.length; i++) {
            int x = tokenPos[i][0];
            int y = tokenPos[i][1];
            if (x == desx && y == desy) {
                tokenViews[i].setImage((Image) Initialize.robber.getValue());
                GameState.robberTokenIndex = i;
                GameState.desertTokenIndex = i;
                desertFound = true;
                continue;
            }
            int posForImage = desertFound ? i - 1 : i;
            tokenMap.get(tokenPos[i]).setImage(tokens[posForImage].getImage());
            GameState.posMap.get(Arrays.toString(tokenPos[i])).setToken(GameState.numbers[posForImage]);
        }
        for (int i = 0; i < 19; i++) {
            System.out.println(GameState.allTiles[i] + " " + Arrays.toString(GameState.pos[i]) + " " + GameState.tiles[i].getToken());
        }
        Tile[] tiles = GameState.tiles;
        for (int i = 0; i < tileViews.length; i++) {
            tileViews[i].setImage(tiles[i].getImage());
        }
        for (ImageView image : tileViews) {
            image.setVisible(true);
        }
        Port[] ports = GameState.ports;
        for (int i = 0; i < portViews.length; i++) {
            portViews[i].setImage(ports[i].getImage());
        }
        for (ImageView image : portViews) {
            image.setVisible(true);
        }
        for (ImageView image : tokenViews) {
            image.setVisible(true);
        }
        for (int i = 0; i < GameState.numPlayers * 2; i++) {
            resNdevLabels[i].setVisible(true);
            resNdevLabels[++i].setVisible(true);
        }
        int numPlayers = GameState.numPlayers;
        String[] colors = GameState.allColors;
        for (int i = 0; i < numPlayers; i++) {
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
        ActivityLog.appendText("Determine which player goes first: \n");
        appendBoth("Player " + 1 + ", roll the dice");
        RollDiceButton.setDisable(false);
    }

    public void setUp() throws InterruptedException {
        int[] results = GameState.setUpDice;
        int max = results[0];
        int index = 0;
        for (int i = 1; i < results.length; i++) {
            if (results[i] > max) {
                max = results[i];
                index = i;
            }
        }
        index += 1;

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
        for (int i = 0; i < vertices.length; i++) {
            VertexMarkers[i].setVisible(true);
            VertexMarkers[i].setDisable(false);
        }
        for (int i = 0; i < vertices.length; i++) {
            if (GameState.maintainsDistance(vertices[i])) {
                ArrayList<Vertex> surroundingVertices = vertices[i].getAdjacentVertices();
                for (int j = 0; j < surroundingVertices.size(); j++) {
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
        for (int i = 0; i < edges.length; i++) {
            if (GameState.isValidEdge(edges[i])) {
                EdgeMarkers[i].setVisible(true);
                EdgeMarkers[i].setDisable(false);
            }
        }
    }

    public void placeCity() {
        for(int i = 0; i < VertexMarkers.length; i++) {
            if(GameState.allVertices[i].getPlayerIndex() >= 0) VertexMarkers[i].setDisable(false);
        }
        MainLabel.setText("Click on one of your settlements to upgrade to a city!");
        GameState.isBuildingCity = true;
    }

    @FXML
    public void showHelp() {
        ParentPanel.helpPanel.show();
    }

    @FXML
    public void showBuild() {
        buildPanel.setVisible(true);
        ConfirmButton.setDisable(true);
        CancelButton.setDisable(true);
        BuildButton.setDisable(true);
        EndTurnButton.setDisable(true);
        int numRoadsRemaining = GameState.currentPlayer.getRoadsRemaining();
        if (numRoadsRemaining <= 0) {
            roadPane.setDisable(true);
            roadsRemaining.setText("0x");
        } else {
            roadsRemaining.setText(numRoadsRemaining + "x");
        }
        int numSettlementsRemaining = GameState.currentPlayer.getSettlementsRemaining();
        if (numSettlementsRemaining <= 0) {
            settlementPane.setDisable(true);
            settlementsRemaining.setText("0x");
        } else {
            settlementsRemaining.setText(numSettlementsRemaining + "x");
        }
        int numCitiesRemaining = GameState.currentPlayer.getCitiesRemaining();
        if (numCitiesRemaining <= 0) {
            cityPane.setDisable(true);
            citiesRemaining.setText("0x");
        } else {
            citiesRemaining.setText(numCitiesRemaining + "x");
        }
        buildErrorMessage.setVisible(false);
        for (Pane pane : buildPanes) {
            pane.setStyle(null);
        }
    }

    @FXML
    public void confirmBuild() {
        buildErrorMessage.setVisible(false);
        String selectedItem = GameState.selectedItem;
        if (selectedItem == null) {
            buildErrorMessage.setVisible(true);
            buildErrorMessage.setText("Please select an item");
        } else {
            Player currentPlayer = GameState.currentPlayer;
            boolean hasEnoughRemaining = true;
            switch(selectedItem) {
                case "Road":
                    if(currentPlayer.getRoadsRemaining() <= 0) hasEnoughRemaining = false;
                    break;
                case "Settlement":
                    if(currentPlayer.getSettlementsRemaining() <= 0) hasEnoughRemaining = false;
                    break;
                case "City":
                    if(currentPlayer.getCitiesRemaining() <= 0) hasEnoughRemaining = false;
                    break;
                case "DevCard":
                    if(Integer.parseInt(DevLabel.getText()) <= 0) hasEnoughRemaining = false;
            }
            if(!hasEnoughRemaining) {
                buildErrorMessage.setVisible(true);
                buildErrorMessage.setText("Not enough of this item!");
            } else {
                GameState.isBuilding = true;
                BuildButton.setDisable(true);
                EndTurnButton.setDisable(true);
                ArrayList<String> resourcesNeeded = GameState.shop.get(GameState.selectedItem);
                ArrayList<String> toRemove = new ArrayList<>(resourcesNeeded);

                ArrayList<String> resourcesOwned = new ArrayList<>();
                for (ResourceCard resourceCard : currentPlayer.getResourceDeck()) {
                    resourcesOwned.add(resourceCard.getType());
                }
                boolean containsAll = false;
                for(int i = 0; i < resourcesNeeded.size(); i++) {
                    for(int j = 0; j < resourcesOwned.size(); j++) {
                        if (resourcesOwned.get(j).equals(resourcesNeeded.get(i))) {
                            resourcesOwned.remove(j);
                            resourcesNeeded.remove(i--);
                            break;
                        }
                    }
                }
                //continsall doesnt work
                //remove resources from player deck\
                //add to bank
                if (resourcesNeeded.isEmpty()) {
                    MainLabel.setText("Player "+GameState.currentPlayerIndex+" bought a "+selectedItem);
                    switch (selectedItem) {
                        case "Road":
                            placeEdge();
                            break;
                        case "Settlement":
                            placeSettlement();
                            break;
                        case "City":
                            GameState.isBuildingCity = true;
                            placeCity();
                            break;
                        case "DevCard":
                            giveDevCard();
                            break;
                    }

                    removeDeck(currentPlayer, toRemove);
                    GameState.selectedItem = null;
                    for (Pane pane : buildPanes) {
                        pane.setStyle(null);
                    }
                    buildPanel.setVisible(false);
                } else {
                    buildErrorMessage.setVisible(true);
                    buildErrorMessage.setText("Not enough resources for this item!");
                }
            }



        }

    }

    public void giveDevCard() {
        DevLabel.setText(Integer.toString(Integer.parseInt(DevLabel.getText())-1));
        Player currentPlayer = GameState.currentPlayer;
        if(GameState.devBank.peek().getIsVictory()) currentPlayer.newVictoryPoint();
        currentPlayer.addDevCard(GameState.devBank.pop());
        appendBoth("Player "+GameState.currentPlayerIndex+" bought a Dev Card");
        BuildButton.setDisable(false);
        EndTurnButton.setDisable(false);
    }

    public void removeDeck(Player player, ArrayList<String> toRemove) {
        ArrayList<ResourceCard> deck = player.getResourceDeck();
        ArrayList<String> playerDeck = new ArrayList<>();
        for(ResourceCard card: deck) {
            playerDeck.add(card.getType());
        }
        System.out.println("player deck: "+playerDeck.toString());
        System.out.println("to remove deck: "+toRemove.toString());
        for(int i = 0; i < toRemove.size(); i++) {
            for(int j = 0; j < playerDeck.size(); j++) {
                if(playerDeck.get(j).equals(toRemove.get(i))) {
                    System.out.println(toRemove.get(i)+" removed");
                    addToBank(toRemove.get(i));
                    player.removeResource(j);
                    playerDeck.remove(j);
                    break;
                }
            }
        }
    }

    @FXML
    public void closeBuildPanel() {
        GameState.selectedItem = null;
        for (Pane pane : buildPanes) {
            pane.setStyle(null);
        }
        buildPanel.setVisible(false);
        ConfirmButton.setDisable(false);
        CancelButton.setDisable(false);
        BuildButton.setDisable(false);
        EndTurnButton.setDisable(false);
    }

    @FXML
    public void roadSelected() {
        for (Pane pane : buildPanes) {
            pane.setStyle(null);
        }
        GameState.selectedItem = "Road";
        roadPane.setStyle("-fx-border-color: seagreen");
    }

    @FXML
    public void settlementSelected() {
        for (Pane pane : buildPanes) {
            pane.setStyle(null);
        }
        GameState.selectedItem = "Settlement";
        settlementPane.setStyle("-fx-border-color: seagreen");
    }

    @FXML
    public void citySelected() {
        for (Pane pane : buildPanes) {
            pane.setStyle(null);
        }
        GameState.selectedItem = "City";
        cityPane.setStyle("-fx-border-color: seagreen");
    }

    @FXML
    public void devcardSelected() {
        for (Pane pane : buildPanes) {
            pane.setStyle(null);
        }
        GameState.selectedItem = "DevCard";
        devcardPane.setStyle("-fx-border-color: seagreen");
    }

    @FXML
    public void showTrade() throws IOException {
        ConfirmButton.setDisable(true);
        CancelButton.setDisable(true);
        BuildButton.setDisable(true);
        TradeButton.setDisable(true);
        EndTurnButton.setDisable(true);
        portButton.setDisable(true);
        if (GameState.currentPlayer.hasPort()) {
            portButton.setDisable(false);
        }
        HashMap<String, Integer> cardCounts = new HashMap<>();
        for (ResourceCard resourceCard : GameState.currentPlayer.getResourceDeck()) {
            if (cardCounts.get(resourceCard.getType()) == null) {
                cardCounts.put(resourceCard.getType(), 1);
            } else {
                cardCounts.put(resourceCard.getType(), cardCounts.get(resourceCard.getType()) + 1);
            }
        }
        bankDisabledText.setVisible(true);
        bankButton.setDisable(true);
        for (int i : cardCounts.values()) {
            if (i >= 4) {
                bankDisabledText.setVisible(false);
                bankButton.setDisable(false);
            }
        }
        TradeMenu.setVisible(true);
    }

    @FXML
    public void closeTradeMenu() {
        TradeMenu.setVisible(false);
        ConfirmButton.setDisable(false);
        CancelButton.setDisable(false);
        BuildButton.setDisable(false);
        EndTurnButton.setDisable(false);
    }

    public void showTradePanel(String message) throws IOException {
        portDropdown.setVisible(false);
        tradeErrorMessage.setVisible(false);
        for (Label label : tradeLabels) {
            label.setText("0");
        }
        Player currentPlayer = GameState.currentPlayer;
        tradeLabel.setText("Trade with " + message);
        ActivityLog.appendText("\n\nPlayer " + currentPlayer.getIndex() + " chose to trade with " + message + "\n");

        for (ResourceCard resourceCard : currentPlayer.getResourceDeck()) {
            String name = resourceCard.getType();
            switch (name) {
                case "Brick":
                    tradeBrickLabel.setText(Integer.toString(Integer.parseInt(tradeBrickLabel.getText()) + 1));
                    break;
                case "Ore":
                    tradeOreLabel.setText(Integer.toString(Integer.parseInt(tradeOreLabel.getText()) + 1));
                    break;
                case "Grain":
                    tradeGrainLabel.setText(Integer.toString(Integer.parseInt(tradeGrainLabel.getText()) + 1));
                    break;
                case "Wood":
                    tradeWoodLabel.setText(Integer.toString(Integer.parseInt(tradeWoodLabel.getText()) + 1));
                    break;
                case "Wool":
                    tradeWoolLabel.setText(Integer.toString(Integer.parseInt(tradeWoolLabel.getText()) + 1));
                    break;
            }
        }
        if (message.equals("Ports")) {
            offerSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(2, 3));
            requestSpinner.getValueFactory().setValue(1);
            requestSpinner.setDisable(true);
            portDropdown.getItems().removeAll(portDropdown.getItems());
            portDropdown.setVisible(true);
            if (currentPlayer.hasPort()) {
                for (Port port : currentPlayer.getPorts()) {
                    portDropdown.getItems().add(port.getType());
                }
            }
        }
        if (message.equals("Bank")) {
            offerSpinner.getValueFactory().setValue(4);
            offerSpinner.setEditable(false);
            requestSpinner.getValueFactory().setValue(1);
            requestSpinner.setDisable(true);
        }
        if (message.equals("Others")) {
            offerSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 21));
            requestSpinner.setDisable(false);
            requestSpinner.setEditable(true);
            confirmTradeButton.setText("Propose");
        }

        TradeMenu.setVisible(false);
        TradePanel.setVisible(true);
        ConfirmButton.setDisable(true);
        CancelButton.setDisable(true); //the cancel button on main panel
        BuildButton.setDisable(true);
        TradeButton.setDisable(true);
        EndTurnButton.setDisable(true);
    }


    public void getFromBank(String resource) {
        switch (resource) {
            case "Brick":
                BrickLabel.setText(Integer.toString(Integer.parseInt(BrickLabel.getText()) - 1));
                break;
            case "Grain":
                GrainLabel.setText(Integer.toString(Integer.parseInt(GrainLabel.getText()) - 1));
                break;
            case "Ore":
                OreLabel.setText(Integer.toString(Integer.parseInt(OreLabel.getText()) - 1));
                break;
            case "Wood":
                WoodLabel.setText(Integer.toString(Integer.parseInt(WoodLabel.getText()) - 1));
                break;
            case "Wool":
                WoolLabel.setText(Integer.toString(Integer.parseInt(WoolLabel.getText()) - 1));
                break;
        }
    }

    public void addToBank(String resource) {
        switch (resource) {
            case "Brick":
                BrickLabel.setText(Integer.toString(Integer.parseInt(BrickLabel.getText()) + 1));
                break;
            case "Grain":
                GrainLabel.setText(Integer.toString(Integer.parseInt(GrainLabel.getText()) + 1));
                break;
            case "Ore":
                OreLabel.setText(Integer.toString(Integer.parseInt(OreLabel.getText()) + 1));
                break;
            case "Wood":
                WoodLabel.setText(Integer.toString(Integer.parseInt(WoodLabel.getText()) + 1));
                break;
            case "Wool":
                WoolLabel.setText(Integer.toString(Integer.parseInt(WoolLabel.getText()) + 1));
                break;
        }
    }

    @FXML
    public void confirmTrade() throws IOException {
        tradeErrorMessage.setVisible(false);
        String tradeType = tradeLabel.getText();
        Player currentPlayer = GameState.currentPlayer;
        String offeredResource = offerDropdown.getValue();
        int count = 0;
        for (ResourceCard resourceCard : currentPlayer.getResourceDeck()) {
            if (resourceCard.getType().equals(offeredResource)) count++;
        }
        int numOffered = offerSpinner.getValue();
        String offerEmpty = offerDropdown.getValue();
        String requestEmpty = requestDropdown.getValue();
        if (offerEmpty == null || requestEmpty == null) {
            tradeErrorMessage.setVisible(true);
            tradeErrorMessage.setText("Please make an offer and a request!");
            System.out.println("emptyyy");
            offerDropdown.valueProperty().set(null);
            requestDropdown.valueProperty().set(null);
        } else if (offerEmpty.equals(requestEmpty)) {
            tradeErrorMessage.setVisible(true);
            tradeErrorMessage.setText("Cannot trade & request the same resource!");
            offerDropdown.valueProperty().set(null);
            requestDropdown.valueProperty().set(null);
        } else if (numOffered > count) {
            tradeErrorMessage.setVisible(true);
            tradeErrorMessage.setText("Not enough resources of this type!");
        } else {
            String requestedResource = requestDropdown.getValue();
            if (tradeType.equals("Trade with Bank")) {
                if (count >= 4) {
                    int numRemoved = 0;
                    for (int i = 0; i < currentPlayer.getResourceDeck().size(); i++) {
                        if (numRemoved == 4) break;
                        if (currentPlayer.getResourceDeck().get(i).getType().equals(offeredResource)) {
                            currentPlayer.removeResource(i--);
                            numRemoved++;
                        }
                    }

                    getFromBank(requestedResource);
                    for (int i = 0; i < 4; i++) {
                        addToBank(offeredResource);
                    }
                    currentPlayer.addResources(new ArrayList<>(Arrays.asList(new ResourceCard(requestedResource, currentPlayer))));
                    MainLabel.setText("Trade Successful!");
                    closeTradePanel();
                } else {
                    tradeErrorMessage.setVisible(true);
                    tradeErrorMessage.setText("Not enough resources of this type!");
                }
            }
            if (tradeType.equals("Trade with Ports")) {
                String selectedPort = portDropdown.getValue();
                if (selectedPort == null) {
                    tradeErrorMessage.setVisible(true);
                    tradeErrorMessage.setText("Please select a Port!");
                    portDropdown.valueProperty().set(null);
                } else {
                    boolean selectedResourceOfPort = false;
                    if (selectedPort.equals("UnknownPort")) {
                        if (offerSpinner.getValue() != 3) {
                            tradeErrorMessage.setVisible(true);
                            tradeErrorMessage.setText("Please offer 3 resources of the same type!");
                        } else {
                            if (count >= 3) {
                                int numRemoved = 0;
                                for (int i = 0; i < currentPlayer.getResourceDeck().size(); i++) {
                                    if (numRemoved == 3) break;
                                    if (currentPlayer.getResourceDeck().get(i).getType().equals(offeredResource)) {
                                        currentPlayer.removeResource(i--);
                                        numRemoved++;
                                    }
                                }
                                getFromBank(requestedResource);
                                for (int i = 0; i < 3; i++) {
                                    addToBank(offeredResource);
                                }
                                currentPlayer.addResources(new ArrayList<>(Arrays.asList(new ResourceCard(requestedResource, currentPlayer))));
                                MainLabel.setText("Trade Successful!");
                                closeTradePanel();
                            } else {
                                tradeErrorMessage.setVisible(true);
                                tradeErrorMessage.setText("You don't have sufficient resources to make this trade!");
                            }
                        }
                    } else {
                        for (Port port : currentPlayer.getPorts()) {
                            if (offeredResource.equals(port.getResource())) selectedResourceOfPort = true;
                        }
                        if (!selectedResourceOfPort) {
                            tradeErrorMessage.setVisible(true);
                            tradeErrorMessage.setText("You don't have any Ports of that Resource!");
                        } else if (offerSpinner.getValue() != 2) {
                            tradeErrorMessage.setVisible(true);
                            tradeErrorMessage.setText("Please offer two resources!");
                        } else {
                            if (count >= 2) {
                                int numRemoved = 0;
                                for (int i = 0; i < currentPlayer.getResourceDeck().size(); i++) {
                                    if (numRemoved == 2) break;
                                    if (currentPlayer.getResourceDeck().get(i).getType().equals(offeredResource)) {
                                        System.out.println("hiii");
                                        currentPlayer.removeResource(i--);
                                        numRemoved++;
                                    }
                                }
                                getFromBank(requestedResource);
                                for (int i = 0; i < 2; i++) {
                                    addToBank(offeredResource);
                                }
                                MainLabel.setText("Trade Successful!");
                                closeTradePanel();
                            } else {
                                tradeErrorMessage.setVisible(true);
                                tradeErrorMessage.setText("You don't have sufficient resources to make this trade!");
                            }
                        }
                    }
                }

            }
            if (tradeType.equals("Trade with Others")) {
                GameState.isOthersTrading = true;
                int numRequested = requestSpinner.getValue();
                if (count >= numOffered) {
                    othersTradeErrorMessage.setVisible(false);
                    othersTradePanel.setVisible(true);
                    int nextPlayer = (currentPlayer.getIndex() % GameState.numPlayers) + 1;
                    othersTradeTitle.setText("Player " + nextPlayer + ", do you accept?");
                    othersTradeOffer.setText("Offer: " + numOffered + " " + offeredResource);
                    othersTradeRequest.setText("Request: " + numRequested + " " + requestedResource);
                } else {
                    tradeErrorMessage.setVisible(true);
                    tradeErrorMessage.setText("You don't have sufficient resources to make this trade!");
                }
            }

        }
    }

    @FXML
    public void confirmOthersTrade() throws IOException {
        othersTradeErrorMessage.setVisible(false);
        Player offerer = GameState.currentPlayer;
        int playerNumber = Integer.parseInt(othersTradeTitle.getText().substring(7, 8));
        Player confirmer = GameState.playerMap.get(playerNumber);
        StringTokenizer offerTokenizer = new StringTokenizer(othersTradeOffer.getText());
        StringTokenizer requestTokenizer = new StringTokenizer(othersTradeRequest.getText());
        offerTokenizer.nextToken();
        int numOffered = Integer.parseInt(offerTokenizer.nextToken());
        String typeOffered = offerTokenizer.nextToken();
        requestTokenizer.nextToken();
        int numRequested = Integer.parseInt(requestTokenizer.nextToken());
        String typeRequested = requestTokenizer.nextToken();
        ArrayList<ResourceCard> playerDeck = GameState.playerMap.get(playerNumber).getResourceDeck();
        int countOfRequestedResource = 0;
        for (ResourceCard resourceCard : playerDeck) {
            if (resourceCard.getType().equals(typeRequested)) countOfRequestedResource++;
        }
        if (countOfRequestedResource >= numRequested) {
            int numRemoved = 0;
            //PROCESSING OFFERER DECK
            for (int i = 0; i < offerer.getResourceDeck().size(); i++) {
                if (numRemoved >= numOffered) break;
                if (offerer.getResourceDeck().get(i).getType().equals(typeOffered)) {
                    offerer.removeResource(i--);
                    ++numRemoved;
                }
            }
            ArrayList<ResourceCard> toAdd = new ArrayList<>();
            for (int i = 0; i < numRequested; i++) {
                toAdd.add(new ResourceCard(typeRequested, offerer));
            }
            offerer.addResources(toAdd);
            //PROCESSING REQUESTOR DECK
            numRemoved = 0;
            for (int i = 0; i < confirmer.getResourceDeck().size(); i++) {
                if (numRemoved >= numRequested) break;
                if (confirmer.getResourceDeck().get(i).getType().equals(typeRequested)) {
                    confirmer.removeResource(i--);
                    ++numRemoved;
                }
            }
            toAdd = new ArrayList<>();
            for (int i = 0; i < numOffered; i++) {
                toAdd.add(new ResourceCard(typeOffered, confirmer));
            }
            confirmer.addResources(toAdd);
            othersTradePanel.setVisible(false);
            GameState.isOthersTrading = false;
            appendBoth("Trade successful between Players " + GameState.currentPlayerIndex + " and " + playerNumber + "!");
            closeTradePanel();
        } else {
            othersTradeErrorMessage.setVisible(true);
            othersTradeErrorMessage.setText("You don't have enough resources to accept!");
        }
    }

    @FXML
    public void denyOthersTrade() throws IOException {
        int nextTurn = (Integer.parseInt(othersTradeTitle.getText().substring(7, 8)) % GameState.numPlayers) + 1;
        if (nextTurn == GameState.currentPlayerIndex) {
            othersTradePanel.setVisible(false);
            closeTradePanel();
            appendBoth("No one accepted Player " + GameState.currentPlayerIndex + "'s trade!");
            GameState.isOthersTrading = false;
        } else {
            othersTradeTitle.setText("Player " + nextTurn + ", do you accept the trade?");
        }
    }

    @FXML
    public void show4For1() throws IOException {
        showTradePanel("Bank");
    }

    @FXML
    public void showOthers() throws IOException {
        showTradePanel("Others");
    }

    @FXML
    public void showPorts() throws IOException {
        showTradePanel("Ports");
    }

    @FXML
    public void closeTradePanel() throws IOException {
        Player currentPlayer = GameState.currentPlayer;
        TradePanel.setVisible(false);
        ConfirmButton.setDisable(false);
        CancelButton.setDisable(false);
        BuildButton.setDisable(false);
        TradeButton.setDisable(false);
        EndTurnButton.setDisable(false);
    }

    @FXML //activates when user selects which resource to trade.
    public void bankTrading() throws IOException {
        TradePanel.setVisible(false);


    }

    //  @FXML
    // public void

    @FXML
    public void rollDice() throws InterruptedException {
        RollDiceButton.setDisable(true);
        Random rand = new Random();
        int die1 = rand.nextInt(6) + 1;
        int die2 = rand.nextInt(6) + 1;
        int diceRoll = die1 + die2;
        if (GameState.gameStarted) {
            Player player = GameState.currentPlayer;
            int index = player.getIndex();
            appendBoth("Player " + index + " rolled " + diceRoll + "\n");
            if (diceRoll == 7) {//
                appendBoth("Click on a Number Token to Move the Robber to Another Tile" + "\n");
//                int previousRobberLocation = GameState.robberTokenIndex;
                //moveRobber();ImageView[] tileViews setImage((Image) Initialize.robber.getValue())
                for (ImageView i : tokenViews) {
                    i.setDisable(false);
                }
                GameState.isRemovingCards = true;
                removeCardsButton.setVisible(true);
                GameState.removePlayerIndex = GameState.currentPlayerIndex;
                tokenViews[GameState.robberTokenIndex].setDisable(true);
                tokenViews[GameState.desertTokenIndex].setDisable(true);
                openResourcePanel(GameState.currentPlayerIndex);
//                int currentRobberLocation = GameState.robberTokenIndex;
//                if(!previousRobberLocation.equals(currentRobberLocation)){
//                    BuildButton.setDisable(false);
//                    TradeButton.setDisable(false);
//                    EndTurnButton.setDisable(false);
//                }
            } else {
                cardAssignment(false, diceRoll);
                TradeButton.setDisable(false);
                EndTurnButton.setDisable(false);
            }

        } else {
            ActivityLog.appendText("Player " + GameState.currentPlayerIndex + " rolled " + diceRoll + "\n\n");
            GameState.setUpDice[GameState.currentPlayerIndex - 1] = diceRoll;
            if (GameState.currentPlayerIndex != GameState.numPlayers) {
                GameState.currentPlayerIndex = GameState.currentPlayerIndex + 1;
                GameState.currentPlayer = GameState.playerMap.get(GameState.currentPlayerIndex);
                appendBoth("Player " + GameState.currentPlayerIndex + ", roll the dice");
                RollDiceButton.setDisable(false);
            } else {
                RollDiceButton.setDisable(true);
                setUp();
            }
        }
    }

    public void moveRobber(int tokenLocation) {
        ActivityLog.appendText("Player " + GameState.currentPlayerIndex + " moved Raoul to Tile " + tokenLocation + "\n\n");
        if (GameState.robberTokenIndex != GameState.desertTokenIndex) {
            if (GameState.robberTokenIndex >= GameState.desertTokenIndex) {
                tokenViews[GameState.robberTokenIndex].setImage(GameState.tokens[GameState.robberTokenIndex - 1].getImage());
            } else {
                tokenViews[GameState.robberTokenIndex].setImage(GameState.tokens[GameState.robberTokenIndex].getImage());
            }

        } else {
            tokenViews[GameState.robberTokenIndex].setImage(null);
        }

        System.out.println("token number " + GameState.robberTokenIndex);
        if(!GameState.knightPlayed) {
            MainLabel.setText("Now steal from an opponent or end your turn");
        } else {
            MainLabel.setText("Now steal from an opponent");
            GameState.knightPlayed = false;
        }
//        if(GameState.pos[GameState.robberTokenIndex][0]== GameState.tokenMap.get("Desert")[0] && ) tokenViews[GameState.robberTokenIndex].setImage(null);
        tokenViews[tokenLocation].setImage((Image) Initialize.robber.getValue());
        String oldPos = Arrays.toString(GameState.tokenPos[GameState.robberTokenIndex]);
        GameState.posMap.get(oldPos).setHasRobber(false);
        System.out.println(GameState.posMap.get(oldPos).getName());
        GameState.robberTokenIndex = tokenLocation;
        String newPos = Arrays.toString(GameState.tokenPos[tokenLocation]);
        System.out.println(GameState.posMap.get(newPos).getName());
        GameState.posMap.get(newPos).setHasRobber(true);
        System.out.println("new robber location set: " + GameState.posMap.get(newPos).getHasRobber());
        for(Vertex vertex: GameState.posMap.get(newPos).getVertices()) {
            if(vertex.getPlayerIndex() >= 0 && vertex.getPlayerIndex() != GameState.currentPlayerIndex) {
                System.out.println("player found, index" + vertex.getPlayerIndex());
                GameState.stealablePlayers.add(vertex.getPlayerIndex());
            }
        }
        for(int i : GameState.stealablePlayers) {
            System.out.println(i +" ");
        }
        for (ImageView i : tokenViews) {
            i.setDisable(true);
        }
        StealButton.setDisable(false);
        EndTurnButton.setDisable(false);

    }

    public void appendBoth(String str) {
        ActivityLog.appendText(str + "\n");
        MainLabel.setText(str);
    }

    public void MarkerPressed(int index) {
        if(GameState.isBuildingCity) {

            if (GameState.allVertices[index].getPlayerIndex() != GameState.currentPlayerIndex) {
                MainLabel.setText("Please press on one of YOUR settlements");
            } else if(GameState.allVertices[index].getIsCity()) {
                MainLabel.setText("This location already has a city!");
            } else {
                VertexMarkers[index].setY(VertexMarkers[index].getY()-VertexMarkers[index].getHeight());
                VertexMarkers[index].setHeight(VertexMarkers[index].getHeight()*2);

                GameState.allVertices[index].setIsCity(true);
                GameState.isBuildingCity = false;
                BuildButton.setDisable(false);
                EndTurnButton.setDisable(false);
                for(Rectangle rect: VertexMarkers) {
                    rect.setDisable(true);
                }
                GameState.currentPlayer.addCity(GameState.allVertices[index]);
                GameState.currentPlayer.removeSettlement(GameState.allVertices[index]);
                appendBoth("Player "+ GameState.currentPlayerIndex+" built a city!");
                GameState.isBuilding = false;
            }
        } else {
            VertexMarkers[index].setFill(GameState.nameToColor.get(GameState.currentPlayer.getColor()));
            GameState.allVertices[index].setPlayerIndex(GameState.currentPlayerIndex);
            for (int i = 0; i < VertexMarkers.length; i++) {
                VertexMarkers[i].setDisable(true);
                if (GameState.allVertices[i].getPlayerIndex() <= 0) VertexMarkers[i].setVisible(false);
            }
            VertexMarkers[index].setVisible(true);
            GameState.currentPlayer.addSettlement(GameState.allVertices[index]);
            if(GameState.isBuilding) {
                appendBoth("Player "+ GameState.currentPlayerIndex+" built a settlement!");
                BuildButton.setDisable(false);
                EndTurnButton.setDisable(false);
                GameState.isBuilding = false;
            }
            if (!GameState.gameStarted) {
                String roadNum = GameState.firstSettlementsPlaced ? "second" : "first";
                MainLabel.setText("Now select your " + roadNum + " Road location");
                placeEdge();
            }
        }

    }


    public void EdgePressed(int index) {
        EdgeMarkers[index].setFill(GameState.nameToColor.get(GameState.currentPlayer.getColor()));
        GameState.allEdges[index].setPlayerIndex(GameState.currentPlayerIndex);
        GameState.currentPlayer.addRoad(GameState.allEdges[index]);
        for (int i = 0; i < EdgeMarkers.length; i++) {
            EdgeMarkers[i].setDisable(true);
            if (GameState.allEdges[i].getPlayerIndex() <= 0) EdgeMarkers[i].setVisible(false);
        }
        EdgeMarkers[index].setVisible(true);
        int roadLength = dfs(GameState.allEdges[index], new boolean[72], 1);
        if(roadLength > GameState.longestRoad) {
            GameState.longestRoad = roadLength;
            GameState.playerWithLongestRoad = GameState.currentPlayerIndex;
            longestRoadLabel.setText("Player "+ GameState.currentPlayerIndex+" has the longest road of length "+roadLength);
            if(roadLength >= 5) {
                GameState.currentPlayer.setHasLongestRoad(true);
                longestRoadLabel.setText("Player "+ GameState.currentPlayerIndex+" awarded 2 VPs for road of length "+roadLength);
            }
        }
        if(GameState.roadBuildingPlayed) {
            placeEdge();
            GameState.roadBuildingPlayed = false;
        }
        if(GameState.isBuilding) {
            BuildButton.setDisable(false);
            EndTurnButton.setDisable(false);
            GameState.isBuilding = false;
        }
        if(GameState.nextTurnOnEdge) nextTurn();
        if (!GameState.gameStarted) {
            String settlementNum = GameState.firstSettlementsPlaced ? "second" : "first";
            MainLabel.setText("Next, Player " + GameState.currentPlayerIndex + ", choose the location of your " + settlementNum + " settlement");
            placeSettlement();
        }
    }


    public int dfs(Edge edge, boolean[] visited, int count) {
        visited[edge.getBoardIndex()] = true;
        for(Edge surround: edge.getAdjacentEdges()) {
            if(!visited[surround.getBoardIndex()] && surround.getPlayerIndex() == GameState.currentPlayerIndex) {
                return dfs(surround, visited, count + 1);
            }
        }
        return count;
    }


    public void cardAssignment(boolean isFirst, int numRolled) {
        GameState.cardAssignment(isFirst, numRolled);
        ActivityLog.appendText("-----Resources Distributed-----\n");
        if (GameState.newCards.isEmpty()) appendBoth("NO RESOURCES DISTRIBUTED!");
        else {
            for (String[] newCard : GameState.newCards) {
                String cardName = newCard[1];
                ActivityLog.appendText("Player " + newCard[0] + " received " + cardName + "!\n");
                switch (cardName) {
                    case "Brick":
                        BrickLabel.setText(Integer.toString(Integer.parseInt(BrickLabel.getText()) - 1));
                        break;
                    case "Grain":
                        GrainLabel.setText(Integer.toString(Integer.parseInt(GrainLabel.getText()) - 1));
                        break;
                    case "Ore":
                        OreLabel.setText(Integer.toString(Integer.parseInt(OreLabel.getText()) - 1));
                        break;
                    case "Wood":
                        WoodLabel.setText(Integer.toString(Integer.parseInt(WoodLabel.getText()) - 1));
                        break;
                    case "Wool":
                        WoolLabel.setText(Integer.toString(Integer.parseInt(WoolLabel.getText()) - 1));
                        break;
                }
            }
        }
        ActivityLog.appendText("--------------------------------------\n");
    }

    //1,2,3,4
    public void nextTurn() {
        BuildButton.setDisable(true);
        TradeButton.setDisable(true);
        EndTurnButton.setDisable(true);
        int nextTurn = GameState.iterateForward ? (GameState.currentPlayerIndex % GameState.numPlayers) + 1 : (GameState.currentPlayerIndex + (GameState.numPlayers - 1)) % GameState.numPlayers;
        if (nextTurn == 0) nextTurn = GameState.numPlayers;
        if (GameState.lastEdgePlaced) {
            GameState.gameStarted = true;
            GameState.nextTurnOnEdge = false;
            GameState.lastEdgePlaced = false;
//            System.out.println("Next turn: "+nextTurn+", Current index: "+GameState.currentPlayerIndex);
//            int current = (nextTurn + (GameState.numPlayers - 1)) % GameState.numPlayers;
//            if (current == 0) current = GameState.numPlayers;
//            GameState.currentPlayerIndex = current;
            GameState.iterateForward = true;

            cardAssignment(true, 0);
            MainLabel.setText("Game Started! Player " + GameState.currentPlayerIndex + " roll the dice!");
            ActivityLog.appendText("---Round " + GameState.round + "---\n");
            RollDiceButton.setDisable(false);
        } else if (GameState.gameStarted) {
            for(DevCard dc: GameState.currentPlayer.getDevDeck()) {
                dc.setJustBought(false);
            }
            GameState.currentPlayerIndex = nextTurn;
            MainLabel.setText("Round " + GameState.round + "! Player " + nextTurn + " roll the dice!");
            ActivityLog.appendText("---Round " + GameState.round + "---\n");
            RollDiceButton.setDisable(false);
        } else {
            if (!GameState.gameStarted) {
                if (nextTurn == GameState.firstPlayerIndex) {
                    if (!GameState.firstSettlementsPlaced) {
                        GameState.firstSettlementsPlaced = true;
                        GameState.iterateForward = false;
                        nextTurn = GameState.currentPlayerIndex;
                    } else {
                        GameState.lastEdgePlaced = true;
                    }
                }
            }
            GameState.currentPlayerIndex = nextTurn;
        }

        GameState.currentPlayer = GameState.playerMap.get(GameState.currentPlayerIndex);
    }

    public void openResourcePanel(int playerIndex) {
        removeCardsButton.setDisable(true);
        for (int i = 0; i < playerCards.length; i++) {
            playerCards[i].setImage(null);
        }
        ResourcePanel.setVisible(false);
        for (Pane pane : resourcePane) {
            pane.setStyle(null);
        }

        ResourcePanel.setVisible(true);
        ResourceViewText.setText("Player " + playerIndex + "'s Resource Deck");
        for (int i = 0; i < GameState.playerMap.get(playerIndex).getResourceDeck().size(); i++) {
            playerCards[i].setImage(GameState.playerMap.get(playerIndex).getResourceDeck().get(i).getResourceImage());
        }
        for (int i = 0; i < GameState.playerMap.get(playerIndex).getResourceDeck().size(); i++) {
            System.out.println(GameState.playerMap.get(playerIndex).getResourceDeck().get(i).getType());
        }
        if(GameState.isRemovingCards) {
            GameState.removePlayerIndex = playerIndex;
            ArrayList<ResourceCard> deck = GameState.playerMap.get(GameState.removePlayerIndex).getResourceDeck();
            if(deck.size() < 7) {
                ResourceViewText.setText("Player " + playerIndex+", please press Exit; You don't need to remove cards");
            } else {
                exitResourcePanelButton.setDisable(true);
                removeCardsButton.setDisable(false);
                int numCardsRemove = deck.size() - (deck.size()+1)/2;
                GameState.numCardsRemove = numCardsRemove;
                removeCardsButton.setVisible(true);
                ResourceViewText.setText("Player "+playerIndex+", remove "+numCardsRemove+" cards");
            }

        }

    }

    public void highlightPane(int index) {
        if (GameState.selectedCards[index] == -1) {
            resourcePane[index].setStyle("-fx-border-color: seagreen");
        } else {
            resourcePane[index].setStyle(null);
        }
        GameState.selectedCards[index] = (GameState.selectedCards[index] == -1) ? index : -1;

    }

    @FXML
    public void removeCards() {
        int[] selectedCards = GameState.selectedCards;
        int numCardsRemoved = 0;
        for (int i = 0; i < 21; i++) {
            if (selectedCards[i] != -1) ++numCardsRemoved;
        }
        if(numCardsRemoved < GameState.numCardsRemove) {
            ResourceViewText.setText("You must remove at least "+GameState.numCardsRemove+" cards!");
        } else {
            for(ResourceCard card: GameState.playerMap.get(GameState.removePlayerIndex).getResourceDeck()) {
                System.out.print(card.getType()+" ");
            }
            System.out.println(Arrays.toString(selectedCards));

            for (int i = 20; i >= 0; i--) {
                if (selectedCards[i] == -1) continue;
                addToBank(GameState.playerMap.get(GameState.removePlayerIndex).getResourceDeck().get(selectedCards[i]).getType());
                GameState.playerMap.get(GameState.removePlayerIndex).removeResource(selectedCards[i]);
            }
            int[] reset = new int[21];
            Arrays.fill(reset, -1);
            GameState.selectedCards = reset;
            ResourcePanel.setVisible(false);
            for (int i = 0; i < playerCards.length; i++) {
                playerCards[i].setImage(null);
            }
            removeCardsButton.setVisible(false);
            exitResourcePanelButton.setDisable(false);
            for (Pane pane : resourcePane) {
                pane.setStyle(null);
            }

            ResourcePanel.setVisible(true);
            ResourceViewText.setText("Player " + GameState.removePlayerIndex + "'s Resource Deck");
            for (int i = 0; i < GameState.playerMap.get(GameState.removePlayerIndex).getResourceDeck().size(); i++) {
                playerCards[i].setImage(GameState.playerMap.get(GameState.removePlayerIndex).getResourceDeck().get(i).getResourceImage());
            }
            //add back to bank
            ResourceViewText.setText("Please press Exit; you are done removing cards");
            exitResourcePanelButton.setDisable(false);
            removeCardsButton.setDisable(true);

//            if((GameState.removePlayerIndex % GameState.numPlayers)+1 == GameState.currentPlayerIndex) {
//                GameState.isRemovingCards = false;
//                closeResourcePanel();
//            }
        }
    }

    @FXML
    public void showSteal() {
        stealErrorMessage.setVisible(false);
        resourceStolen.setVisible(false);
        stealCardButton.setDisable(false);
        stealPanel.setVisible(true);
        ConfirmButton.setDisable(true);
        CancelButton.setDisable(true);
        BuildButton.setDisable(true);
        TradeButton.setDisable(true);
        EndTurnButton.setDisable(true);
        StealButton.setDisable(true);
        exitStealButton.setDisable(true);
        whoToStealLabel.setText("Player "+GameState.currentPlayerIndex+", who do you want to steal from?");
        for(int i : GameState.stealablePlayers) {
            System.out.println(i +" ");
        }
        for(int playerNum: GameState.stealablePlayers) {
            stealDropdown.getItems().add("Player " + playerNum);
        }
        if(GameState.stealablePlayers.isEmpty()) {
            stealErrorMessage.setVisible(true);
            stealErrorMessage.setText("You have no players to steal from! Press Exit");
            stealCardButton.setDisable(true);
            exitStealButton.setDisable(false);
            GameState.stealablePlayers.clear();
        }
    }

    @FXML
    public void steal() {
        stealCardButton.setDisable(true);
        String playerToSteal = stealDropdown.getValue();
        if(playerToSteal == null) {
            stealErrorMessage.setVisible(true);
            stealErrorMessage.setText("Please choose a Player to steal from!");
            stealCardButton.setDisable(false);
        } else {
            int playerNum = Integer.parseInt(playerToSteal.substring(7,8));
            if(GameState.playerMap.get(playerNum).getResourceDeck().isEmpty()) {
                stealErrorMessage.setVisible(true);
                stealErrorMessage.setText("You tried but stole nothing!");
            } else {
                int limit = GameState.playerMap.get(playerNum).getResourceDeck().size();
                Random rand = new Random();
                int toRemove = rand.nextInt(limit);
                String resource = GameState.playerMap.get(playerNum).getResourceDeck().get(toRemove).getType();
                resourceStolen.setVisible(true);
                resourceStolen.setText("You stole a "+resource+" from Player "+ playerNum);
                ActivityLog.appendText("Player "+GameState.currentPlayerIndex+" stole a "+ resource+" from Player "+ playerNum);
                GameState.playerMap.get(playerNum).removeResource(toRemove);
                GameState.currentPlayer.addResources(new ArrayList<>(Arrays.asList(new ResourceCard(resource, GameState.currentPlayer))));
            }
            exitStealButton.setDisable(false);
            stealErrorMessage.setVisible(false);
        }
    }

    @FXML
    public void exitSteal() {
        stealPanel.setVisible(false);
        GameState.stealablePlayers.clear();
        stealDropdown.getItems().clear();
        MainLabel.setText("End your turn");
        EndTurnButton.setDisable(false);
    }

    @FXML
    public void endTurn() {
        GameState.round = GameState.round + 1;
        Player currentPlayer = GameState.currentPlayer;
        ActivityLog.appendText("\n\nPlayer " + currentPlayer.getIndex() + " ended their turn. \n\n");
        nextTurn();
    }

    @FXML
    public void closeResourcePanel() {
        ResourcePanel.setVisible(false);
        for (int i = 0; i < playerCards.length; i++) {
            playerCards[i].setImage(null);
        }
        System.out.println( GameState.isRemovingCards );
        if((GameState.removePlayerIndex % GameState.numPlayers)+1 == GameState.currentPlayerIndex) {
            GameState.isRemovingCards = false;
        }
        if(GameState.isRemovingCards) {
            openResourcePanel((GameState.removePlayerIndex % GameState.numPlayers)+1);
        }
        removeCardsButton.setVisible(true);
    }

    public void openDevPanel(int playerIndex) {
        devCardErrorMessage.setVisible(false);
        devCardLabel.setText("Player "+playerIndex+"'s Dev Card Deck");
        victoryPointsLabel.setText("You have "+GameState.currentPlayer.getVictoryPoints()+" victory points");
        for(Pane pane: devCardPanes) {
            pane.setStyle(null);
        }
        for(int i = 0; i < GameState.playerMap.get(playerIndex).getDevDeck().size(); i++) {
            devCards[i].setImage(GameState.playerMap.get(playerIndex).getDevDeck().get(i).getImage());
        }
        devCardPanel.setVisible(true);
    }

    public void closeDevPanel() {
        for(int i = 0; i< devCards.length; i++) {
            devCards[i].setImage(null);
        }
        devCardPanel.setVisible(false);
    }

    public void highlightDevPane(int index) {
        for(Pane pane: devCardPanes) {
            pane.setStyle(null);
        }
        GameState.selectedDevCardIndex = index;
        devCardPanes[index].setStyle("-fx-border-color: seagreen");
    }

    @FXML
    public void useDevCard() {
        Player player = GameState.currentPlayer;
        DevCard card = player.getDevDeck().get(GameState.selectedDevCardIndex);
        String type = card.getType();
        if(card.getIsVictory()) {
            devCardErrorMessage.setVisible(true);
            devCardErrorMessage.setText("You can't use a Victory Point card!");
        } else if(card.isJustBought()){
            devCardErrorMessage.setVisible(true);
            devCardErrorMessage.setText("Cannot play a development card just bought!");
        }
        else {
            devCardPanel.setVisible(false);
            GameState.currentPlayer.removeDevCard(GameState.selectedDevCardIndex);
            EndTurnButton.setDisable(true);
            BuildButton.setDisable(true);
            switch(type) {
                case "Knight":
                    GameState.knightPlayed = true;
                    appendBoth("Click on a Number Token to Move the Robber to Another Tile" + "\n");
                    for (ImageView i : tokenViews) {
                        i.setDisable(false);
                    }
                    break;
                case "RoadBuilding":
                    MainLabel.setText("Place two roads");
                    placeEdge();
                    break;
            }
        }
    }

    @FXML
    void devCardPanePressed1(MouseEvent event) {
        if(GameState.playerMap.get(GameState.currentPlayerIndex).getDevDeck().size() > 0) {
            highlightDevPane(0);
            useDevCardButton.setDisable(false);
        }
    }

    @FXML
    void devCardPanePressed2(MouseEvent event) {
        if(GameState.playerMap.get(GameState.currentPlayerIndex).getDevDeck().size() > 1) {
            highlightDevPane(1);
            useDevCardButton.setDisable(false);
        }
    }

    @FXML
    void devCardPanePressed3(MouseEvent event) {
        if(GameState.playerMap.get(GameState.currentPlayerIndex).getDevDeck().size() > 2) {
            highlightDevPane(2);
            useDevCardButton.setDisable(false);
        }
    }

    @FXML
    void devCardPanePressed4(MouseEvent event) {
        if(GameState.playerMap.get(GameState.currentPlayerIndex).getDevDeck().size() > 3) {
            highlightDevPane(3);
            useDevCardButton.setDisable(false);
        }
    }

    @FXML
    void devCardPanePressed5(MouseEvent event) {
        if(GameState.playerMap.get(GameState.currentPlayerIndex).getDevDeck().size() > 4) {
            highlightDevPane(4);
            useDevCardButton.setDisable(false);
        }
    }

    @FXML
    void devCardPanePressed6(MouseEvent event) {
        if(GameState.playerMap.get(GameState.currentPlayerIndex).getDevDeck().size() > 5) {
            highlightDevPane(5);
            useDevCardButton.setDisable(false);
        }
    }
    @FXML
    public void showDevView1() {
        if ((GameState.isOthersTrading || GameState.currentPlayerIndex == 1) && !GameState.isRemovingCards) openDevPanel(1);
        else MainLabel.setText("You can only view your Dev Card Deck!");
    }

    @FXML
    public void showDevView2() {
        if ((GameState.isOthersTrading || GameState.currentPlayerIndex == 2) && !GameState.isRemovingCards) openDevPanel(2);
        else MainLabel.setText("You can only view your Dev Card Deck!");
    }

    @FXML
    public void showDevView3() {
        if ((GameState.isOthersTrading || GameState.currentPlayerIndex == 3) && !GameState.isRemovingCards) openDevPanel(3);
        else MainLabel.setText("You can only view your Dev Card Deck!");
    }

    @FXML
    public void showDevView4() {
        if ((GameState.isOthersTrading || GameState.currentPlayerIndex == 4) && !GameState.isRemovingCards) openDevPanel(4);
        else MainLabel.setText("You can only view your Dev Card Deck!");
    }

    @FXML
    public void showResourceView1() {
        if ((GameState.isOthersTrading || GameState.currentPlayerIndex == 1) && !GameState.isRemovingCards) openResourcePanel(1);
        else MainLabel.setText("You can only view your Resource Deck!");
    }

    @FXML
    public void showResourceView2() {
        if ((GameState.isOthersTrading || GameState.currentPlayerIndex == 2) && !GameState.isRemovingCards) openResourcePanel(2);
        else MainLabel.setText("You can only view your Resource Deck!");
    }

    @FXML
    public void showResourceView3() {
        if ((GameState.isOthersTrading || GameState.currentPlayerIndex == 3) && !GameState.isRemovingCards) openResourcePanel(3);
        else MainLabel.setText("You can only view your Resource Deck!");
    }

    @FXML
    public void showResourceView4() {
        if ((GameState.isOthersTrading || GameState.currentPlayerIndex == 4) && !GameState.isRemovingCards) openResourcePanel(4);
        else MainLabel.setText("You can only view your Resource Deck!");
    }

    @FXML
    void resourcePanePressed1(MouseEvent event) {
        if (GameState.isRemovingCards && GameState.playerMap.get(GameState.removePlayerIndex).getResourceDeck().size() > 0) highlightPane(0);
    }

    @FXML
    void resourcePanePressed10(MouseEvent event) {
        if (GameState.isRemovingCards && GameState.playerMap.get(GameState.removePlayerIndex).getResourceDeck().size() > 9) highlightPane(9);
    }

    @FXML
    void resourcePanePressed11(MouseEvent event) {
        if (GameState.isRemovingCards && GameState.playerMap.get(GameState.removePlayerIndex).getResourceDeck().size() > 10) highlightPane(10);
    }

    @FXML
    void resourcePanePressed12(MouseEvent event) {
        if (GameState.isRemovingCards && GameState.playerMap.get(GameState.removePlayerIndex).getResourceDeck().size() > 11) highlightPane(11);
    }

    @FXML
    void resourcePanePressed13(MouseEvent event) {
        if (GameState.isRemovingCards && GameState.playerMap.get(GameState.removePlayerIndex).getResourceDeck().size() > 12) highlightPane(12);
    }

    @FXML
    void resourcePanePressed14(MouseEvent event) {
        if (GameState.isRemovingCards && GameState.playerMap.get(GameState.removePlayerIndex).getResourceDeck().size() > 13) highlightPane(13);
    }

    @FXML
    void resourcePanePressed15(MouseEvent event) {
        if (GameState.isRemovingCards && GameState.playerMap.get(GameState.removePlayerIndex).getResourceDeck().size() > 14) highlightPane(14);
    }

    @FXML
    void resourcePanePressed16(MouseEvent event) {
        if (GameState.isRemovingCards && GameState.playerMap.get(GameState.removePlayerIndex).getResourceDeck().size() > 15) highlightPane(15);
    }

    @FXML
    void resourcePanePressed17(MouseEvent event) {
        if (GameState.isRemovingCards && GameState.playerMap.get(GameState.removePlayerIndex).getResourceDeck().size() > 16) highlightPane(16);
    }

    @FXML
    void resourcePanePressed18(MouseEvent event) {
        if (GameState.isRemovingCards && GameState.playerMap.get(GameState.removePlayerIndex).getResourceDeck().size() > 17) highlightPane(17);
    }

    @FXML
    void resourcePanePressed19(MouseEvent event) {
        if (GameState.isRemovingCards && GameState.playerMap.get(GameState.removePlayerIndex).getResourceDeck().size() > 18) highlightPane(18);
    }

    @FXML
    void resourcePanePressed2(MouseEvent event) {
        if (GameState.isRemovingCards && GameState.playerMap.get(GameState.removePlayerIndex).getResourceDeck().size() > 1) highlightPane(1);
    }

    @FXML
    void resourcePanePressed20(MouseEvent event) {
        if (GameState.isRemovingCards && GameState.playerMap.get(GameState.removePlayerIndex).getResourceDeck().size() > 19) highlightPane(19);
    }

    @FXML
    void resourcePanePressed21(MouseEvent event) {
        if (GameState.isRemovingCards && GameState.playerMap.get(GameState.removePlayerIndex).getResourceDeck().size() > 20) highlightPane(20);
    }

    @FXML
    void resourcePanePressed3(MouseEvent event) {
        if (GameState.isRemovingCards && GameState.playerMap.get(GameState.removePlayerIndex).getResourceDeck().size() > 2) highlightPane(2);
    }

    @FXML
    void resourcePanePressed4(MouseEvent event) {
        if (GameState.isRemovingCards && GameState.playerMap.get(GameState.removePlayerIndex).getResourceDeck().size() > 3) highlightPane(3);
    }

    @FXML
    void resourcePanePressed5(MouseEvent event) {
        if (GameState.isRemovingCards && GameState.playerMap.get(GameState.removePlayerIndex).getResourceDeck().size() > 4) highlightPane(4);
    }

    @FXML
    void resourcePanePressed6(MouseEvent event) {
        if (GameState.isRemovingCards && GameState.playerMap.get(GameState.removePlayerIndex).getResourceDeck().size() > 5) highlightPane(5);
    }

    @FXML
    void resourcePanePressed7(MouseEvent event) {
        if (GameState.isRemovingCards && GameState.playerMap.get(GameState.removePlayerIndex).getResourceDeck().size() > 6) highlightPane(6);
    }

    @FXML
    void resourcePanePressed8(MouseEvent event) {
        if (GameState.isRemovingCards && GameState.playerMap.get(GameState.removePlayerIndex).getResourceDeck().size() > 7) highlightPane(7);
    }

    @FXML
    void resourcePanePressed9(MouseEvent event) {
        if (GameState.isRemovingCards && GameState.playerMap.get(GameState.removePlayerIndex).getResourceDeck().size() > 8) highlightPane(8);
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

    @FXML
    public void TokenAPressed(MouseEvent event) {
        moveRobber(0);
    }

    @FXML
    void TokenBPressed(MouseEvent event) {
        moveRobber(1);
    }

    @FXML
    void TokenCPressed(MouseEvent event) {
        moveRobber(2);
    }

    @FXML
    void TokenDPressed(MouseEvent event) {
        moveRobber(3);
    }

    @FXML
    void TokenEPressed(MouseEvent event) {
        moveRobber(4);
    }

    @FXML
    void TokenFPressed(MouseEvent event) {
        moveRobber(5);
    }

    @FXML
    void TokenGPressed(MouseEvent event) {
        moveRobber(6);
    }

    @FXML
    void TokenHPressed(MouseEvent event) {
        moveRobber(7);
    }

    @FXML
    void TokenIPressed(MouseEvent event) {
        moveRobber(8);
    }

    @FXML
    void TokenJPressed(MouseEvent event) {
        moveRobber(9);
    }

    @FXML
    void TokenKPressed(MouseEvent event) {
        moveRobber(10);
    }

    @FXML
    void TokenLPressed(MouseEvent event) {
        moveRobber(11);
    }

    @FXML
    void TokenMPressed(MouseEvent event) {
        moveRobber(12);
    }

    @FXML
    void TokenNPressed(MouseEvent event) {
        moveRobber(13);
    }

    @FXML
    void TokenOPressed(MouseEvent event) {
        moveRobber(14);
    }

    @FXML
    void TokenPPressed(MouseEvent event) {
        moveRobber(15);
    }

    @FXML
    void TokenQPressed(MouseEvent event) {
        moveRobber(16);
    }

    @FXML
    void TokenRPressed(MouseEvent event) {
        moveRobber(17);
    }

    @FXML
    void TokenNullPressed(MouseEvent event) {
        moveRobber(18);
    }
    @FXML
    void confirmButtonClicked() {
        MainLabel.setText("You pressed a button. Nothing happened.");
    }
    @FXML
    void cancelButtonClicked() {
        MainLabel.setText("You pressed a button. Nothing happened.");
    }
}
