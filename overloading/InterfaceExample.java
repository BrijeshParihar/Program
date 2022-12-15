package overloading;

interface MyInterface{
   public static int num = 100;
   default void display(){
      System.out.println("Interface");
   }
}
public class InterfaceExample implements MyInterface{
   public void display() {
      System.out.println("class");
   }
   public void show() {
      System.out.println("This is the implementation of the show method");
   }
   public static void main(String args[]) {
      MyInterface obj = new InterfaceExample();
      obj.display();
      //obj.show();
   }
}