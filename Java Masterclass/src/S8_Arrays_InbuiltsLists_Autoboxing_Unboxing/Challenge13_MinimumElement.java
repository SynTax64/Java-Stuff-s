package S8_Arrays_InbuiltsLists_Autoboxing_Unboxing;

import java.util.Scanner;

public class Challenge13_MinimumElement {
    public static Scanner scanner = new Scanner(System.in);

    private static int[] readIntegers(int count) {
        int[] arrayOfInts = new int[count];
        for (int i = 0; i < arrayOfInts.length; i++) {
            System.out.printf("Enter the #%d number: ", (i + 1));
            arrayOfInts[i] = scanner.nextInt();
        }
        return arrayOfInts;
    }

    private static int findMin(int[] array) {
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    private static void printArray(int[] array) {
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
