package S7_Composition_Encapsulation_Polymorphism.Polymorhism.Challenge11_Cars;

public class Main {
    public static void main(String[] args) {
        BMW bmw = new BMW("BMW", 6);
        Audi audi = new Audi("Audi", 4);
        Skoda skoda = new Skoda("Skoda", 4);

        bmw.startEngine();
        bmw.stopEngine();
        bmw.accelerate();
        bmw.brake(11);

        audi.startEngine();
        audi.stopEngine();
        audi.accelerate();
        audi.brake(3);

        skoda.startEngine();
        skoda.stopEngine();
        skoda.accelerate();
        skoda.brake(8);
    }
}

class Car {
    private String name;
    private int wheels;
    private int doors;
    private int cylinders;
    private boolean engine;
    private int speed;

    public Car(String name, int cylinders) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine() {
        this.engine = true;
        return getClass().getSimpleName() + "-> Engine is started";
    }

    public String stopEngine() {
        this.engine = false;
        return getClass().getSimpleName() + "-> Engine is stopped";
    }

    public void accelerate() {
        this.speed += 10;
        System.out.println(getClass().getSimpleName() + "-> Your speed is now " + speed);
    }

    public void brake(int speed) {
        if (this.speed - speed <= 0) {
            System.out.println(getClass().getSimpleName() + "-> your speed is nov 0km/m");
            this.speed = 0;
        } else {
            this.speed -= speed;
            System.out.println(getClass().getSimpleName() + "-> your speed is now " + this.speed);
        }
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public int getCylinders() {
        return cylinders;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getSpeed() {
        return speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

class BMW extends Car {
    public BMW(String name, int cylinders) {
        super(name, cylinders);
    }
}

class Audi extends Car {
    public Audi(String name, int cylinders) {
        super(name, cylinders);
    }
}

class Skoda extends Car {
    public Skoda(String name, int cylinders) {
        super(name, cylinders);
    }
}
