import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        List<String> lines = Arrays.asList("Java", "PHP", "C++");
        //lines.stream()
                //.filter(n -> !n.startsWith("PHP"))
                //.forEach(System.out::println);
        lines=getFilterOutput(lines,"PHP");
        lines.stream()
                .forEach(System.out::println);
        //private List<String> getFilterOutput(List<String> lines, String filter) {
          //  List<String> result = new ArrayList<>();
            //for (String line : lines) {
              //  if (!"PHP".equals(line)) {
                //    result.add(line);
                //}
            //}
            //return result; Retorna JAVA, C++
        }

    private static List<String> getFilterOutput(List<String> lines , String filter){
        return lines.stream()
                .filter(n->!n.startsWith(filter))

                .collect(Collectors.toList());

    }



    }



