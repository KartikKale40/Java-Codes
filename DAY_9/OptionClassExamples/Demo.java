package DAY_9.OptionClassExamples;

import java.lang.reflect.Array;
import java.util.stream.Stream;
import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kartik","Chetan","Om","Jayesh","Navin");
        List<String> name2 = new ArrayList<>();
       Optional<String> name =names.stream().filter(n->n.contains("z")).findFirst().orElse("No value is there").describeConstable();
       
        System.out.println(name);

    }
}