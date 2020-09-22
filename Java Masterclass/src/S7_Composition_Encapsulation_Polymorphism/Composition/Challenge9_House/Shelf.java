package S7_Composition_Encapsulation_Polymorphism.Composition.Challenge9_House;

public class Shelf {
    private int width;
    private int height;
    private String color;

    public Shelf(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }
}
