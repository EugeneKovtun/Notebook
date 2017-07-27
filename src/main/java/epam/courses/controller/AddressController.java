package epam.courses.controller;

import epam.courses.model.entities.Address;
import epam.courses.view.ConstantMessage;
import epam.courses.view.View;

/**
 * Created by eugene on 27.07.17.
 */
public class AddressController {
    private View view;

    public AddressController(View view) {
        this.view = view;
    }

    public Address getNewAddress() {
        Input input = new Input(view);
        view.printMessage(view.concatenateString(ConstantMessage.INPUT, ConstantMessage.INDEX));
        int index = input.inputIntegerWithScanner();
        String city = input.inputStringWithRegex(view.concatenateString(ConstantMessage.INPUT,
                ConstantMessage.CITY), Regex.NAME_REGEX);
        String street = input.inputStringWithRegex(view.concatenateString(ConstantMessage.INPUT,
                ConstantMessage.STREET), Regex.NAME_REGEX);
        view.printMessage(view.concatenateString(ConstantMessage.INPUT, ConstantMessage.HOME));
        int homeNumber = input.inputIntegerWithScanner();
        view.printMessage(view.concatenateString(ConstantMessage.INPUT, ConstantMessage.FLAT));
        int flatNumber = input.inputIntegerWithScanner();
        return new Address(index, city, street, homeNumber, flatNumber);
    }
}
