package string;

import java.util.Scanner;

public class IpAddreess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str ="";//= sc.nextLine();
        str = "0.0.0.0";
        System.out.println("result: " +isvalid(str));


        
    }
    static int isvalid(String str){
        String arr[] = str.split("\\.");
        int count = 0;
        if(arr.length >4 || arr.length <0)
        {
            return 0;
        }
        for(String element : arr){
            if(Integer.valueOf(element)> 255 || Integer.valueOf(element)<0 )
            {
                return 0;
            }
            if(Integer.valueOf(element) ==0)
            {
                count++;
            }
        }

        return (count ==4)?0:1;
    }
}
