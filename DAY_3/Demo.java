package DAY_3;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args)throws Exception {
        String n = new String("Hiii ");

        String n2 ="xyz";

        String n3 ="abc";
        String c ="xyz";

        System.out.println(n== n2);
        System.out.println(n2==c);

       System.out.println(n);
       n = n+"xyz";
       System.out.println(n);

       String var ="Kartik kale ";
       String [] a = var.split(":");
    //    System.out.println(a);
       for(String string : a) {
            System.out.println(string);
       }
       
       ;
       System.out.println(var.indexOf("K"));

       System.out.println("Enter number");
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
    //    int num = System.in.read();
       System.out.println(num);
    }
}
