package immutable;

public class ImmutableDemo {
 
    public static void main(String s[]) throws CloneNotSupportedException {
         
        User u = new User("Sherlock", 
                          "Homes", 
                          new Address("221B", "Baker Street", "London"));
 
        // fetch address from the User object and store it in local variable address
        Address address = u.getAddress();
        System.out.println(address);
 
        // change address in local variable
        address.setFirstLine("001D");
        address.setSecondLine("Chandani Chawk");
        address.setCity("Delhi");
 
        // display address from User object
        System.out.println(u.getAddress());
    }
}