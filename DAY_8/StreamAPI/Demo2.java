package DAY_8.StreamAPI;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        //without using stream api
        List<Integer> listEven = new ArrayList<>();
        for(Integer val : list){
            if(val%2==0){
                listEven.add(val);
            }
        }

        System.out.println("Printitng even numbers without using stram :"+listEven);

        //Even numbers :
        Stream<Integer> streamlist = list.stream();
        List<Integer> streamEven = new ArrayList<>();

        streamEven=streamlist.filter(n->n%2==0).toList();
        System.out.println("Even Numbers :"+streamEven);  
        
        //odd numbers:
        Stream<Integer> streamlist1 = list.stream();
        List<Integer> streamOdd = new ArrayList<>();

        streamOdd=streamlist1.filter(n->n%2!=0).toList();
        System.out.println("Odd Numbers :"+streamOdd);  

        //print even numbers in single line:
        System.out.println("Printitng even numbers in single line :");
        Predicate<Integer> p2 = a->a%2==1;
        Consumer<Integer> con = a->System.out.println(a);
        list.stream().filter(p2).forEach(con);

        
    }
}
