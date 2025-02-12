package DIP.java;

public class Switch {

    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void operate(String action) {
        switch (action.toLowerCase()) {
            case "on":
                device.turnOn();
                break;
            case "off":
                device.turnOff();
                break;
            default:
                System.out.println("Error: operation not supported.");
                break;
        }
    }
}
