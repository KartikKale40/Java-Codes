package DAY_8.Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int id;
    String name;
    int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Om", 60));
        list.add(new Student(6, "Jay", 64));
        list.add(new Student(8, "Krushna", 50));
        list.add(new Student(4, "Vedant", 35));
        list.add(new Student(12, "Vansh", 59));
        list.add(new Student(121, "Kartik", 62));
        list.add(new Student(15, "Kushal", 99));
        list.add(new Student(2, "Raghav", 55));

        // Sorting by ID
        Comparator<Student> com1 = (a, b) -> (a.id > b.id ? 1 : -1);
        Collections.sort(list, com1);

        System.out.println("\nSorting according to the id : ");
        System.out.println();
        for (Student student : list) {
            System.out.println(student);
        }

        // Sorting by Name Length
        Comparator<Student> com2 = (a, b) -> (a.name.length() > b.name.length() ? 1 : -1);
        Collections.sort(list, com2);

        System.out.println("\nSorting according to the name : ");
        System.out.println();
        for (Student student : list) {
            System.out.println(student);
        }


        List<Integer> list1 =Arrays.asList(48,35,55,65,48,17,52,10);
        Comparator<Integer> com5 =(a,b)-> a>b ? 1 :-1;
        Collections.sort(list1.com5); 
        System.out.println(list1);
    }
}
