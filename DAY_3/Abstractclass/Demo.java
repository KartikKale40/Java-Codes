package DAY_3.Abstractclass;

abstract class Car {
    // Car(){
    //     System.out.println("This is Constructor of abstract class");
    // }

    abstract void start();

    void show(){
        System.out.println("Details of Cars");
    }
}

class Honda extends Car{
    void start(){
        System.out.println("It will start");
    }
}

class Audi extends Car {
    void start(){
        System.out.println("Start with some sound");
    }
    
}

public class Demo {
    public static void main(String[] args) {
        Car a = new Honda();
        Car b =  new Audi();
        a.start();
        b.start();
    }
}
