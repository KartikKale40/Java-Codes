package DAY_3;

class Emp1 {
String name ="ABC";
    int id =1;
    String dep ="HR";
    double sal =50000;
    
    public Emp1(String name, int id, String dep, double sal) {
        this.name = name;
        this.id = id;
        this.dep = dep;
        this.sal = sal;
    }

    @Override
    public String toString(){
        return "Name :"+this.name+ "\nId : " +this.id +"\nDepartment :"+ this.dep+" \nSal :" + this.sal;
    }  
}

public class Emp {
        public static void main(String[] args) {
            Emp1 e = new Emp1("xyz", 2, "IT", 150000);
            System.out.println(e);
            
        }
}
