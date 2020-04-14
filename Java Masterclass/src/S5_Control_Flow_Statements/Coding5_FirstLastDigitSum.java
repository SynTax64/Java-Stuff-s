package S5_Control_Flow_Statements;

public class Coding5_FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(654));
    }

    public static int sumFirstAndLastDigit(int number) {
        int firstNumber = 0;
        int lastNumber = 0;

        if (number < 0) {
            return -1;
        }
        int lastDigit = number % 10;
        int firstDigit = 0;

        lastNumber = number;
        while (lastNumber != 0) {
            firstDigit = lastNumber % 10;
            lastNumber = lastNumber / 10;
        }

        return firstDigit + lastDigit;
    }
}
