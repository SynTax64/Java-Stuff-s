package S5_Control_Flow_Statements;

public class Coding7_SharedDigit {
    public static boolean hasSharedDigit(int a, int b) {
        if ((a >= 10 && a <= 99) && (b >= 10 && b <= 99)) {
            int lastDigitA = a % 10;
            int lastDigitB = b % 10;

            int firstDigitA = a / 10;
            int firstDigitB = b / 10;

            if ((lastDigitA == lastDigitB) || (firstDigitA == firstDigitB) || (firstDigitA == lastDigitB) || (lastDigitA == firstDigitB)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
