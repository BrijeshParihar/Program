class A{
    public void test(){
        System.out.println(" A ");
    }

}

class B extends A {

    public void test() {
        System.out.println(" B ");
    }
}


class Bike  {


    public static void main(String[] args) {

    A a = new A();
    a.test();

        B b = new B();
        b.test();

   A aa = new B();
   aa.test();
}
}

