package string;

public class Immutable 
{
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.hashCode());
        str = "hello" + "sir";
        System.out.println(str.hashCode());
        String str2 = new String("Hello1");

        System.out.println(str2.hashCode());

    }
}
