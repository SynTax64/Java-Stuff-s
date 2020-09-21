package S6_Inheritance_Constructors_Classes.Vehicles;

public class Vehicle {
    private boolean handSteering;
    private int gears;
    private int speed;
    private int gear = 0;

    public Vehicle(boolean handSteering, int gears, int speed) {
        this.handSteering = handSteering;
        this.gears = gears;
        this.speed = speed;
    }

    public boolean isHandSteering() {
        return handSteering;
    }

    public int getGears() {
        return gears;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    public void setHandSteering(boolean handSteering) {
        this.handSteering = handSteering;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
}
