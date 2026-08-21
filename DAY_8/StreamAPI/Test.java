package DAY_8.StreamAPI;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(100,20,35,45,11,68,1,3,0);

        Stream<Integer> streamList = list.stream();
        List<Integer> streamEven = new ArrayList<>();

        streamEven = streamList.filter(n->n%2==0).toList();


    }
}
