package S9_Interfaces_AbstractClasses_InnerClasses.AbstractClasses;

public class Parrot extends Bird implements Flyable{
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
