package S5_Control_Flow_Statements;

import java.util.Scanner;

public class Challenge5_ReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        while (true) {
            int order = counter + 1;
            System.out.print("Enter number #" + order + ": ");

            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                int n = scanner.nextInt();
                counter++;
                sum += n;
                if (counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid number!");
            }
            scanner.nextLine();

        }
        System.out.println("Sum of all numbers is: " + sum);
    }
}
