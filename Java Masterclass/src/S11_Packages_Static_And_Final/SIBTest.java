package S11_Packages_Static_And_Final;

public class SIBTest {

    public static final String owner;

    static {
        owner = "david";
        System.out.println("SIBTest static initialization block called");
    }

    public SIBTest() {
        System.out.println("SIB constructor called");
    }

    static {
        System.out.println("2nd initialization block called");
    }

    public void someMethod() {
        System.out.println("someMethod called");
    }

    public static void main(String[] args) {
        System.out.println("mainMethod called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is: " + SIBTest.owner);
    }
}
