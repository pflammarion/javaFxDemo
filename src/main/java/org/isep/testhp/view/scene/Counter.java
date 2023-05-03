package org.isep.testhp.view.scene;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import org.isep.testhp.controller.CounterController;

public class Counter {

    private final Button buttonCounter;
    private final Button buttonChange;
    private final Label counterLabel;
    private final Scene scene;

    public Counter(CounterController controller) {
        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        buttonCounter = new Button("Ajouter");
        buttonChange = new Button("Changer de scene");
        counterLabel = new Label("0");
        root.getChildren().addAll(buttonCounter, buttonChange, counterLabel);
        scene = new Scene(root, 800, 600);

        controller.setView(this);
    }

    public Button getButtonCounter() {
        return buttonCounter;
    }

    public Button getButtonChange() {
        return buttonChange;
    }

    public void updateCounterLabel(int counter) {
        counterLabel.setText(String.valueOf(counter));
    }

    public Scene getScene() {
        return scene;
    }
}
