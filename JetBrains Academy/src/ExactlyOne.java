import java.util.Scanner;

public class ExactlyOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if (((number1 > 0) && (number2 > number1) && (number3 > number2)) ||
                ((number2 > 0) && (number1 > number2) && (number3 > number2)) ||
                ((number3 > 0) && (number2 > number3) && (number1 > number3))) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}

