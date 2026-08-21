package DAY_10.methodRefandConstruc;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Employee{
    int id;
    String name;
    public Employee(String name) {
        // this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }
    
}

public class Demo2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Raju","Kartik","Om","Jay");
        List<Employee> emp = new ArrayList<>();

        for(String e:names){
            emp.add(new Employee(e));
        }
        
        emp.forEach(e->System.out.println(e));

        System.out.println("Using stream Api");
        emp = names.stream().map(str ->new Employee(str)).toList();
        for(Employee e : emp){
            System.out.println(e);
        }

        System.out.println("Using Constructore Ref ");
        emp = names.stream().map(Employee::new).toList();
        for(Employee e : emp){
            System.out.println(e);
        }
    }
}
