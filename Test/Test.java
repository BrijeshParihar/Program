package Test;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        
        
        // byte,short,int, long , float, double,char,boolean
        //Byte,Short,Integer,Long
       ArrayList<Integer> ls = new ArrayList<>();
//        int a = 10;
       Integer ab = Integer.parseInt("10");
        
        byte b = 127;
        System.out.println("b = " + b);
        short s = 128;
        System.out.println("s = " + s);
        int i = 10;
        System.out.println("i = " + i);
        long l =1234;
        System.out.println("l = " + l);
        
        float f =10.0f;
        System.out.println("f = " + f);
        double d = 10.0;
        System.out.println("d = " + d);

        char c = 'c';
        System.out.println("c = " + c);

        boolean bb = false;
        System.out.println("bb = " + bb);
        System.out.println("bb = " + bb);
        System.out.println("bb = " + bb);

        for(int j =0;j<10;j++){
            if(j==5)
            {
                break;
            }
            System.out.println("loop iteration #:"+j);

        }




        
        
        
        
    }
}
