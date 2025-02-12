package DIP.java;

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
