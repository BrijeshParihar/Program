public class MainOverloading {
    public static void main(String[] args) {
        Overloading o = new Overloading();
        //o.Sum(10,20);
        //o.Sum("a","b");

        o.sum(10, 10.0);

        o.sum(10.0,10);


    }
}
