import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //List<String> myList = Arrays.asList("a1", "b1", "c2", "c1");
        //myList.stream()
                //.filter(s -> s.startsWith("c"))
                //.map(String::toUpperCase)
                //.sorted()
                //.forEach(System.out::println);
        List<Integer> myNumberList = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10);
        myNumberList.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
        System.out.println(" ");
        List<Integer> myNumberList2 = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10);
        myNumberList2.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> Math.pow(n,2))
                .sorted()
                .forEach(System.out::println);


    }
}