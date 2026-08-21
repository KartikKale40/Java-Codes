package DAY_8.ComparatorInterface;

import java.util.*;

class Employee implements Comparable<Employee>{ 
    int id;
    String name;
    int sal;
    public Employee(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

   @Override
   public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append("Employee{");
    sb.append("id").append(id);
    sb.append("name").append(name);
    sb.append("sal").append(sal);
    sb.append("}");
    return sb.toString();
    
   }
   public int compareTo(Employee that){
    if(this.sal>that.sal){
        return 1;
    }else{
       return -1;
    }
   }
    
}

public class EmployeeDetails {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1, "Kartik", 50000));
        emp.add(new Employee(2, "Om", 60000));
        emp.add(new Employee(3, "Vansh", 40000));
        emp.add(new Employee(4, "Jay", 80000));
        emp.add(new Employee(5, "Krushna", 85000));

        Collections.sort(emp);
        for(Object ob :emp){
            System.out.println(ob);
        }

        
    }
}
