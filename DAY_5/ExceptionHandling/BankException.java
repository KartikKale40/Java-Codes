package DAY_5.ExceptionHandling;

import java.util.Scanner;



class BankException extends Exception{
    String msg;
    BankException(String msg){
        this.msg = msg;
    }

    public String getMessage(){
        return msg;
    }
}

class Withdraw{
    double sAmount =4000;
    void withdraw(double amount) throws BankException {
        if(amount < sAmount){
            sAmount=sAmount-amount;
            System.out.println("Rs "+amount+ " Successfully withdraw from your account and Current acc balance is Rs "+sAmount);
        }else throw new BankException("Insufficent balance ..");
    }
}

public class BankWithdException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Ammount to withdraw :");
        double ammount = sc.nextDouble();
    }
}
