package S4_Java_Tutorial_Expressions_Statements_CodeBloks_Methods_And_More;

public class Coding7_TenNumberChecker {
    public static void main(String[] args) {
        hasTeen(9, 99, 19);
        hasTeen(23, 15, 42);
        hasTeen(22, 23, 34);
    }

    public static boolean hasTeen(int firstValue, int secondValue, int thirdValue) {
        if (isTeen(firstValue) || isTeen(secondValue) || isTeen(thirdValue)) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int value) {
        if (value >= 13 && value <= 19) {
            return true;
        }
        return false;
    }
}
