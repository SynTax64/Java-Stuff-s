package S6_Inheritance_Constructors_Classes.SuperThisExample;

public class Rechtangle extends Shape {
    private int width;
    private int height;

    public Rechtangle(int width, int height) {
        this(width, height, 0, 0);
    }

    public Rechtangle(int width, int height, int x, int y) {
        super(x, y);
        this.width = width;
        this.height = height;
    }
}
