package DAY_8.StreamAPI;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,13,34,43,13,34,53,4,13,42,3);

        Stream<Integer> stream;

        List<Integer> even = new ArrayList<>();
        for(Integer i :list){
            if(i%2==0){
                even.add(i);
            }
    }
    for(Integer i : even){
        System.out.println(i);
    }

    List<Integer> streamEven = new ArrayList<>();


    //with stram api
    Stream<Integer> stream2=list.stream();

    Predicate<Integer> p =(Integer a)->a%2==0?true:false;

    streamEven=stream2.filter(p).toList();
    System.out.println(streamEven);
    
    
}
}