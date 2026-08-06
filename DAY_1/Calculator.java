import java.util.Scanner;

public class Calculator {

    static void add(int a,int b){
        System.out.println("Addition : "+(a+b));
    }
    
    static void sub(int a,int b){
        System.out.println("Subtraction : "+(a-b));
    }
    
    static void mul(int a,int b){
        System.out.println("Multiplication : "+(a*b));
    }
    
    static void div(int a,int b){
        System.out.println("Division : "+(a/b));
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2");
        int num2 = sc.nextInt(); 
        int ch;
        do{
            System.out.println("*****************MENU*******************");
            System.out.println("1.Add \n2.Sub \n3.Mul \n4.Div \n5.Exit");
            System.out.println("Enter Your Choice :");
            ch = sc.nextInt();
            System.out.println("*****************END********************");

        switch (ch) {
            case 1:
                add(num1,num2);
                break;
            
            case 2:
                sub(num1, num2);
                break;

            case 3:
                mul(num1, num2);
                break;
            
            case 4:
                div(num1,num2);
                break;

            case 5:
                break;
        
            default:
                System.out.println("Wrong Input");
                break;
        }

     }while(ch != 5) ;
        

    }
    
}
