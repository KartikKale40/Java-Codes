package DAY_6.Collection;

import java.util.ArrayList;
import java.util.Scanner;

class Employee{
    int id;
    String name;
    double salary;
    String dep;
    public Employee(int id, String name, double salary, String dep) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dep = dep;
    }

    void display(){
        System.out.println("Id :"+ id+"\nName :"+name+"\nSalary :"+salary+"\nDepartment :"+dep);
    }
}

public class Emp {
    public static void main(String[] args) {
        ArrayList<Employee> emp = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int ch;
        do{
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Search Employee by Name");
            System.out.println("5. Update Salary");
            System.out.println("6. Update Department");
            System.out.println("7. Delete Employee");
            System.out.println("8. Highest Paid Employee");
            System.out.println("9. Lowest Paid Employee");
            System.out.println("10. Employees by Department");
            System.out.println("11. Exit");

            System.out.println("Enter Choice :");
            ch = sc.nextInt();

            switch (ch) {
                
                case 1:
                    System.out.println("Enter id :");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter name :");
                    String name = sc.nextLine();

                    System.out.println("Enter Salary :");
                    double salary = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Enter Department :");
                    String dep = sc.nextLine();

                    emp.add(new Employee(id, name, salary, dep));
                    System.out.println("Employee added successfully.");
                    break;

                    case 2:
                        if(emp.size()==0){
                            System.out.println("No employee found");
                        }else{
                            for(int i = 0; i<emp.size();i++){
                                emp.get(i).display();
                            }
                        }
                        break;

                    case 3:
                        System.out.println("Enter Emp id :");
                        int searchId  = sc.nextInt();

                        boolean found = false;

                        for(Employee e: emp){
                            if(e.id == searchId){
                                e.display();
                                found = true;
                                break;
                            }
                        }
                        if(!found){
                            System.out.println("Not found");
                        }
                    
                        break;
                    
                    case 4:
                        System.out.println("Enter emp name :");
                        String searchName = sc.nextLine();
                        sc.nextLine();

                        boolean foundName = false;

                        for(Employee e: emp){
                            if(e.name.equalsIgnoreCase(searchName)){
                                e.display();
                                foundName = true;
                            }
                        }
                        if(!foundName){
                            System.out.println("Employee not found");
                        }
                        break;
                    
                    case 5:
                        System.out.println("Enter Emp id");
                        int salId = sc.nextInt();

                        boolean salFound = false;
                        for(Employee e : emp){
                            if(e.id == salId){
                                System.out.println("Enter new Salary :");
                                e.salary = sc.nextDouble();

                                System.out.println("Salary updated ");
                                salFound = true;
                                break;

                            }
                            if(!salFound){
                                System.out.println("Emp not found");
                            }
                        }
                        break;

                    case 6:
                         System.out.print("Enter Employee ID: ");
                         int deptId = sc.nextInt();

                         boolean deptfound = false;

                         for(Employee e : emp){
                            if(e.id == deptId){
                                 System.out.print("Enter new department: ");
                                 e.dep = sc.nextLine();
                                 System.out.println("Department updated.");
                                deptfound = true;
                            break;
                        }      
                    }
                    if(!deptfound){
                        System.out.println("Emp not found");
                    }
                    break;

                    case 7:
                        System.out.print("Enter Employee ID to delete: ");
                        int deleteId = sc.nextInt();

                        boolean deleted = false;

                        for(int i = 0;i<emp.size();i++){
                            if(emp.get(i).id == deleteId){
                                emp.remove(i);
                                System.out.println("Emp deleteed");
                                deleted=true;
                                break;
                            }
                        }
                        if(!deleted){
                            System.out.println("Emp Not found");
                        }
                        break;

                    case 8:
                          if (emp.size() == 0) {
                            System.out.println("No employees found.");
                          } else {
                            
                            Employee highest = emp.get(0);

                            for(int i =1;i<emp.size();i++){
                                if(emp.get(i).salary > highest.salary){
                                    highest=emp.get(i);
                                }
                            }
                            System.out.println("\nHighest Paid Employee:");
                            highest.display();
                         }

                         break;

                case 9:
                     if (emp.size() == 0) {
                        System.out.println("No employees found.");
                    } else {
                        Employee lowest = emp.get(0);
                        for(int i = 0;i<emp.size();i++){
                            if(emp.get(i).salary < lowest.salary){
                                lowest = emp.get(i);
                            }
                        }
                        System.out.println("Lowest paid employee :");
                        lowest.display();
                    }
                        break;

                        case 10:
                            System.out.println("Enter Department: ");
                            String searchDepartment = sc.nextLine();

                            boolean departmentFound = false;
                             
                            for (int i = 0; i < emp.size(); i++) {
                                Employee e = emp.get(i);
                                 if (e.dep.equalsIgnoreCase(searchDepartment)) {
                                 e.display();
                                departmentFound = true;
                        }
                    }
                     if (!departmentFound) {
                        System.out.println("No employees found in this department.");
                    }

                    break;
                   case 11:
                    System.out.println("Thank you!");
                    sc.close();
                    return;


                default:
                    System.out.println("Invalid choice.");
                    
            }

        }while(ch != 11);
    }
}
