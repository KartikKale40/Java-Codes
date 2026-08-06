package DAY_3.MiniProject;

abstract class Emp{
   private int id;
   private String name;
   private double baseSal;
   private String dep;
   private double sal;

    Emp(){
        
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSal() {
        return sal;
    }
    public void setSal(double sal) {
        this.sal = sal;
    }

    void show(){
        System.out.println("Name of Emp is :"+name+"\nId of Emp is :"+id+"\nSalary of Emp is :"+sal);
    }
}

class Developer extends Emp{

    
    
}

class Tester extends Emp{

}

class Manager extends Emp{
    
}

public class Demo {
    public static void main(String[] args) {
        
    }
}
