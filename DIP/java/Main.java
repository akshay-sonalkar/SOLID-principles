package DIP.java;

/**
 * DIP (Dependency Inversion Principle) -- When high-level modules depend on low-level modules, the system becomes rigid.
 * The Dependency Inversion Principle is a way to decouple software modules.
 * This principle states that high-level modules should not depend on low-level modules.
 * Both should depend on abstractions.
 *
 */

public class Main {
    public static void main(String[] args) {
        Switchable airConditioner = new AirConditioner();
        Switchable heater = new Heater();
        Switchable light = new Light();
        Switchable fan = new Fan();

        Switch ac = new Switch(airConditioner);
        ac.operate("on");
        ac.operate("off");

        Switch ht = new Switch(heater);
        ht.operate("on");
        ht.operate("off");

        Switch lt = new Switch(light);
        lt.operate("on");
        lt.operate("off");

        Switch fn = new Switch(fan);
        fn.operate("on");
        fn.operate("off");

    }
}
