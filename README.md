--module-path "javafx-sdk-17.0.1/lib" --add-modules javafx.controls,javafx.fxml

Player class
public Player(Role r, BufferedImage icon){
        role = r;
        graphics = icon;
    }
    
GameInitialization class//initialize each player
private void initializePlayers(int numPlayers){
        List<Role> roleList = new ArrayList<>(Role.getRoles());
        Collections.shuffle(roleList);
        Queue<Role> roleQueue = new LinkedList<>(roleList);
        for (int i = 0; i < numPlayers; i++){
            Role r = roleQueue.remove();
            BufferedImage im = null;
            try {
                im = ImageIO.read(Objects.requireNonNull(ForbiddenIsland.class.getResourceAsStream("/images/players/icons/" + r.getClass().getSimpleName() + "_Adventurer_Icon.png")));
            } catch (IOException ie) {
                ie.printStackTrace();
            }
            players.add(new Player(r, im));
        }
 PlayerGraphics class//buffered -> FX
  for (Player p : players){
            int x = p.getPositionX();
            int y = p.getPositionY();
            StackPane s = (StackPane) board.getChildren().get(to1DArrayIndex(x, y));
            ImageView img = new ImageView(SwingFXUtils.toFXImage(p.getGraphics(), null));
            if (p.equals(currentPlayer)) {
                img.setOnMouseClicked((event) -> {
                    ContextMenu menu = new ContextMenu();
                    if (currentPlayer.getRole().getName().equalsIgnoreCase("Pilot") && !TurnManager.hasDoneSpecialAction()) {
                        MenuItem moveMenu = new MenuItem("Fly");
                        moveMenu.setOnAction(event2 -> {
                            for (Tile t : p.getRole().getMovableTiles(p)) {
                                int x1 = t.getPositionX();
                                int y1 = t.getPositionY();
                                StackPane sp = (StackPane) board.getChildren().get(to1DArrayIndex(x1, y1));
                                ImageView c = new ImageView(SwingFXUtils.toFXImage(selectIcon, null));
                                StackPane pa = new StackPane(c);
                                pa.setOnMouseClicked((event1) -> {
                                    if (TurnManager.addAction("P (" + x + ", " + y + "), (" + x1 + ", " + y1 + ")")) {
                                        p.setPos(x1, y1);
                                        refreshDisplay();
                                    }
                                });
                                sp.getChildren().add(pa);
                            }
                        });
                        menu.getItems().add(moveMenu);
                        menu.show(img, Side.BOTTOM, 0, 0);
                    }
