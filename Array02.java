
import java.lang.reflect.Array;
import java.util.Arrays;

public class Array02 {
    public static void main(String[] args) {

        int[] b = new int[10];
        Arrays.stream(b).forEach(System.out::println);

        int[] a = {1,2,3,4,5,6,7,7};

        for(int i =0;i<a.length;i++){
            if(a[i]==20){//1,2,3,4,5
                for(int j = i+1;j<= a.length-1;j++){
                    a[j-1]=a[j];// j=7
                }
                break;
            }
            a[a.length-1]=0;
        }
       Arrays.stream(a).forEach(System.out::println);
    }
}
