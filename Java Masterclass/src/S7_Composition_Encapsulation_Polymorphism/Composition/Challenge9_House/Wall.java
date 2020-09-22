package S7_Composition_Encapsulation_Polymorphism.Composition.Challenge9_House;

public class Wall {

    private int width;
    private int height;
    private String color;
    private String direction;

    public Wall(int width, int height, String color, String direction) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public String getDirection() {
        return direction;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getArea() {
        return height * width;
    }

    public String getColor() {
        return color;
    }
}
