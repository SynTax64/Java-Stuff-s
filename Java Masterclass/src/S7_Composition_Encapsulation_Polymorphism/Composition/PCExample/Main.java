package S7_Composition_Encapsulation_Polymorphism.Composition.PCExample;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "480", dimensions);

        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, new MonitorResolution(1920, 1050));
        Motherboard motherboard = new Motherboard("z270 Gaming Plus", "MSI", 4, 4, "v9.04");
        PC pc = new PC(theCase, monitor, motherboard);
        pc.getMonitor().drawPixelAt(1500, 1200, "red");
        pc.getMotherboard().loadProgram("Windows 10");
        pc.getTheCase().pressPowerButton();
    }
}
