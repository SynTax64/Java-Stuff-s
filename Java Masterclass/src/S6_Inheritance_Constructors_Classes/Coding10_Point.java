package S6_Inheritance_Constructors_Classes;

public class Coding10_Point {
    private int x;
    private int y;

    public Coding10_Point() {
        this(0, 0);
    }

    public Coding10_Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt((x * x) + (y * y));
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
    }

    public double distance(Coding10_Point point) {
        return Math.sqrt(Math.pow((this.x - point.x), 2) + Math.pow((this.y - point.y), 2));
    }


    public static void main(String[] args) {
        Coding10_Point point1 = new Coding10_Point(6, 5);
        Coding10_Point point2 = new Coding10_Point(3, 1);

        System.out.println(point1.distance());
        System.out.println(point1.distance(point2));
        System.out.println(point1.distance(2, 2));
    }

}
