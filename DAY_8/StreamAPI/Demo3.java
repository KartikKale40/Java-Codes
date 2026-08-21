package DAY_8.StreamAPI;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Function;
import java.util.function.Predicate;


public class Demo3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Stream<Integer> str = numbers.stream();
        str.forEach(n->System.out.println(n));

        numbers.stream().filter(a->a%3==0).forEach(a->System.out.println(a));

        List<Integer> mul = new ArrayList<>();
        for(Integer num :numbers){
            mul.add(num*2);
        }
        System.out.println("withouot using stram api map method :" +mul);

        System.out.println("With using stram api map method :");
        Function<Integer,Integer> fun= a->a*2;
        numbers.stream().map(a->a*2).forEach(n->System.out.println(n+ " "));

        //multipliocation of 3
        List<Integer> list3 = new ArrayList<>();
        for(Integer num : numbers){
            list3.add(num*3);
        }
        System.out.println("Multiplicatin of 3 :"+list3);

        System.out.println("With using stram api map method :");
        Function<Integer,Integer> fun1= a->a*3;
        numbers.stream().map(a->a*3).forEach(n->System.out.println(n+ " "));

        
    }
}
