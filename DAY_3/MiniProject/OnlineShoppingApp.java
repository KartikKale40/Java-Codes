package DAY_3.MiniProject;
class Product {
    protected int id;
    protected String name;
    protected double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    
    public double calculateDiscount() {
        return 0; 
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Product)) return false;
        Product other = (Product) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Price: $" + price;
    }
}

class Electronics extends Product {
    private double warrantyPeriod;

    public Electronics(int id, String name, double price, double warranty) {
        super(id, name, price);
        this.warrantyPeriod = warranty;
    }

    @Override
    public double calculateDiscount() {
        return 10; 
    }
}

class Clothing extends Product {
    private String size;

    public Clothing(int id, String name, double price, String clothingSize) {
        super(id, name, price);
        this.size = clothingSize;
    }

    @Override
    public double calculateDiscount() {
        return 5; 
    }
}


class Grocery extends Product {
    private int quantity;

    public Grocery(int id, String name, double price, int quantity) {
        super(id, name, price);
        this.quantity = quantity;
    }

    @Override
    public double calculateDiscount() {
        return 2; 
    }
}


class ShoppingCart {
    private Product[] items;

    public ShoppingCart(int size) {
        this.items = new Product[size];
    }

    public void addProduct(Product product, int index) {
        if(index >= 0 && index < items.length) {
            items[index] = product;
        }
    }

    
    public Product[] searchByName(String name) {
        int count = 0;

        
        for(Product p : items) {
            if(p != null && p.name.toLowerCase().contains(name.toLowerCase())) {
                count++;
            }
        }

        Product[] result = new Product[count];
        int i = 0;

       
        for(Product p : items) {
            if(p != null && p.name.toLowerCase().contains(name.toLowerCase())) {
                result[i++] = p;
            }
        }

        return result;
    }

    
    public Product findById(int id) {
        for(Product product : items) {
            if(product != null && product.id == id) {
                return product;
            }
        }
        return null;  
    }

    public void displayProducts() {
        int count = 0;
        System.out.println("Your Shopping Cart:");
        for(Product product : items) {
            if(product != null) {
                double finalPrice = calculateFinalPrice(product);
                System.out.println((count+1) + ". " + product +
                                ", Discount: " + product.calculateDiscount() +
                                "% - Final Price: $" + String.format("%.2f", finalPrice));
                count++;
            }
        }

        if(count == 0) {
            System.out.println("Your cart is empty!");
        }
    }

    private double calculateFinalPrice(Product product) {
        double discount = product.calculateDiscount();
        return (product.price * (1 - discount/100));
    }
}


public class OnlineShoppingApp {
    public static void main(String[] args) {
        
        ShoppingCart cart = new ShoppingCart(5);

        
        cart.addProduct(new Electronics(1, "Smartphone", 699.99, 2), 0);
        cart.addProduct(new Clothing(2, "T-Shirt", 19.99, "M"), 1);
        cart.addProduct(new Grocery(3, "Milk", 2.50, 1), 2);

        
        System.out.println("=== Current Products ===");
        cart.displayProducts();

        
        System.out.println("\nSearch results for 'phone':");
        Product[] searchResults = cart.searchByName("phone");

        if(searchResults != null && searchResults.length > 0) {
            for(Product product : searchResults) {
                System.out.println(product);
            }
        } else {
            System.out.println("No products found matching the search.");
        }

        
        Product foundProduct = cart.findById(2); 
        if(foundProduct != null) {
            System.out.println("\nFound product with ID " + foundProduct.id);
            System.out.println("Name: " + foundProduct.name);
            System.out.println("Price after discount: $" +
                             String.format("%.2f", calculateFinalPrice(foundProduct)));
        } else {
            System.out.println("Product not found!");
        }
    }

    
    private static double calculateFinalPrice(Product product) {
        return (product.price * (1 - product.calculateDiscount()/100));
    }
}