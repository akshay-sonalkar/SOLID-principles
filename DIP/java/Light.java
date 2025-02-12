package DIP.java;

public class Light implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Light: turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Light: turn off");
    }
}
