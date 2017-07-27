package epam.courses.model;

import epam.courses.model.entities.Address;
import epam.courses.model.entities.Notebook;
import epam.courses.model.entities.SubscriberGroup;

import java.util.ArrayList;

/**
 * Created by eugene on 26.07.17.
 */
public class Model {
    ArrayList<Notebook> notebookList = new ArrayList<>();

    public ArrayList<Notebook> getNotebookList() {
        return notebookList;
    }

    public void setNotebookList(ArrayList<Notebook> notebookList) {
        this.notebookList = notebookList;
    }

    public void add(String name, String surname, String patronymic, String nickname,
                    SubscriberGroup subscriberGroup, String homePhoneNumber,
                    String mobilePhoneNumber, String secondMobilePhoneNumber,
                    String email,String skype, Address address) {
        notebookList.add(new Notebook(name, surname, patronymic, nickname,
                subscriberGroup, homePhoneNumber, mobilePhoneNumber,
                secondMobilePhoneNumber, email,skype, address));
    }
    public void add(Notebook notebook){
        notebookList.add(notebook);
    }
}
