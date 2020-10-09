package S10_Generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add("1.0"); // Runtime error because of String type cannot be converted to Integer
        printedDoubled(list);
    }

    public static void printedDoubled(ArrayList list) {
        for (Object el : list) {
            System.out.println((Integer) el * 2);
        }
    }
}
