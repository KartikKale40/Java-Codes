package DAY_3.MiniProject;

import java.util.Scanner;

abstract class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    abstract double getDiscount();

    double finalPrice() {
        return price - (price * getDiscount() / 100);
    }

    @Override
    public String toString() {
        return "ID : " + id +
               "\nName : " + name +
               "\nPrice : ₹" + price +
               "\nDiscount : " + getDiscount() + "%" +
               "\nFinal Price : ₹" + finalPrice();
    }
}

class Electronics extends Product {

    Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double getDiscount() {
        return 10;
    }
}

class Clothing extends Product {

    Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double getDiscount() {
        return 20;
    }
}

class Grocery extends Product {

    Grocery(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double getDiscount() {
        return 5;
    }
}

public class OnlineShoppingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product products[] = new Product[3];

        products[0] = new Electronics(101, "Laptop", 60000);
        products[1] = new Clothing(102, "T-Shirt", 1000);
        products[2] = new Grocery(103, "Rice Bag", 2000);

        while (true) {

            System.out.println("\n===== ONLINE SHOPPING SYSTEM =====");
            System.out.println("1. Display Products");
            System.out.println("2. Search Product by ID");
            System.out.println("3. Exit");
            System.out.print("Enter Choice : ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("\nAvailable Products\n");

                    for (Product p : products) {
                        System.out.println("-------------------------");
                        System.out.println(p);
                    }

                    break;

                case 2:

                    System.out.print("Enter Product ID : ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Product p : products) {

                        if (p.id == searchId) {
                            System.out.println("\nProduct Found\n");
                            System.out.println(p);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Product Not Found.");
                    }

                    break;

                case 3:

                    System.out.println("Thank You...");
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }
}