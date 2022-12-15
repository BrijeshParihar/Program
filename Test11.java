import java.util.Arrays;
import java.util.stream.Stream;

public class Test11 {
    public static void main(String[] args) {
        int inp[] = {2,3,4,3,2,3,1,5,7};
      //  Set<Integer> h

        Stream.of(inp).distinct().sorted().forEach(System.out::println);
       // Stream.of
    }
}
