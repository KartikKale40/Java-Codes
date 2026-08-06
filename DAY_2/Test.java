class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }

    void display() {
        System.out.println("This is Dog class");
    }
}

public class Test {
    public static void main(String[] args) {

        
        Animal a = new Dog();
        a.sound();

        
        Dog d = (Dog) a;
        d.display();
        d.sound();
    }
}

