package DAY_4.Anonymous;

abstract class AnimalSound {

}


abstract class Animal {
    public abstract void makeSound();  

    public void eat() {              
        System.out.println("Animal is eating");
    }
}


public class AnimalDemo {
    public static void main(String[] args) {
        
        Animal dog = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Dog says: Bark bark");
            }
        };

        
        dog.eat();     
        dog.makeSound(); 
    }
}