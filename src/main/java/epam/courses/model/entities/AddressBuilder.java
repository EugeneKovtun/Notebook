package epam.courses.model.entities;

/**
 * Created by eugene on 03.08.17.
 */
public class AddressBuilder {
    private int index;
    private String city;
    private String street;
    private int homeNumber;
    private int flatNumber;

    public AddressBuilder buildIndex(int index) {
        this.index = index;
        return this;
    }

    public AddressBuilder buildCity(String city) {
        this.city = city;
        return this;
    }

    public AddressBuilder buildStreet(String street) {
        this.street = street;
        return this;
    }

    public AddressBuilder buildHomeNumber(int homeNumber) {
        this.homeNumber = homeNumber;
        return this;
    }

    public AddressBuilder buildFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
        return this;
    }
    public Address build(){
        Address address = new Address(index,city,street,homeNumber,flatNumber);
        return address;
    }
}
