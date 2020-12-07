import java.util.Arrays;

public class SolutionMiniMaxiSum {

    static void miniMaxSum(int[] arr) {

        long max = arr[0];
        long sum = 0;
        for (long el : arr) {
            if (el > max) {
                max = el;
            }
        }
        long min = max;
        for (long el : arr) {
            if (el < min) {
                min = el;
            }
            sum += el;
        }

        System.out.println((sum - max) + " " + (sum - min));

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 7, 9};
        miniMaxSum(arr);

    }
}
