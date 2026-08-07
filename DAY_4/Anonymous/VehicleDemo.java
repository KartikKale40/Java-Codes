package DAY_4.Anonymous;

abstract class Vehicle {
    abstract void start();
    abstract void stop();

    void fuelType() {
        System.out.println("Fuel type: Petrol");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        
        Vehicle bike = new Vehicle() {
            @Override
            void start() {
                System.out.println("Bike started with kick start");
            }

            @Override
            void stop() {
                System.out.println("Bike stopped");
            }
        };

        
        bike.start();
        bike.stop();
        bike.fuelType();

       
        Vehicle car = new Vehicle() {
            @Override
            void start() {
                System.out.println("Car started with key");
            }

            @Override
            void stop() {
                System.out.println("Car stopped automatically");
            }
        };

        car.start();
        car.stop();
        car.fuelType();
    }
}