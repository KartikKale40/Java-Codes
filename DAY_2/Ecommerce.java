package DAY_2;

abstract class  Product {
    int id;
    String name;
    double price;

    Product( int id,String name,double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    abstract void display();    
}

class Electronics extends  Product{
    
    Electronics(int id,String name,double price){
        super(id, name, price);
    }

    @Override
    void display(){
        System.out.println(id + "  " + name + "  Rs." + price + "  (Electronics)");

    }
}

class Clothing extends Product{

    Clothing(int id,String name,double price){
        super(id, name, price);
    }

    @Override
    void display(){
         System.out.println(id + "  " + name + "  Rs." + price + "  (Clothing)");
    }
}

// ---------- Loose Coupling ----------
interface payment   {
    void pay(double amt);    
}

class UPI implements payment{
     @Override
    public void pay(double amount) {
        System.out.println("Payment of Rs." + amount + " Successful using UPI");
    }
}


class Grocery  extends Product{

    Grocery(int id,String name,double price){
        super(id, name, price);
    }
    @Override
    void display(){
                System.out.println(id + "  " + name + "  Rs." + price + "  (Grocery)");

    }
}



public class Ecommerce {
    public static void main(String[] args) {
        
    }
}
