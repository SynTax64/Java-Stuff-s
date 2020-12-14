import java.util.Scanner;

public class QuerySeriesLoopsII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[][] arr = new int[t][];
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            arr[i] = new int[n];
            int tR = a;
            for (int j = 0, c = 1; j < arr[i].length; j++, c = c * 2) {
                tR += (c * b);
                arr[i][j] = tR;
            }
        }
        in.close();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
