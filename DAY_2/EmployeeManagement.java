package DAY_2;
import java.util.Scanner;

class Employee {

    private int id;
    private String name;
    private double salary;

    
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    
    public int getId() {
        return id;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    public void display() {
        System.out.println("ID     : " + id);
        System.out.println("Name   : " + name);
        System.out.println("Salary : " + salary);
    }
}

public class EmployeeManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee emp[] = new Employee[10];
        int count = 2;

        
        emp[0] = new Employee(101, "Kartik", 40000);
        emp[1] = new Employee(102, "Rahul", 45000);

        int choice;

        do {

            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                
                case 1:

                    System.out.print("Enter ID : ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Salary : ");
                    double salary = sc.nextDouble();

                    emp[count] = new Employee(id, name, salary);
                    count++;

                    System.out.println("Employee Added Successfully.");
                    break;

                
                case 2:

                    if (count == 0) {
                        System.out.println("No Employees Found.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            emp[i].display();
                        }
                    }

                    break;

                
                case 3:

                    System.out.print("Enter Employee ID : ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (emp[i].getId() == updateId) {

                            found = true;

                            System.out.println("\nWhat do you want to update?");
                            System.out.println("1. Name");
                            System.out.println("2. Salary");
                            System.out.println("3. Both");
                            System.out.print("Enter Choice : ");

                            int ch = sc.nextInt();
                            sc.nextLine();

                            switch (ch) {

                                case 1:
                                    System.out.print("Enter New Name : ");
                                    emp[i].setName(sc.nextLine());
                                    break;

                                case 2:
                                    System.out.print("Enter New Salary : ");
                                    emp[i].setSalary(sc.nextDouble());
                                    break;

                                case 3:
                                    System.out.print("Enter New Name : ");
                                    emp[i].setName(sc.nextLine());

                                    System.out.print("Enter New Salary : ");
                                    emp[i].setSalary(sc.nextDouble());
                                    break;

                                default:
                                    System.out.println("Invalid Choice.");
                            }

                            System.out.println("Employee Updated Successfully.");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee Not Found.");
                    }

                    break;

                
                case 4:

                    System.out.print("Enter Employee ID to Delete : ");
                    int deleteId = sc.nextInt();

                    boolean deleted = false;

                    for (int i = 0; i < count; i++) {

                        if (emp[i].getId() == deleteId) {

                            for (int j = i; j < count - 1; j++) {
                                emp[j] = emp[j + 1];
                            }

                            emp[count - 1] = null;
                            count--;

                            deleted = true;
                            System.out.println("Employee Deleted Successfully.");
                            break;
                        }
                    }

                    if (!deleted) {
                        System.out.println("Employee Not Found.");
                    }

                    break;

                
                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");

            }

        } while (choice != 5);

        sc.close();
    }
}