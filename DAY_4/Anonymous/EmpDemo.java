package DAY_4.Anonymous;

interface Employee{
    void work();
    void takeBreak();

    default void officeTiming(){
        System.out.println("Office timing is :9 AM to 6 PM");
    }
}

public class EmpDemo {
    public static void main(String[] args) {
        Employee e = new Employee() {
            @Override
            public void work(){
                System.out.println("employee is working.");
             }

             @Override
             public void takeBreak(){
                System.out.println("employee is taking break.");
             }

        };
        e.officeTiming();
        e.work();
        e.takeBreak();


        
    }
}
