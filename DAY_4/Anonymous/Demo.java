package DAY_4.Anonymous;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator;
        int denominator;
        try{
            System.out.println("Enter number 1 : ");
            numerator = sc.nextInt();
            System.out.println("Enter number 2 : ");
            denominator = sc.nextInt();
             
            int result = numerator / denominator;
            System.out.println("Result: " + result);
            
        }catch(Exception e){
             System.out.println("Error: Cannot divide by zero!\n"+e);
        }finally{
            System.out.println("This finally block always executed..");
        }
    }
}
