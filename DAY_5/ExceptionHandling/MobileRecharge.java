package DAY_5.ExceptionHandling;

import java.util.Scanner;

class RechargeException extends Exception{
    String msg;

    RechargeException(String msg){
        this.msg = msg;
    }

    public String getMessage(){
        return msg;
    }
}

class Recharge{

    void recharge(double amount, String num) throws RechargeException{
        if(amount > 0){
            System.out.println("Recharge Successful on Mobile number " +num);
        }else throw new RechargeException("Invalid Recharge amount..");
    }
}

public class MobileRecharge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Mobile number :");
        String num = sc.nextLine();

        System.out.println("Enter Recharge Ammount :");
        double amount = sc.nextDouble();

        Recharge r = new Recharge();

        try{
            r.recharge(amount, num);
        }catch(RechargeException e){
            System.out.println(e.getMessage());
        }
        
    }
}
