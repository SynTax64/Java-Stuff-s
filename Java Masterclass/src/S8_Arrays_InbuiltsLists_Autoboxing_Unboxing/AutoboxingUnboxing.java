package S8_Arrays_InbuiltsLists_Autoboxing_Unboxing;

import java.util.ArrayList;

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(56);
        integers.add(Integer.valueOf(55)); // unnecessary Boxing

    }

}
