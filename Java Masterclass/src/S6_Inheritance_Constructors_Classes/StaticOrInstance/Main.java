package S6_Inheritance_Constructors_Classes.StaticOrInstance;

public class Main {
    public int x = 0;
    public static int sX = 0;

    public static void incrementStaticVariable() {
        sX++;
    }

    public void incrementInstanceVariable() {
        this.x++;
        sX++;
        System.out.println(sX++ + this.x);
    }


}
