package S6_Inheritance_Constructors_Classes;

public class Coding9_WallArea {

    private double width;
    private double height;

    public Coding9_WallArea() {
    }

    public Coding9_WallArea(double width, double height) {
        if (width < 0.0) {
            this.width = 0.0;
        } else {
            this.width = width;
        }

        if (height < 0.0) {
            this.height = 0.0;
        } else {
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if (width < 0.0) {
            this.width = 0.0;
        } else {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if (height < 0.0) {
            this.height = 0.0;
        } else {
            this.height = height;
        }
    }

    public double getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Coding9_WallArea wa = new Coding9_WallArea(1.125, -1.0);

    }
}
