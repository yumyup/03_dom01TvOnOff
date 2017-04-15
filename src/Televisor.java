
public class Televisor {
    private boolean enabled;

    public void turnOn() {
        enabled = true;
    }

    public void turnOff() {
        enabled = false;
    }

    public void showStatus() {
        if (enabled) {
            System.out.println("TV is on");
        } else {
            System.out.println("TV is off");
        }
    }
}
