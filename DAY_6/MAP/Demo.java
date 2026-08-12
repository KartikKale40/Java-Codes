package DAY_6.MAP;

import java.util.*;


public class Demo {
    public static void main(String[] args) {
        Map m  = new HashMap<>();
        m.put(1, "Rohit");
        m.put(1, "Sanjay");
        m.put(1, "Om");
        m.put(1, "Rohit");
        m.put(1, "Hello");
        
        System.out.println(m.get(null));
        System.out.println(m.get(2));

        Set<Integer> set = m.keySet();
        for(Integer set2:set){
            System.out.println(set2);
        }
        
        for(Object k:m.keySet()){
            System.out.println(m.get(k));
        }

    }
}
