package overloading;

public class DoubleFloat {
    static void test(int a){

        System.out.println("double = " + a);

    }
    static void test(long a){

      //  System.out.println("p = " + p);
        System.out.println("float = " + a);
    }

    public static void main(String[] args) {
        test(10);

    }
}
