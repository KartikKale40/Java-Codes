package DAY_4.Anonymous;

interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);

    default void accountType() {
        System.out.println("Savings Account");
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount() {
            @Override
            public void deposit(double amount) {
                System.out.printf("Deposited: $%.2f%n", amount);
            }

            @Override
            public void withdraw(double amount) {
                if (amount > 0) {
                    System.out.printf("Withdrew: $%.2f%n", amount);
                } else {
                    System.out.println("Invalid withdrawal amount");
                }
            }
        };

        account.deposit(150.75);
        account.withdraw(45.99);
        account.accountType();
    }
}