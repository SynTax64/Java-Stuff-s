package S7_Composition_Encapsulation_Polymorphism.Composition.Challenge9_House;

public class Resolution {
    private int width;
    private int height;

    public Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getMegaPixels() {
        System.out.println("TV has " + width * height + " megapixels");
        return width * height;
    }
}
