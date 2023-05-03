package org.isep.testhp.controller;

import org.isep.testhp.model.Model;
import org.isep.testhp.view.SceneManager;
import org.isep.testhp.view.scene.Counter;
import org.isep.testhp.view.scene.HelloWorld;

public class HelloWorldController {

    private HelloWorld view;

    public HelloWorldController(SceneManager sceneManager) {
        this.view = new HelloWorld(this);


        view.getButtonBack().setOnAction(event -> sceneManager.switchToScene("counter"));

        sceneManager.addScene("helloworld", view.getScene());
    }

    public void setView(HelloWorld view){
        this.view = view;
    }
}
