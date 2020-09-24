package S8_Arrays_InbuiltsLists_Autoboxing_Unboxing;

import java.util.Random;

public class Challenge12_SortingArray {

    public static int[] sortArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
        return array;
    }
    public static int[] createArray(int size) {
        int[] arrayOfInts = new int[size];
        for (int i = 0; i < arrayOfInts.length; i++) {
            arrayOfInts[i] = new Random().nextInt(100);
        }
        return arrayOfInts;
    }

    public static void printArray(int[] array) {
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
        int[] arrayOfInts = createArray(20);
        printArray(arrayOfInts);
        sortArray(arrayOfInts);
        System.out.println();
        printArray(arrayOfInts);

    }
}
