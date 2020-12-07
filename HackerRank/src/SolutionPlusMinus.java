import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SolutionPlusMinus {

    static void plusMinus(int[] arr) {
        double positive = 0;
        double neutral = 0;
        double negative = 0;
        int arrLen = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] == 0) {
                neutral++;
            } else {
                negative++;
            }
        }
        System.out.printf("%.6f", positive / arrLen);
        System.out.printf("%.6f", negative / arrLen);
        System.out.printf("%.6f", neutral / arrLen);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
