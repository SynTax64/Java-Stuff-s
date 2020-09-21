package S6_Inheritance_Constructors_Classes.Vehicles;

public class ElectricCar extends Car {

    private int batteryCapacity;

    public ElectricCar(boolean handSteering, int gears, int speed) {
        super(handSteering, gears, speed);
    }
}
