package S11_Packages_Static_And_Final;

public class InnerClassesMain {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.printPrivate();
        outerClass.printPrivate();
        innerClass.printValues();
        outerClass.useInner();

//        System.out.println(innerClass.privateVarTwo); not accessible from this class
    }
}
