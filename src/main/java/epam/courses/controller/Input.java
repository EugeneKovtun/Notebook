package epam.courses.controller;

import epam.courses.view.ConstantMessage;
import epam.courses.view.View;

import java.util.Scanner;

/**
 * Created by eugene on 27.07.17.
 */
public class Input {
    View view;

    public Input(View view) {
        this.view = view;
    }

    public String inputStringWithRegex(String message, String regex) {
        Scanner scanner = new Scanner(System.in);
        view.printMessage(message);
        String input = scanner.nextLine();
        while (!input.matches(regex)) {
            view.printMessage(ConstantMessage.WRONG_INPUT + message);
            input = scanner.nextLine();
        }
        return input;
    }
    public int inputIntegerWithScanner(){
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()){
            view.printMessage(view.concatenateString(ConstantMessage.INPUT,ConstantMessage.INTEGER));
            scanner.next();
        }
        return scanner.nextInt();
    }
}
