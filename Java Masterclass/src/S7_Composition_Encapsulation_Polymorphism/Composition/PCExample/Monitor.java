package S7_Composition_Encapsulation_Polymorphism.Composition.PCExample;

public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private MonitorResolution nativeMonitorResolution; // this is Composition

    public Monitor(String model, String manufacturer, int size, MonitorResolution nativeMonitorResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeMonitorResolution = nativeMonitorResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + ", " + y + " in colour " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public MonitorResolution getNativeResolution() {
        return nativeMonitorResolution;
    }
}
