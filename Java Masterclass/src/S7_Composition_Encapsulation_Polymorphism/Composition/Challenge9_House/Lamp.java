package S7_Composition_Encapsulation_Polymorphism.Composition.Challenge9_House;

public class Lamp {

    private String name;
    private String manufacturer;
    private int powerConsumption;
    private int luminosity;
    private String colorOfLight;
    private boolean isOn = false;

    public String getName() {
        return name;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public int getLuminosity() {
        return luminosity;
    }

    public String getColorOfLight() {
        return colorOfLight;
    }

    public Lamp(String name,String manufacturer, int powerConsumption, int luminosity, String colorOfLight) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.powerConsumption = powerConsumption;
        this.luminosity = luminosity;
        this.colorOfLight = colorOfLight;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }


}
