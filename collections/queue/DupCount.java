package collections.queue;

import java.util.HashMap;
import java.util.Map;

public class DupCount {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,2,3,1};
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i< a.length;i++)
        {
            if(h.containsKey(a[i])) {
            h.put(a[i], h.get(a[i])+1);
            }

                else{
                h.put(a[i],1);
            }
            }
        for(Map.Entry<Integer,Integer> e:h.entrySet()){
            System.out.println(e.getKey()+ " , " +e.getValue()  );
        }
    }
}
