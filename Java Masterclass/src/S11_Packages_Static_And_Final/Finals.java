package S11_Packages_Static_And_Final;

public class Finals {
    private static int classCounter = 0;
    private final int instanceNumber;
    private final String name;

    public Finals(String name) {
        this.name = name;
        classCounter++;
        this.instanceNumber = classCounter;
        System.out.println(name + " created instance " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Finals f1 = new Finals("one");
        Finals f2 = new Finals("two");
        Finals f3 = new Finals("three");

        System.out.println(f1.getName() + " instance " + f1.getInstanceNumber());
        System.out.println(f2.getName() + " instance " + f2.getInstanceNumber());
        System.out.println(f3.getName() + " instance " + f3.getInstanceNumber());

        double pi = Math.PI;
//        Math math = new Math(); //can't be instantiated, has private constructor and can't be extended because is final class

        int pw = 465654;
        Password password = new Password(pw);
        password.storePassword();
        password.letMeIn(65434);
        password.letMeIn(52342);
        password.letMeIn(908324);

        password.letMeIn(pw);

    }
}
