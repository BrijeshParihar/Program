import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import java.util.stream.Collectors;

class StreamApi {
	public static void main(String Args[]){
		List<Integer> list = new ArrayList<Integer>();
		list.add(255);
		list.add(302);
		list.add(199);
		list.add(200);
		list.add(243);
		list.add(914);

		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(2);
		list1.add(2);
		list1.add(2);
		list1.add(3);
		list1.add(5);
		list1.add(5);
		System.out.println(list1);
		int duplicateCount = 0;
		HashMap<Integer,Integer> hashMap = new HashMap<>();
		for(Integer i:list1){
		hashMap.put(i,hashMap.get(i)==null ?1:hashMap.get(i)+1);
		}
		System.out.println(hashMap);


		ConcurrentMap<Integer, Long> collect = list1.stream().collect(Collectors.groupingByConcurrent(Function.identity(), Collectors.counting()));


		System.out.println(collect);
	}
}