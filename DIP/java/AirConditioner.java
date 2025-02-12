package DIP.java;

public class AirConditioner implements Switchable {
    public void turnOn() {
        System.out.println("AirConditioner: air conditioner is on...");
    }

    public void turnOff() {
        System.out.println("AirConditioner: air conditioner is off...");
    }
}
