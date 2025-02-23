package OOP;

public class Address {
    private String city;
    private String streetName;
    private int postalCode;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public Address Info(){
        System.out.printf("City: %s, street name: %s, Postal code: %d", city,streetName,postalCode);
        return null;
    }
}
