import java.util.*;
class Sorting{
	public static void main(String Args[]){
		List<Integer> list = new ArrayList<Integer>();
		list.add(255);
		list.add(302);
		list.add(199);
		list.add(200);
		list.add(243);
		list.add(914);
		System.out.println("==================Before sort ===========");
		list.forEach(System.out::println);
		Comparator<Integer> comp = new ComImpl();
		System.out.println("==================After sort ===========");
		Collections.sort(list,(o1,o2)-> {return o1>o2?1:-1;});
		list.forEach(System.out::println);

		/// Stream sorted method
		System.out.println("==================Sorted method of stream ===========");
		list.stream().sorted().forEach(System.out::println);
		System.out.println("==================Sorted with comparator method of stream ===========");
		list.stream().sorted((o1,o2)->{return o1<o2?1:-1;}).forEach(System.out::println);

		System.out.println("==================Second min ===========");
		Integer A[] = {1,2,7,2,5,4,5};
		List<Integer> arrayList = Arrays.asList(A);
		arrayList.stream().sorted((o1, o2) -> {return o1<o2?1:-1;}).skip(1).limit(1).forEach(System.out::println);
		arrayList.stream().distinct().forEach(System.out::println);
		System.out.println("==================print duplicate ===========");
		HashSet<Integer> hset = new HashSet<Integer>();
		arrayList.stream().filter(i->!hset.add(i)).forEach(System.out::println);




	}
}