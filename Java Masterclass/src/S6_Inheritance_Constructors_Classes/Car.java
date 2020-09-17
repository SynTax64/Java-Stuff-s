package S6_Inheritance_Constructors_Classes;

public class Car {
    public int doors;
    public int wheels;
    public String model;
    public String engine;
    public String color;

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setModel(String model) {
        String sModel = model.toLowerCase();
        if (sModel.equals("porsche") || sModel.equals("audi") || sModel.equals("bmw")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "doors=" + doors +
                ", wheels=" + wheels +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
