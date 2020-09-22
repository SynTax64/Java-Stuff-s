package S7_Composition_Encapsulation_Polymorphism.Composition.Challenge9_House;

import S7_Composition_Encapsulation_Polymorphism.Composition.PCExample.MonitorResolution;

public class TV {
    private String manufacturer;
    private String model;
    private int size;
    private Resolution resolution;

    public TV(String manufacturer, String model, int size, Resolution resolution) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.size = size;
        this.resolution = resolution;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    public Resolution getResolution() {
        return resolution;
    }
}
