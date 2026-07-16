package com.jairoorellana.controller;

import com.jairoorellana.view.LoginView;
import com.jairoorellana.controller.LoginController;
import com.jairoorellana.view.BienvenidaView;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;

public class SceneManager {
    
    private Stage escenarioPrincipal;
    private Stage escenarioSecundario;
    private Scene escenaPrincipal;
    private static SceneManager instanciaSceneManager;

//Constructores    
    public static SceneManager getInstanciaSceneManager() {
        if (instanciaSceneManager == null) {
            instanciaSceneManager = new SceneManager();
        }
        return instanciaSceneManager;
    }
    
    public static void setInstanciaSceneManager(SceneManager instanciaSceneManager) {
        SceneManager.instanciaSceneManager = instanciaSceneManager;
        
    }
    
    public SceneManager() {
    }
    
    public SceneManager(Stage escenarioPrincipal, Stage escenarioSecundario, Scene escenaPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
        this.escenarioSecundario = escenarioSecundario;
        this.escenaPrincipal = escenaPrincipal;
    }

//Metodos
    public void ventanaBienvenida() {
        try {
            
            this.escenarioSecundario = new Stage();
            this.escenarioSecundario.initStyle(StageStyle.TRANSPARENT);
            this.escenarioSecundario.initModality(Modality.APPLICATION_MODAL);
            BienvenidaView bienvenida = new BienvenidaView();
            this.escenaPrincipal = new Scene(bienvenida, 350, 400);
            this.escenarioSecundario.setScene(escenaPrincipal);
            this.escenarioSecundario.sizeToScene();
            this.escenarioSecundario.showAndWait();
            
        } catch (NullPointerException objetoNulo) {
            JOptionPane.showMessageDialog(null, "Error de Objeto Nulo: Ventana Bienvenida");
            objetoNulo.printStackTrace();
        } catch (Exception errorPadre) {
            JOptionPane.showMessageDialog(null, "Error Padre: Ventana Bienvenida");
            errorPadre.printStackTrace();
        }
    }
    
    public void ventanaLogin() {
        try {
            
            this.escenarioPrincipal.initStyle(StageStyle.TRANSPARENT);
            LoginView login = LoginView.getInstanciaLoginView();
            cambiarEscena(login, 450, 500);
            this.escenaPrincipal.setFill(Color.TRANSPARENT);
            new LoginController(login);
            
        } catch (NullPointerException objetoNulo) {
            JOptionPane.showMessageDialog(null, "Error de Objeto Nulo: Ventana Login");
            objetoNulo.printStackTrace();
        } catch (Exception errorPadre) {
            JOptionPane.showMessageDialog(null, "Error Padre: Ventana Login");
            errorPadre.printStackTrace();
        }
        
    }
    
    public void cambiarEscena(Pane panel, int ancho, int alto) {
        try {
            
            escenaPrincipal = new Scene(panel, ancho, alto);
            this.escenarioPrincipal.setScene(escenaPrincipal);
            this.escenarioPrincipal.sizeToScene();
            this.escenarioPrincipal.show();
            
        } catch (NullPointerException objetoNulo) {
            JOptionPane.showMessageDialog(null, "Error de Objeto Nulo: Cambiar Escena");
            objetoNulo.printStackTrace();
        } catch (Exception errorPadre) {
            JOptionPane.showMessageDialog(null, "Error Padre: Cambiar Escena");
            errorPadre.printStackTrace();
        }
    }
    
    public void vistaPrincipal() {
        this.escenarioPrincipal.setTitle("Loguin");
    }

//Getters y Setters    
    public Stage getEscenarioPrincipal() {
        return escenarioPrincipal;
    }
    
    public void setEscenarioPrincipal(Stage escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }
    
    public Stage getEscenarioSecundario() {
        return escenarioSecundario;
    }
    
    public void setEscenarioSecundario(Stage escenarioSecundario) {
        this.escenarioSecundario = escenarioSecundario;
    }
    
    public Scene getEscenaPrincipal() {
        return escenaPrincipal;
    }
    
    public void setEscenaPrincipal(Scene escenaPrincipal) {
        this.escenaPrincipal = escenaPrincipal;
    }
    
}
