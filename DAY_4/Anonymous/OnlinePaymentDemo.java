package DAY_4.Anonymous;

interface Payment {
    void pay(double amount);
    void generateReceipt();

    default void paymentMode() {
        System.out.println("payment mode: UPI");
    }
}

public class OnlinePaymentDemo {
    public static void main(String[] args) {

        
        Payment payment = new Payment() {
            @Override
            public void pay(double amount) {
                if (amount > 0) {
                    System.out.printf("Paid: ₹%.2f via UPI%n", amount);
                } else {
                    System.out.println("Invalid amount");
                }
            }

            @Override
            public void generateReceipt() {
                System.out.println("Payment receipt generated successfully");
            }
        };

        payment.pay(150.75);
        payment.generateReceipt();
        payment.paymentMode();

        Payment creditCard = new Payment() {
            @Override
            public void pay(double amount) {
                System.out.printf("Paid: ₹%.2f via Credit Card%n", amount);
            }

            @Override
            public void generateReceipt() {
                System.out.println("Credit card receipt generated");
            }
        };

        creditCard.pay(99.50);
        creditCard.generateReceipt();
    }
}