package DAY_2;

import java.util.Scanner;

class SBI_Bank{
    double bal;
    String name;
    int pin;

    SBI_Bank(double bal,String name,int pin){
        this.bal= bal;
         this.name =  name ;
        this.pin = pin;
    }

    void check_Bal(){
        System.out.println("Current Account Balance is Rs : "+bal);
    }

    public void withdraw(Scanner sc){
        System.out.println("Enter Ammount to Withdraw :");
        double withdraw_Amt = sc.nextDouble();

        if(withdraw_Amt > bal){
            System.out.println("Not Sufficient Balance..!\nPlease try again later..");
        }else{
            bal = bal-withdraw_Amt;
            System.out.println(withdraw_Amt+" Rs Withdraw From Your Account and current bal is "+bal);
        }
    }

    void deposite_Amt(Scanner sc){
        System.out.println("Enter Ammount to Deposite");
        double dep_amt = sc.nextDouble();

        if(dep_amt <=0){
            System.out.println("Enter Valid Ammount..!");
        }else{
            bal = bal + dep_amt;
            System.out.println(dep_amt +" Rs Deposited in Your account. \nAnd Total Bal is Rs "+bal);
            
        }

    }

    void change_Pin(Scanner sc){
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

    void display(Scanner sc){
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
                    withdraw(sc);
                    break;

                case 4:
                    change_Pin(sc);
                    break;
                case 5:
                    break;

                default:
                    System.out.println("Wrong Input ..!");
                    break;
            }

        }while(ch!=5);
    }

    }




public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SBI_Bank b = new SBI_Bank(20000,"abc",1234);
        b.display(sc);
    }
}
