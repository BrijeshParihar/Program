import java.util.HashMap;

public class Pair {
    public static void main(String[] args) {

            int arr[] = {8, 7, 2, 5, 3, 1};
            int target = 10;
            int count = 0;


            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                if (hashMap.containsKey(target - arr[i])) {
                    System.out.printf("Pair found (%d, %d)", arr[hashMap.get(target - arr[i])], arr[i]);
                    count++;
                }
                hashMap.put(arr[i], i);
            }
            System.out.println("count = " + count);

    }
}
