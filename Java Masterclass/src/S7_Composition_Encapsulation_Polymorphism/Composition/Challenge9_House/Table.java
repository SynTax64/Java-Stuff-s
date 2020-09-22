package S7_Composition_Encapsulation_Polymorphism.Composition.Challenge9_House;

public class Table {
    private int width;
    private int height;
    private String material;
    private int numberOfLegs;


    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public Table(int width, int height, String material, int numberOfLegs) {
        this.width = width;
        this.height = height;
        this.material = material;
        this.numberOfLegs = numberOfLegs;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getMaterial() {
        return material;
    }
}
