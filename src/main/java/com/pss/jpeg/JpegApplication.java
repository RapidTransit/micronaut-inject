package com.pss.jpeg;

import com.pss.jpeg.annotations.PrimaryStage;
import com.pss.jpeg.annotations.SecondaryStage;
import io.micronaut.context.ApplicationContext;
import io.micronaut.context.annotation.Factory;
import io.micronaut.inject.qualifiers.Qualifiers;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.inject.Singleton;

@Factory
public class JpegApplication extends Application {

    private static ApplicationContext context;
    private static Stage pstage;

    public static void main(String[] args) {

        Application.launch(JpegApplication.class, args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        pstage = primaryStage;
        context = ApplicationContext.run();
        context.registerSingleton(Stage.class, primaryStage, Qualifiers.byStereotype(PrimaryStage.class));
        MainView bean = context.getBean(MainView.class);
        primaryStage.setScene(new Scene(bean, 1000, 1000));
        primaryStage.show();
    }

    @Singleton
    @SecondaryStage
    public Stage secondaryStage(MainModel model){
        Stage stage = new Stage();

        return stage;
    }

//    @Singleton
//    @PrimaryStage
//    public Stage primaryStage(){
//        return pstage;
//    }
}
