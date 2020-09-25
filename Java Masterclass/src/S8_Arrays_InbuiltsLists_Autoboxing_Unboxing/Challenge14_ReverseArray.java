package S8_Arrays_InbuiltsLists_Autoboxing_Unboxing;

import java.util.Random;

public class Challenge14_ReverseArray {

    private static void reverse(int[] array) {
        for (int i = 0, r = array.length - 1; i < array.length / 2; i++, r--) {
            int tmp = array[i];
            array[i] = array[r];
            array[r] = tmp;
        }

//        int[] reversedArray = new int[array.length];
//
//        for (int i = 0, r = array.length - 1; i < array.length; i++, r--) {
//            reversedArray[i] = array[r];
//        }
//        array = reversedArray;
    }

    private static int[] createArray(int size) {
        int[] arrayOfInts = new int[size];
        for (int i = 0; i < arrayOfInts.length; i++) {
            arrayOfInts[i] = new Random().nextInt(100);
        }
        return arrayOfInts;
    }

    private static void printArray(int[] array) {
        int count = 0;
        for (int element : array) {
            if (count % 20 == 0 && count > 0) {
                System.out.println();
            }
            System.out.printf("%5d", element);
            count++;
        }
    }

    public static void main(String[] args) {
        int[] array = createArray(11);
        printArray(array);
        System.out.println();
        reverse(array);
        printArray(array);
    }
}
