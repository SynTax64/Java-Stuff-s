package S8_Arrays_InbuiltsLists_Autoboxing_Unboxing;

import java.util.Random;
import java.util.Scanner;

public class BasicsArray {
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

    public static int[] createArray(int size) {
        int[] arrayOfInts = new int[size];
        for (int i = 0; i < arrayOfInts.length; i++) {
            arrayOfInts[i] = new Random().nextInt(100);
        }
        return arrayOfInts;
    }

    public static double getAverage(int[] array) {
        int sumOfArray = 0;
        for (int element : array) {
            sumOfArray += element;
        }
        return sumOfArray / array.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int sizeOfArray = scanner.nextInt();
        int[] sArray = createArray(sizeOfArray);
        //printArray(sArray);
        System.out.println("\nAverage value of all elements: " + getAverage(sArray));
    }
}
