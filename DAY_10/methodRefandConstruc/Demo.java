package DAY_10.methodRefandConstruc;

import java.lang.reflect.Array;
import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kartik","Om","Raj","Jay");
        System.out.println("Original name list :");
        names.forEach(name->System.out.println(name));

        System.out.println("Uppercase name list");
        System.out.println("Example for method reference :");
        names.stream().map(String::toUpperCase).forEach(System.out::println);

        System.out.println("Lowercase name list");
        System.out.println("Example for method reference :");
        names.stream().map(String::toLowerCase).forEach(System.out::println);

        
         String a = names.stream().filter(n->n.contains("om")).findFirst().orElse("No value is there");
         System.out.println(a);
       
    }
}

