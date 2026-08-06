package DAY_3.Interface;

interface payment {
 void pay();
}

class Upi implements payment{
    public void pay(){
        System.out.println("Pay using upi");
    }
}

class NetBanking implements payment{
    public void pay(){
        System.out.println("Pay using net banking");
    }
}

class CreditCard implements payment{
    public void pay(){
        System.out.println("Pay using credit card");
    }
}
public class Demo {
    public static void main(String[] args) {
        CreditCard c = new CreditCard();
        c.pay();
    }
}
