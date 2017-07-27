package epam.courses.controller;

import epam.courses.model.entities.Address;
import epam.courses.model.entities.Notebook;
import epam.courses.model.entities.SubscriberGroup;
import epam.courses.view.ConstantMessage;
import epam.courses.view.View;

import java.util.Scanner;

/**
 * Created by eugene on 27.07.17.
 */
public class NotebookController {
    private View view;

    public NotebookController(View view) {
        this.view = view;
    }

    public Notebook getNewNotebook() {
        Input input = new Input(view);
        String name = input.inputStringWithRegex(view.concatenateString(ConstantMessage.INPUT,
                ConstantMessage.NAME), Regex.NAME_REGEX);
        String surname = input.inputStringWithRegex(view.concatenateString(ConstantMessage.INPUT,
                ConstantMessage.SURNAME), Regex.NAME_REGEX);
        String patronymic = input.inputStringWithRegex(view.concatenateString(ConstantMessage.INPUT,
                ConstantMessage.PATRONYMIC), Regex.NAME_REGEX);
        String nickname = input.inputStringWithRegex(view.concatenateString(ConstantMessage.INPUT,
                ConstantMessage.NICKNAME), Regex.NICKNAME_REGEX);
        String homePhoneNumber = input.inputStringWithRegex(view.concatenateString(ConstantMessage.INPUT,
                ConstantMessage.HOME_PHONE), Regex.HOME_PHONE_NUMBER);
        String mobilePhoneNumber = input.inputStringWithRegex(view.concatenateString(ConstantMessage.INPUT,
                ConstantMessage.MOBILE_PHONE), Regex.MOBILE_PHONE_NUMBER_REGEX);
        String secondMobilePhone =  yesNoQuestion(ConstantMessage.ADD_SECOND_PHONE)?
                input.inputStringWithRegex(view.concatenateString(ConstantMessage.INPUT,
                ConstantMessage.MOBILE_PHONE), Regex.MOBILE_PHONE_NUMBER_REGEX):"";
        String email = input.inputStringWithRegex(view.concatenateString(ConstantMessage.INPUT,
                ConstantMessage.EMAIL), Regex.EMAIL);
        String skype = input.inputStringWithRegex(view.concatenateString(ConstantMessage.INPUT,
                ConstantMessage.SKYPE), Regex.SKYPE);
        Address address = new  AddressController(view).getNewAddress();
        return new Notebook(name, surname, patronymic, nickname,
                SubscriberGroup.FRIENDS, homePhoneNumber, mobilePhoneNumber,
                secondMobilePhone, email, skype, address);
    }

    public boolean yesNoQuestion(String message) {
        view.printMessage(message);
        int checker;
        Input input = new Input(view);
        view.printMessage(ConstantMessage.YES_NO);
        while (true) {
            checker = input.inputIntegerWithScanner();
            switch (checker) {
                case 1:
                    return true;
                case 2:
                    return false;
                default:
                    break;
            }
        }
    }
}
