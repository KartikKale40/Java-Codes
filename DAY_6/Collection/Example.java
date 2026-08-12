package DAY_6.Collection;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

class Employee{
    int id;
    String name;
    int sal;

    public Employee(){

    }

    public Employee(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }
    
}

public class Example {
    public static void main(String[] args) {
        // List<Integer> list = Arrays.asList(12,42,32,3,3243,42);

        // for(Integer i : list){
        //     System.out.println(i);
        // }
        // Collections.sort(list);
        // System.out.println(list);

        // System.out.println("Printing names :");
        // List<String> list2 = Arrays.asList("ABC","Kartik","OM");
        // for(String i : list2){
        //     System.out.println(i);
        // }

        // Collections.sort(list2);

        List emp = new ArrayList<>();
        emp.add(new Employee(1,"kartik",30000));
        emp.add(new Employee(3,"rohit",40000));
        emp.add(new Employee(1,"rajesh",50000));
        emp.add(new Employee(3,"Sharma",60000));
        emp.add(new Employee(3));


    }
}
