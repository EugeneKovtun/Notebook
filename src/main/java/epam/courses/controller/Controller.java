package epam.courses.controller;

import epam.courses.model.Model;
import epam.courses.view.View;

/**
 * Created by eugene on 26.07.17.
 */
public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
    public void processUser(){

    }
}
