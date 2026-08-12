package DAY_5.ExceptionHandling;

class Bank{

    void withdraw(int amount)throws Exception{
        System.out.println("Amount withdraw succesfully.."+amount);
    }

    void ATM(int amount) throws Exception{
        System.out.println("Atm is processing..");
        withdraw(amount);
    }

    void bank(int amount) throws Exception{
        System.out.println("Bank Server connectiong..");
        ATM(amount);
    }
}

public class ExceptionExample2 {
    public static void main(String[] args) {
        Bank b = new Bank();
        try{
            b.bank(-1);
        }catch(Exception e){
            System.out.println("Exception Handle "+e);
        }
    }
}
