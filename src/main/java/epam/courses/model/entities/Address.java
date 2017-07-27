package epam.courses.model.entities;

/**
 * Created by eugene on 26.07.17.
 */
public class Address {
    private int index;
    private String city;
    private String street;
    private int homeNumber;
    private int flatNumber;

    public Address(int index, String city, String street, int homeNumber, int flatNumber) {
        this.index = index;
        this.city = city;
        this.street = street;
        this.homeNumber = homeNumber;
        this.flatNumber = flatNumber;
    }

    public Address(int index, String city, String street, int homeNumber) {
        this.index = index;
        this.city = city;
        this.street = street;
        this.homeNumber = homeNumber;
        flatNumber = 0;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(int homeNumber) {
        this.homeNumber = homeNumber;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    @Override
    public String toString() {
        return "{" +
                "\nindex=" + index +
                "\n city='" + city + '\'' +
                "\n street='" + street + '\'' +
                "\n homeNumber=" + homeNumber +
                "\n flatNumber=" + flatNumber +
                '}';
    }
}
