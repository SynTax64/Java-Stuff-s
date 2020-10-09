package S11_Packages_Static_And_Final;

public class Statics {
    static int numInstances = 0;
    private String name;

    public Statics(String name) {
        this.name = name;
        numInstances++;
    }

    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        /*Statics firstInstance = new Statics("1st instance");
        System.out.println(firstInstance.getName() + " is instance number " + Statics.getNumInstances());

        Statics secondInstance = new Statics("2rd instance");
        System.out.println(secondInstance.getName() + " is instance number " + Statics.getNumInstances());

        Statics thirdInstance = new Statics("3rd instance");
        System.out.println(thirdInstance.getName() + " is instance number " + Statics.getNumInstances());*/
        int result = multiply(6);
    }

    public static int multiplier = 7;

    public static int multiply(int number) {
        return number * multiplier;
    }
}
