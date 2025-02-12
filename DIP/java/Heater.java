package DIP.java;

public class Heater implements Switchable {
    public void turnOn() {
        System.out.println("Heater: heater is on...");
    }

    public void turnOff() {
        System.out.println("Heater: heater is off...");
    }
}
