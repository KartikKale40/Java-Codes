package DAY_4.Anonymous;
interface Greeting{

    abstract String greet(String a);

   default void welcomemsg(){
        System.out.println("Welcome useer");
    }
}

public class GreetingApp {
    public static void main(String[] args) {
        Greeting g = new Greeting(){
            public String greet(String a){
                return a ;
        }

    };
    System.out.println("hii");
}
}
