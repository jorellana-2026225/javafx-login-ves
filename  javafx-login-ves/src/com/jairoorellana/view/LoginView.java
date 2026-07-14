package com.jairoorellana.view;

import com.jairoorellana.controller.ImageController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.paint.Color;

public class LoginView extends BorderPane {

    private static LoginView instanciaLoginView;
    private Button btnCerrarVentana;
    private Label lblTituloVentana;
    private HBox barraDeOpciones;
    private VBox cajaVertical;
    private Label lblNombreUsuario;
    private TextField txtNombreUsuario;
    private Label lblClave;
    private PasswordField pwdClave;

    private GridPane formulario;
    private ImageView imgLogoLogin;
    private Button btnIniciarSesion;

//Constructor
    private LoginView() {
        this.setPadding(new Insets(15));
        this.setBorder(new Border(
                new BorderStroke(Paint.valueOf("#000000"), //Color del borde
                        BorderStrokeStyle.SOLID, //Estilo del borde
                        new CornerRadii(22), //Pixeles del redondeado
                        new BorderWidths(6)) //Ancho del borde
        ));

        this.setBackground(new Background(
                new BackgroundFill(Color.GRAY, //Color del fondo
                        new CornerRadii(25), //Pixeles del redondeado
                        Insets.EMPTY) //Espaciado del fondo
        ));

        barraDeOpciones = new HBox(25);

        btnCerrarVentana = new Button("X");
        lblTituloVentana = new Label("JavaFX - Simulacion Login");

        barraDeOpciones.getChildren().addAll(btnCerrarVentana, lblTituloVentana);
        this.setTop(barraDeOpciones);

        //Objetos del Formulario
        cajaVertical = new VBox();

        formulario = new GridPane();

        lblNombreUsuario = new Label("Ingrese su Nombre de Usuario");
        txtNombreUsuario = new TextField();

        lblClave = new Label("Ingrese su Contraseña");
        pwdClave = new PasswordField();

        formulario.add(lblNombreUsuario, 0, 0);
        formulario.add(txtNombreUsuario, 1, 0);

        formulario.add(lblClave, 0, 1);
        formulario.add(pwdClave, 1, 1);

        imgLogoLogin = new ImageView(new ImageController().getImageLogin("logo"));
        imgLogoLogin.setFitWidth(100);
        imgLogoLogin.setFitHeight(100);
        imgLogoLogin.setCache(true);
        
        cajaVertical.setAlignment(Pos.CENTER);
        
        btnIniciarSesion = new Button("Iniciar Sesion");

        cajaVertical.getChildren().addAll(imgLogoLogin, formulario, btnIniciarSesion);
        this.setCenter(cajaVertical);

    }

//Metodos
    public static LoginView getInstanciaLoginView() {
        if (instanciaLoginView == null) {
            instanciaLoginView = new LoginView();
        }
        return instanciaLoginView;
    }

    public static void setInstanciaLoginView(LoginView instanciaLoginView) {
        LoginView.instanciaLoginView = instanciaLoginView;
    }

//Getters y Setters   
    public Button getBtnCerrarVentana() {
        return btnCerrarVentana;
    }

    public void setBtnCerrarVentana(Button btnCerrarVentana) {
        this.btnCerrarVentana = btnCerrarVentana;
    }

    public Label getLblTituloVentana() {
        return lblTituloVentana;
    }

    public void setLblTituloVentana(Label lblTituloVentana) {
        this.lblTituloVentana = lblTituloVentana;
    }

    public HBox getBarraDeOpciones() {
        return barraDeOpciones;
    }

    public void setBarraDeOpciones(HBox barraDeOpciones) {
        this.barraDeOpciones = barraDeOpciones;
    }

}
