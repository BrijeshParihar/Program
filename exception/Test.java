package exception;

class Test{
public static void main(String[] args){
System.out.println("statement1");
try{
    System.out.println("before exception");
    System.out.println(10/0);
    System.out.println("after exception");
}
catch(ArithmeticException e){
    e.getMessage();
System.out.println(10/2);
}
System.out.println("statement3");
}}