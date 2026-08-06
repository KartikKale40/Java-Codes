import java.util.*;

public class Demo {
    
    public static void main(String[] args) {
        // int a = 20;
        // double b = 20.56;
        // byte c = 22;
        // float d = 0.1f;

        // System.out.println("Implicit :");
        // double bb = a;       
        // System.out.println(bb);

        // System.out.println("Explicit :");
        // int aa = (int) b;   
        // System.out.println(aa);


    
    
        Scanner sc = new Scanner(System.in);

        float m;

        System.out.println("Enter Your Grade :");
        m = sc.nextFloat();

        if (m >= 90 && m <= 100) { 
            System.out.println("A+");
        } else if (m >= 80 && m < 90) {
            System.out.println("A");
        } else if (m >= 70 && m < 80) {
            System.out.println("B+");
        } else if (m >= 60 && m < 70) {
            System.out.println("B");
        } else if (m >= 35 && m < 60) {
            System.out.println("Pass");
        } else if (m >= 0 && m < 35) { 
            System.out.println("Fail try Again later");
        } else {
            System.out.println("Invalid score entered!");
        }
        
        sc.close(); 
   }
}

   
