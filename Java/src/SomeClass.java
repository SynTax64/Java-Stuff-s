public class SomeClass {
    int value = 50;
    String string = "default";

    public SomeClass() {
        this(100);
    }

    public SomeClass(int value) {
        this.value = value;
    }

    public SomeClass(String string) {
        this();
        this.string = "some-value";
    }

    public SomeClass(int value, String string) {
        this(string);
    }

    public static void main(String[] args) {
        SomeClass someClass = new SomeClass("onetwo");
    }
}
