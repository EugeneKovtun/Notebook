package epam.courses.controller;

import epam.courses.model.Model;
import epam.courses.view.ConstantMessage;
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

    public void processUser() {
        view.printMessage(ConstantMessage.MENU);
        Input input = new Input(view);
        int choise = input.inputIntegerWithScanner();
        while (choise != 2) {
            if (choise == 1) {
                add();
            } else {
                view.printMessage(ConstantMessage.WRONG_INPUT);
            }
            view.printMessage(ConstantMessage.MENU);
            choise = input.inputIntegerWithScanner();
        }
        view.printMessage(Arrays.toString(model.getNotebookList().toArray()));
    }

    public void add() {
        NotebookController notebookController = new NotebookController(view);
        model.add(notebookController.getNewNotebook());
    }
}
