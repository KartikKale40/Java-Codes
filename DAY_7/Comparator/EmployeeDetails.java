package DAY_7.Comparator;

import java.util.*;

class Employee {
    int id;
    String name;
    int sal;

    public Employee(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + sal;
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1, "Kartik", 50000));
        list.add(new Employee(2, "Amit", 40000));
        list.add(new Employee(3, "Rohit", 60000));
        list.add(new Employee(4, "Sahil", 50000));
        list.add(new Employee(5, "Vansh", 80000));

        for (Employee val : list) {
            System.out.println(val);
        }

        Comparator<Employee> c = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.sal - e2.sal;
            }
        };

        Collections.sort(list, c);

        System.out.println("\nAfter Sorting By Salary:");

        for (Employee val : list) {
            System.out.println(val);
        }
    }
}