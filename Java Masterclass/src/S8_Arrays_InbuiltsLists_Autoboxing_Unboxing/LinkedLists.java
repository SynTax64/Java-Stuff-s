package S8_Arrays_InbuiltsLists_Autoboxing_Unboxing;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            int rnd = new Random().nextInt(5);
//            linkedList.add(rnd);
            arrayList.add((int) (rnd * Math.random()));
        }

        System.out.println(linkedList);
        System.out.println(arrayList);

    }
}
