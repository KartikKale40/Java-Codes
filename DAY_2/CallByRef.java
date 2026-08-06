package DAY_2;

class Employee {
    int empid;
    String name;
    double sal;

    Employee(int empid, String name, double sal) {
        this.empid = empid;
        this.name = name;
        this.sal = sal;
    }

    void E_display() {
        System.out.println("Employee ID : " + empid);
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Salary : " + sal);
    }
}

class Stud {
    int roll;
    String name;

    Stud(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    void s_display() {
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number : " + roll);
    }
}

public class CallByRef {

    static void updateEmp(Employee e) {
        e.empid = 102;
    }

    static void updateStud(Stud s) {
        s.name = "xyz";
    }

    public static void main(String[] args) {

        Stud s1 = new Stud(3, "Kartik");
        Employee e1 = new Employee(101, "Om", 11110);

        System.out.println("Before Student Update:");
        s1.s_display();

        System.out.println("\nBefore Employee Update:");
        e1.E_display();

        
        updateStud(s1);
        updateEmp(e1);

        System.out.println("\nAfter Student Update:");
        s1.s_display();

        System.out.println("\nAfter Employee Update:");
        e1.E_display();
    }
}