package S6_Inheritance_Constructors_Classes.StaticOrInstance;

public class AccessToStatic {

    public static String name;

    public AccessToStatic(String name) {
        AccessToStatic.name = name;
    }

    public void printName() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        AccessToStatic accessToStatic = new AccessToStatic("fluffy");
        AccessToStatic accessToStatic1 = new AccessToStatic("tom");
        accessToStatic.printName();// we can't access directly name variable trough instance, but trough instance method, which access to the static variable
        accessToStatic1.printName();

    }

}
