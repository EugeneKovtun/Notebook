package epam.courses.model.entities;

import sun.util.calendar.JulianCalendar;

import java.util.Date;

/**
 * Created by eugene on 26.07.17.
 */
public class Notebook {
    private String name;
    private String surname;
    private String patronymic;
    private String nickname;
    private SubscriberGroup subscriberGroup;
    private String homePhoneNumber;
    private String mobilePhoneNumber;
    private String secondMobilePhoneNumber;
    private String email;
    private Address address;
    private Date creationDate;
    private Date dateOfLastChange;

    public Notebook(String name, String surname, String patronymic, String nickname,
                    SubscriberGroup subscriberGroup, String homePhoneNumber,
                    String mobilePhoneNumber, String secondMobilePhoneNumber,
                    String email, Address address) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.nickname = nickname;
        this.subscriberGroup = subscriberGroup;
        this.homePhoneNumber = homePhoneNumber;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.secondMobilePhoneNumber = secondMobilePhoneNumber;
        this.email = email;
        this.address = address;
        creationDate = new Date();
        dateOfLastChange = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        dateOfLastChange = new Date();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
        dateOfLastChange = new Date();
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
        dateOfLastChange = new Date();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
        dateOfLastChange = new Date();
    }

    public SubscriberGroup getSubscriberGroup() {
        return subscriberGroup;
    }

    public void setSubscriberGroup(SubscriberGroup subscriberGroup) {
        this.subscriberGroup = subscriberGroup;
        dateOfLastChange = new Date();
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
        dateOfLastChange = new Date();
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
        dateOfLastChange = new Date();
    }

    public String getSecondMobilePhoneNumber() {
        return secondMobilePhoneNumber;
    }

    public void setSecondMobilePhoneNumber(String secondMobilePhoneNumber) {
        this.secondMobilePhoneNumber = secondMobilePhoneNumber;
        dateOfLastChange = new Date();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        dateOfLastChange = new Date();
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
        dateOfLastChange = new Date();
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getDateOfLastChange() {
        return dateOfLastChange;
    }

    public String getNameShortForm() {
        return getSurname() + " " + getName().charAt(0) + ".";
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "name='" + name + '\n' +
                ", surname='" + surname + '\n' +
                ", patronymic='" + patronymic + '\n' +
                ", nickname='" + nickname + '\n' +
                ", subscriberGroup=" + subscriberGroup +
                ", homePhoneNumber='" + homePhoneNumber + '\n' +
                ", mobilePhoneNumber='" + mobilePhoneNumber + '\n' +
                ", secondMobilePhoneNumber='" + secondMobilePhoneNumber + '\n' +
                ", email='" + email + '\n' +
                ", address=" + address +
                ", creationDate=" + creationDate +
                ", dateOfLastChange=" + dateOfLastChange +
                '}';
    }
}