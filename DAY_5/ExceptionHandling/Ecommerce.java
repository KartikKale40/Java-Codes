package DAY_5.ExceptionHandling;

import java.net.SocketImpl;
import java.util.Scanner;

class StockException extends Exception{
    String msg;

    StockException(String msg){
        this.msg = msg;

    }

    public String getMessage(){
        return msg;
    }
}


class PlaceOrder{
    int aStock = 16;
    void placeorder(int order) throws StockException {
        if(order <= aStock){
            System.out.println("Order place...");
            aStock = aStock - order;
        }else throw new StockException("Product out of stcok");
    }
}

public class Ecommerce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Quantity :");
        int order = sc.nextInt();
        PlaceOrder p = new PlaceOrder();

        try{
            p.placeorder(order);
        }catch(StockException e){
            System.out.println(e.getMessage());
        }
    }
}
