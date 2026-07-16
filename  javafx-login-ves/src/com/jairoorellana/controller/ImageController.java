package com.jairoorellana.controller;

import javafx.scene.image.Image;

public class ImageController {

    private final String RUTA_IMAGENES = "com/jairoorellana/resources/";

    public Image getImageLogin(String nombreImagen) {
        Image crearImagen;

        switch (nombreImagen) {
            case "logo":
                crearImagen = new Image(RUTA_IMAGENES + "login-logo.jpg");
                break;
            default:
                crearImagen = new Image(RUTA_IMAGENES + "login-logo.jpg");
        }
        return crearImagen;
    }

}
