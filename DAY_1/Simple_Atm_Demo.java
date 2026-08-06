import java.util.Scanner;

public class Simple_Atm_Demo {
    static double bal = 10000;
    static int pin = 1234;
    

    static void check_Bal(){
        System.out.println("Current Account Balance is Rs : "+bal);
    }

    static void change_Pin(Scanner sc){
        System.out.println("Enter Current Pin  :");
        int curr_pin = sc.nextInt();

        if(curr_pin == pin){
        System.out.println("Enter New Pin :");
        pin = sc.nextInt();
        System.out.println("Pin Change successfully..!");

        }else{
            System.out.println("Wrong Pin...\ntry again later..!");
        }
    }

    static void withdraw_Amt(Scanner sc){
        System.out.println("Enter Ammount to Withdraw :");
        double withdraw_Amt = sc.nextDouble();

        if(withdraw_Amt > bal){
            System.out.println("Not Sufficient Balance..!\nPlease try again later..");
        }else{
            bal = bal-withdraw_Amt;
            System.out.println(withdraw_Amt+" Rs Withdraw From Your Account and current bal is "+bal);
        }
    }

    static void deposite_Amt(Scanner sc){
        System.out.println("Enter Ammount to Deposite");
        double dep_amt = sc.nextDouble();

        if(dep_amt <=0){
            System.out.println("Enter Valid Ammount..!");
        }else{
            bal = bal + dep_amt;
            System.out.println(dep_amt +" Rs Deposited in Your account. \nAnd Total Bal is Rs "+bal);
            
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do{
            System.out.println("************MENU**********");
            System.out.println("1.Check Bal \n2.Deposite Amt \n3.Withdraw Amt \n4.Change pin \n5.Exit");

            System.out.println("Enter Your Choice :");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    check_Bal();
                    break;
                case 2:
                    deposite_Amt(sc);
                    break;

                case 3:
                    withdraw_Amt(sc);
                    break;

                case 4:
                    change_Pin(sc);

                case 5:
                    break;

                default:
                    System.out.println("Wrong Input ..!");
                    break;
            }

        }while(ch!=5);
    }
}
