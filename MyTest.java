import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        SingalTon s1 = SingalTon.getInstance();
        SingalTon s2 = SingalTon.getInstance();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }
}
    
    

