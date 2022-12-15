package immutable;

public final class User {
    private final String firstName;
    private final String lastName;
    private  Address address;
     
    public User(String firstName, String lastName,Address address) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public Address getAddress() throws CloneNotSupportedException {
        return  address;

    }
}