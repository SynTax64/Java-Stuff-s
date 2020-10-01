import java.util.*;

public class LinkedListHashSetTreeSet {
    public static String printCollections(Collection<Integer> collection) {
        String str = "";
        for (Integer el : collection) {
            str += el + " ";
        }
        return str;
    }

    public static String printWithIterator(Collection<Integer> collection) {
        String str = "";
        for (Iterator<Integer> it = collection.iterator(); it.hasNext(); ) {
            str += it.next().toString() + " ";
        }
        return str;
    }

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        HashSet<Integer> hashSet = new HashSet<Integer>();
        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        for (int i = 0; i < 50; i++) {
            linkedList.add((int) new Random().nextInt(10));
            hashSet.add((int) new Random().nextInt(10));
            treeSet.add((int) new Random().nextInt(10));
        }

        System.out.println("LinkedList: " + printCollections(linkedList));
        System.out.println("HashSet: " + printCollections(hashSet));
        System.out.println("TreeSet: " + printCollections(treeSet));

        System.out.println();

        System.out.println("LinkedList: " + printWithIterator(linkedList));
        System.out.println("HashSet: " + printWithIterator(hashSet));
        System.out.println("TreeSet: " + printWithIterator(treeSet));


    }
}
