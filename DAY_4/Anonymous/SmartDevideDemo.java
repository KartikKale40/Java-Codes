package DAY_4.Anonymous;

abstract class SmartDevice {
    abstract void powerOff();
    abstract void powerOn();

    void brand() {
        System.out.println("brand: Samsung");
    }
}

public class SmartDevideDemo {
    public static void main(String[] args) {
        SmartDevice smartTv = new SmartDevice() {
            @Override
            void powerOff() {
                System.out.println("Smart TV powered off");
            }

            @Override
            void powerOn() {
                System.out.println("Smart TV powered on with HDMI input");
            }
        };

        
        smartTv.powerOn();
        smartTv.brand();
        smartTv.powerOff();
    }
}