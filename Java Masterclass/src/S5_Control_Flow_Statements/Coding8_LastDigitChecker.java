package S5_Control_Flow_Statements;

public class Coding8_LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (isValid(a) && isValid(b) && isValid(c)) {
            int lastDigitA = a % 10;
            int lastDigitB = b % 10;
            int lastDigitC = c % 10;
            return ((lastDigitA == lastDigitB) || (lastDigitA == lastDigitC) || (lastDigitB == lastDigitC));
        }
        return false;
    }

    public static boolean isValid(int number) {
        return ((number >= 10) && (number <= 1000));
    }
}
