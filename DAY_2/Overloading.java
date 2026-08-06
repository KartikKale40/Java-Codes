package DAY_2;

public class Overloading {

    public void add(int a , int b){
        System.out.println("Addition of two number is :" +(a+b));
    }

    public void add(int a, int b, int c){
        System.out.println("Addition of 3 number is :" +(a+b+c));
    }
    public static void main(String[] args) {
        Overloading a = new Overloading();
        a.add(10, 20);
        a.add(10, 20, 30);
      
    }
}
