import java.util.Scanner;

public class Decrementator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] values = new int[input.length];

        for (int i = 0; i < values.length; i++) {
            values[i] = Integer.parseInt(input[i]) - 1;
            System.out.print(values[i] + " ");
        }
    }
}
