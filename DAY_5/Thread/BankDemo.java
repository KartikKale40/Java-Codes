package DAY_5.Thread;

class ATM extends Thread{
    int balance =2000;
    String msg;

    ATM(String msg, int amount){
        this.balance = amount;
        this.msg = msg;
    }

    void deposite(int amount){
        System.out.println(amount+" INR Ammount Creadited successfully.");
        balance+=amount;
    }

    void withDraw(int amount){
        System.out.println(amount +" INR Amount Debited successfully");
        balance-=amount;
    }
}

class User extends Thread{
    String msg;
    int amount;
    
    User(String msg , int amount,ATM atm){
        this.balance = balance;
        this.msg = msg;
    }
    public void run(){
        if(msg == "deposite"){
            atm.deposite(balance);
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        
    }
}
