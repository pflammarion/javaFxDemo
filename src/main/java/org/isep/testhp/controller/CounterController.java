package org.isep.testhp.controller;

import org.isep.testhp.model.Model;
import org.isep.testhp.view.SceneManager;
import org.isep.testhp.view.scene.Counter;
import org.isep.testhp.view.scene.HelloWorld;

public class CounterController {
    private final Model model;
    private Counter view;

    public CounterController(SceneManager sceneManager) {
        this.model = new Model();
        this.view = new Counter(this);
        new HelloWorldController(sceneManager);

        view.getButtonCounter().setOnAction(event -> {
            model.incrementCounter();
            view.updateCounterLabel(model.getCounter());
        });
        view.getButtonChange().setOnAction(event -> sceneManager.switchToScene("helloworld"));

        sceneManager.addScene("counter", view.getScene());
    }

    public void setView(Counter view){
        this.view = view;
    }

}
