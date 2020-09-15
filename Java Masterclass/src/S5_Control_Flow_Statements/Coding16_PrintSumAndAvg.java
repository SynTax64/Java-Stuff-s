package S5_Control_Flow_Statements;

import java.util.Scanner;

public class Coding16_PrintSumAndAvg {


    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sumN = 0;
        long avg = 0;
        int nCounter = 0;


        while (true) {
            boolean isNum = scanner.hasNextInt();

            if (isNum) {
                int n = scanner.nextInt();
                sumN += n;
                nCounter++;
            } else {
                break;
            }
            scanner.nextLine();
        }
        if (nCounter != 0) {
            avg = Math.round((float) sumN / nCounter);
        }
        System.out.println("SUM = " + sumN + " AVG = " + avg);
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
