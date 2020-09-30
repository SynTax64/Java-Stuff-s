package S8_Arrays_InbuiltsLists_Autoboxing_Unboxing.LinkedListExample;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();

        placesToVisit.add("Dubai");
        placesToVisit.add("Paris");
        placesToVisit.add("New York");
        placesToVisit.add("Abu Dhabi");
        placesToVisit.add("Prague");
        placesToVisit.add("Vienna");
        placesToVisit.add("Lisbona");

        printList(placesToVisit);

        placesToVisit.add(1, "Mars");
        printList(placesToVisit);
    }

    public static void printList(LinkedList<String> list) {
        Iterator<String> i = list.iterator();

        while (i.hasNext()) {
            System.out.println("Now visiting -----> " + i.next());
        }
        System.out.println("====================");
    }
}
