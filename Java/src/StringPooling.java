public class StringPooling {
    public static void main(String[] args) {
        String name1 = new String("David");
        String name2 = new String("David");

        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));

    }
}
