package com.jairoorellana.view;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class BienvenidaView extends VBox {

    private static BienvenidaView instanciaBienvenidaView;
    private Label lblTitulo;
    private Label lblMensaje;

    public BienvenidaView() {
        construirVista();
    }

    public void construirVista() { //Metodo para personalizar la Ventana Secundaria :D
        this.setSpacing(20);
        this.setAlignment(Pos.CENTER);
        this.setStyle("-fx-background-color: #2F3136; -fx-padding: 40px;");

        lblTitulo = new Label("Panchito te Aprobo");
        lblTitulo.setFont(Font.font("System", FontWeight.BOLD, 24));
        lblTitulo.setStyle("-fx-text-fill: #FFFFFF;");

        lblMensaje = new Label("Bienvenido al Sistema");
        lblMensaje.setFont(Font.font("System", 16));
        lblMensaje.setStyle("-fx-text-fill: #B9BBBE;");

        this.getChildren().addAll(lblTitulo, lblMensaje);
    }

    public static BienvenidaView getInstanciaBienvenidaView() {
        if (instanciaBienvenidaView == null) {
            instanciaBienvenidaView = new BienvenidaView();
        }
        return instanciaBienvenidaView;
    }

    public static void setInstanciaBienvenidaView(BienvenidaView instanciaBienvenidaView) {
        BienvenidaView.instanciaBienvenidaView = instanciaBienvenidaView;
    }

}
