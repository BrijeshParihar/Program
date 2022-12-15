import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HashMaPImp {
    public static void main(String[] args) {

        Student s1 = new Student(1,"S1");
        Student s2 = new Student(2,"S2");
        Student s3 = new Student(3,"S3");
        Student s4 = new Student(4,"S4");
        Student s5 = new Student(5,"S5");
        Student s6 = new Student(6,"S6");
        Student s7 = new Student(7,"S7");
        Student s8 = new Student(8,"S8");
       // Student s3 = new Student(1,"Sonu");
   /*     List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);
        list.add(s7);
        list.add(s8);*/
        HashMap<Student,String> hm = new HashMap<Student,String>();
        hm.put(s1,"A");
        hm.put(s2,"B");
        hm.put(s3,"B");
        System.out.println(hm.size());


        // hm.put(s3,"C");

    /*    Map<String, Integer> collect = list.stream().collect(Collectors.groupingBy(Student::getName, Collectors.summingInt(Student::getId)));
        System.out.println("collect = " + collect);



        System.out.println(hm.entrySet());
     System.out.println(hm.size());


        System.out.println("============================================");
        String str = "Hello World";

        List<Integer> arrayList = Arrays.asList(1,2,3,4,4,5,5,6);
        List<Integer> set    = new ArrayList<>();
        Set<Integer> finalSet = new HashSet<>();

        set = arrayList.stream().filter(item-> finalSet.add(item)).collect(Collectors.toList());
        System.out.println("set = " + set);
        
        Map<String,Long>  map = Arrays.stream(str.split("")).filter(item-> !(item==" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("map.toString() = " + map.toString());
        System.out.println("============================================");*/


    }
}




