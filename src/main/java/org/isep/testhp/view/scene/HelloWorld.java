package org.isep.testhp.view.scene;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import org.isep.testhp.controller.CounterController;
import org.isep.testhp.controller.HelloWorldController;

public class HelloWorld {

    private final Button buttonBack;
    private final Label text;
    private final Scene scene;

    public HelloWorld(HelloWorldController controller) {
        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        buttonBack = new Button("Retour au compteur");
        text = new Label("Hello World");
        root.getChildren().addAll(buttonBack, text);
        scene = new Scene(root, 800, 600);

        controller.setView(this);
    }

    public Button getButtonBack() {
        return buttonBack;
    }

    public Scene getScene() {
        return scene;
    }
}
