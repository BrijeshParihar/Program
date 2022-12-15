package string;

import java.util.HashSet;
import java.util.Set;

public class CountPolindrom {
    public static void main(String[] args) {
        String str = "geek";
        int len = str.length();
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i; j++) {
                set.add(str.substring(j, j + i + 1));

            }
        }
        System.out.println("set = " + set);
        for (String item : set) {
          boolean isPolin =  isPolindrom(item);
          if(isPolin){
              System.out.println(item);
          }

        }
    }

    static boolean isPolindrom(String s) {
        if(s.length()==1)
        {
            return true;
        }

        char c[] = s.toCharArray();

            for(int k=0; k<s.length()/2;k++)
            {

                if(!s.substring(k,k+1).equals(s.substring(s.length()-k-1,s.length()-k))){
                    return false;
                }
            }



        return true;
    }
}
