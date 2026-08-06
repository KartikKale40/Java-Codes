
package DAY_2;
class Student{
    private String name;
    private int id =101;
    private double gpa;

    Student(double gpa,String name){
        super();
        this.gpa=gpa;
        this.name= name;
    }
    public int getid(){
        return id;
    }

    public double getGpa(){
        return gpa;
    }

    public String getName(){
        return name;
    }

    public void setGpa(double gpa){
        this.gpa= gpa;
    }

    public void setName(String name){
        this.name=name;
    }
}


public class demo {

     public static void main(String[] args) {
        Student s = new Student(8.5, "kartik");
        System.out.println("id :" +s.getid());
        System.out.println("Name :"+s.getName());
        System.out.println("Gpa :" +s.getGpa());
     }
}