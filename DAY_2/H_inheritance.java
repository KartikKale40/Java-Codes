package DAY_2;
class Payment{
    String C_name;

    Payment(String C_name){
        this.C_name = C_name;
    }
    void display(){
        System.out.println("Name of Customer is :"+C_name);
    }
}

class UPI extends Payment{
    
    UPI(String C_name){
        super(C_name);
    }

     void payUPI() {
        display();
        System.out.println("Payment Mode : UPI");
    }
}

class Credit extends Payment{
    
    Credit(String C_name){
        super(C_name);;
    }
     void payCred() {
        display();
        System.out.println("Payment Mode : Credit Card");
    }
}

class Net_bank extends Payment{

    Net_bank(String C_name){
        super(C_name);
    }
     void payNetBank() {
        display();
        System.out.println("Payment Mode : Net_Banking");
    }
}


public class H_inheritance {
    public static void main(String[] args) {

        UPI u = new UPI("Kartik");
        Credit c = new Credit("Om");
        Net_bank n = new Net_bank("Jay");

        System.out.println("UPI Payment");
        u.payUPI();

        System.out.println("\nCredit Card Payment");
        c.payCred();

        System.out.println("\nNet Banking Payment");
        n.payNetBank();
        
    }
}
