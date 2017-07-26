package epam.courses;

import epam.courses.controller.Controller;
import epam.courses.model.Model;
import epam.courses.view.View;

/**
 * Hello world!
 *
 */
public class App{
    public static void main( String[] args ) {
        Controller controller = new Controller(new Model(), new View());
        controller.processUser();
    }
}
