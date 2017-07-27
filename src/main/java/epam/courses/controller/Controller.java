package epam.courses.controller;

import epam.courses.model.Model;
import epam.courses.view.View;

import java.util.Arrays;

/**
 * Created by eugene on 26.07.17.
 */
public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
    public void processUser(){
        NotebookController notebookController = new NotebookController(view);
        model.add(notebookController.getNewNotebook());
        view.printMessage(Arrays.toString(model.getNotebookList().toArray()));
    }
}
