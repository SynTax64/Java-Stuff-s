package S6_Inheritance_Constructors_Classes.Vehicles;

public class Car extends Vehicle {

    public Car(boolean handSteering, int gears, int speed) {
        super(handSteering, gears, speed);
    }

    public void upShift() {
        if (getGear() + 1 >= getGears()) {
            System.out.println("You are in 6 gear.");
            setGear(6);
        } else {
            setGear(getGear() + 1);
        }
    }

    public void downShift() {
        if (getGear() - 1 <= 0) {
            System.out.println("You are in 1 gear.");
            setGear(0);
        } else {
            setGear(getGear() - 1);
        }
    }

    public void decreaseSpeed(int speed) {
        if (getSpeed() - speed <= 0) {
            System.out.println("Speed can't be less than 0");
            setSpeed(0);
        } else {
            setSpeed(getSpeed() - speed);
        }
    }

    public void increaseSpeed(int speed) {
        if (getSpeed() + speed >= 220) {
            System.out.println("Speed can't be more than 220 km/h");
            System.out.println("You driving now max speed");
            setSpeed(220);
        } else {
            setSpeed(getSpeed() + speed);
        }
    }
}
