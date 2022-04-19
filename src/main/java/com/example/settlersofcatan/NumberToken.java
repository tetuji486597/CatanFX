package com.example.settlersofcatan;

import javafx.scene.image.Image;

public class NumberToken {
    private int token;
    private javafx.scene.image.Image tokenImage;

    public NumberToken (int token, Image myImage){
        this.token = token;
        tokenImage = myImage;
    }

    public Image getImage() {
        return tokenImage;
    }
}
