package S11_Packages_Static_And_Final;

public class OuterClass {
    private int privateVarOne = 1;

    public OuterClass() {
        System.out.println("Created a OuterClass, privateVar has value: " + privateVarOne);
    }

    public int getPrivateVarOne() {
        return privateVarOne;
    }

    public void printPrivate() {
        for (int i = 0; i < 10; i++) {
            System.out.print((i * privateVarOne + " "));
        }
        System.out.println();
    }

    public void useInner() {
        InnerClass innerClass = new InnerClass();
        System.out.println("PrivateVarTwo from inner class: " + innerClass.privateVarTwo);
    }

    class InnerClass {
        private int privateVarTwo = 2;

        public InnerClass() {
            System.out.println("Created a InnerClass, privateVar has value: " + privateVarTwo);
        }

        public void printPrivate() {
            for (int i = 0; i < 10; i++) {
                System.out.print((i * privateVarTwo + " "));
            }
            System.out.println();
        }

        public void printValues() {
            System.out.println("PrivatevarOne inside InnerClass has value " + privateVarOne);
            System.out.println("PrivatevarTwo inside OuterClass has value " + privateVarTwo);
        }
    }
}
