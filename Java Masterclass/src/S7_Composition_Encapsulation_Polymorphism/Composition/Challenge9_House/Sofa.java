package S7_Composition_Encapsulation_Polymorphism.Composition.Challenge9_House;

public class Sofa {
    private int width;
    private int height;
    private int depth;
    private String color;
    private String material;

    public Sofa(int width, int height, int depth, String color, String material) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.color = color;
        this.material = material;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }
}
