package com.jairoorellana.view;

import javafx.scene.layout.VBox;

public class BienvenidaView extends VBox {

    private static BienvenidaView instanciaBienvenidaView;

    public BienvenidaView() {
    }

    public static BienvenidaView getInstanciaBienvenidaView() {
//        if(instanciaBienvenidaView == null)
//            instanciaBienvenidaView = BienvenidaView();
        return instanciaBienvenidaView;
    }

    public static void setInstanciaBienvenidaView(BienvenidaView instanciaBienvenidaView) {
        BienvenidaView.instanciaBienvenidaView = instanciaBienvenidaView;
    }

}
