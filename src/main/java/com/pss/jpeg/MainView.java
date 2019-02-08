package com.pss.jpeg;

import com.pss.jpeg.annotations.PrimaryStage;
import com.pss.jpeg.annotations.SecondaryStage;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.inject.Inject;
import javax.inject.Singleton;


public class MainView extends VBox {

    private final Stage primary;
    private final Stage secondary;


    @Inject
    public MainView(@PrimaryStage Stage primary, @SecondaryStage Stage secondary) {
        this.primary = primary;
        this.secondary = secondary;
    }
}
