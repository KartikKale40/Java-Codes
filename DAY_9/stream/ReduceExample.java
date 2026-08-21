package DAY_9.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4,24,54,24,53,3 );
        Stream<Integer> str = list.stream();

        System.out.println("MULTIPLICATION OF 2: ");
        list.stream().map(n->n*2).forEach(n->System.out.println(n));

        
        int sum = list.stream().reduce(0,(a,b)->a+b);
        System.out.println("\nSum of list is ="+sum);

        // BiFunction<Integer,Integer,Integer> bi =(a,b)->a+b;

        //implementing outside and passing reference to reduce method
        BinaryOperator<Integer> bi = (a,b)->a+b;

        int result = list.stream().reduce(0,bi);
        System.out.println(result);

        
        
        
    }
}
