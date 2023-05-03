package org.isep.testhp;

import javafx.application.Application;
import javafx.stage.Stage;
import org.isep.testhp.controller.CounterController;
import org.isep.testhp.view.SceneManager;



public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        SceneManager sceneManager = new SceneManager(primaryStage);

        new CounterController(sceneManager);

        sceneManager.switchToScene("counter");

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}