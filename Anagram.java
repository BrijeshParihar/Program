import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
    public static void main(String[] args) {

        String str = "forxxorfxdofr";
        String pattern = "for";
        List<String> list = new ArrayList<>();

        for (int k = 0; k < str.length() - 2; k++) {

            list.add(str.substring(k, k + pattern.length()));

            System.out.println("list = " + str.substring(k, k + pattern.length()));
        }
        int pattrenCount = 0;
        int count = 0;
        for (String s : list) {
            String c[] = s.split("");
            Arrays.sort(c);
            String str3 = "";
            for(int l=0; l<c.length;l++)
            {
                str3= str3+c[l];
            }

            System.out.println("str3 = " + str3);
            if (str3.equals(pattern)) {
                pattrenCount++;

            }


        }
        System.out.println("pattrenCount " + pattrenCount);


    }
}