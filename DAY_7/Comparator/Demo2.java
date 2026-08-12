package DAY_7.Comparator;

import java.sql.Array;
import java.util.Arrays;
import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("Rohan","Rohit","Kartik","Mohit","Om","Vansh","Amit");

        System.out.println(str);
        Collections.sort(str);
        System.out.println("Sorting list :"+str);

        Comparator<String> com = new Comparator<>() {
            public int compare(String a,String b){
               if(a.length() > b.length()){
                return 1;
               }else{
                return -1;
               }
            }
        }; 
        Collections.sort(str,com);
        System.out.println("Sorting Strin based on lenght :"+str);

        Comparator<String> com2 =(String a,String b)->Integer.compare( a.length(), b.length());
         Collections.sort(str,com2);
        System.out.println("Sorting Strin based on Integer class compare method :"+str);

        Comparator<String> com3 =(String b,String a)->Integer.compare( a.length(), b.length());
         Collections.sort(str,com3);
        System.out.println("Sorting Strin based on Integer class compare method :"+str);
    }
}
