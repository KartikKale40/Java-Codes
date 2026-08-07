package DAY_4.LambdaExp;


interface Square{
    int square(int num);
}

public class SquareNum {
    public static void main(String[] args) {

        Square s = num -> num * num;

         System.out.println("Square of " + 2 + " is: " + s.square(2));
        
    }
}
