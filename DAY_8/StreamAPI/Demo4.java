package DAY_8.StreamAPI;

import java.util.stream.Stream;
import java.util.*;

public class Demo4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(20, 60, 40, 80, 30, 90 );

        Stream<Integer> str = list.stream();
        System.out.println("Numbers Greater Than 50 :");
        list.stream().filter(a->a>50).forEach(a->System.out.println(a));

        List<Integer> list2 = Arrays.asList(10, 40, 20, 50, 15, 60 );

        Stream<Integer> str2 = list2.stream();
        System.out.println("Numbers Less Than 30 ");
        list2.stream().filter(n->n<30).forEach(a->System.out.println(a));

        List<Integer> list3 = Arrays.asList(2, 3, 4, 5 );
        Stream<Integer> str3 = list3.stream();

        System.out.println(" Square of Numbers ");
        list3.stream().map(n->n*n).forEach(n->System.out.println(n));

        List<Integer> list4 = Arrays.asList(2, 3, 4 );
        Stream<Integer> str4 = list4.stream();

        System.out.println(" Cube of Numbers  ");
        list4.stream().map(n->n*n*n).forEach(n->System.out.println(n));

        List<Integer> list5 = Arrays.asList(10, 12, 15, 22, 25, 30  );
        Stream<Integer> str5 = list5.stream();

        System.out.println(" Numbers Divisible by 5   ");
        list5.stream().filter(n->n/5==0).forEach(n->System.out.println(n));

        List<Integer> list6 = Arrays.asList(2, 4,24,54,24,53,3 );
        Stream<Integer> str6 = list6.stream();

        System.out.println("MULTIPLICATION OF 2: ");
        list6.stream().map(n->n*2).forEach(n->System.out.println(n));

        list.stream()


        

     }
}
