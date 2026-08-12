package DAY_6.MAP;

import java.util.*;
public class MapExample2 {
    public static void main(String[] args) {
        Map map = new Hashtable<>();
        map.put("Rohit", 45);
        map.put("Kisan", 50);
        map.put("Mohit", 56);
        map.put("Sumit", 70);
        // map.put(null,80); //throw nullpointer Exception
        // map.put("Raju", null); //throw nullpointer Exception
        System.out.println(map);
        boolean check=   map.containsKey("Rohit");
   
        System.out.println(check);
   
    }}