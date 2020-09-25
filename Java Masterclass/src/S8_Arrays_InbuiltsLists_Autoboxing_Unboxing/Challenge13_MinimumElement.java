package S8_Arrays_InbuiltsLists_Autoboxing_Unboxing;

import java.util.Scanner;

public class Challenge13_MinimumElement {
    public static Scanner scanner = new Scanner(System.in);

    public static int[] readIntegers(int count) {
        int[] arrayOfInts = new int[count];
        for (int i = 0; i < arrayOfInts.length; i++) {
            arrayOfInts[i] = scanner.nextInt();
        }
        return arrayOfInts;
    }

    public static int findMin(int[] array) {
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("Enter the number of elements in array: ");
        int size = scanner.nextInt();
        int[] array = readIntegers(size);
        printArray(array);
        System.out.println("Minimum number: " + findMin(array));
    }

}
