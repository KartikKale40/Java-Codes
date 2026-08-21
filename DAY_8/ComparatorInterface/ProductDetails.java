package DAY_8.ComparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product implements Comparable<Product>{
    int id;
    String name;
    int price;
    int stock;
    public Product(int id, String name, int price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + ", stock=" + stock + "]";
    }
    
    public int compareTo(Product that){
    if(this.id>that.id){
        return 1;
    }else{
       return -1;
    }
   }
   
}

public class ProductDetails {
    public static void main(String[] args) {
        List items = new ArrayList<>();
        items.add(new Product(7, "Bag", 600, 10));
        items.add(new Product(3, "Shoes", 1200, 5));
        items.add(new Product(1, "Watch", 3500, 8));
        items.add(new Product(4, "Jacket", 2500, 12));
        items.add(new Product(6, "Hat", 450, 20));
        items.add(new Product(2, "Wallet", 800, 15));

        Collections.sort(items);
        for(Object ob :items){
            System.out.println(ob);
        }

    }
    
}
