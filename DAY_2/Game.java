package DAY_2;

import java.util.Scanner;
import java.util.Random;


public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
         int ch ;

        do{
        System.out.println("*******************Menu*******************");
        System.out.println("1.Rock \n2.Paper \n3.Scissors \n4.Exit");
        System.out.println("Enter Input Like (1,2,3)");
         ch = sc.nextInt();


        if (ch < 1 || ch > 3) {
            System.out.println("Invalid Choice!");
            return;
        }

        int ai = random.nextInt(3) + 1;

        System.out.println("Computer Choice :");
        switch (ai) {
            case 1: 
                System.out.println("Rock");
                break;
            case 2:
                System.out.println("Paper");
                break;
            
            case 3:
                System.out.println("Scissors");
                break;
            
        }

        if(ai == ch){
            System.out.println("Match Draw");
        }else if(( ch == 1 && ai== 3) || (ch == 2 && ai ==1) || (ch ==3 && ai == 2)){
            System.out.println("Congratulations! You Win.");
        }else{
             System.out.println("Computer won the game ..! \nTry again..!");
        }
    }while (ch !=4);
            
        
        sc.close();
       

    }
}
