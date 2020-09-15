package S5_Control_Flow_Statements;

import java.util.Scanner;

public class Challenge6_MaxMin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int maxNumber = 0;

        System.out.print("Enter the number ");
        int tN = scanner.nextInt();
        int minNumber = tN;


        while (true) {
            System.out.print("Enter the number ");
            boolean isNum = scanner.hasNextInt();

            if (isNum) {
                tN = scanner.nextInt();
                if (tN < minNumber) {
                    minNumber = tN;
                }
                if (tN > maxNumber) {
                    maxNumber = tN;
                }
            } else {
                break;
            }
        }
        System.out.println("Max number: " + maxNumber);
        System.out.println("Min number: " + minNumber);
    }
}
