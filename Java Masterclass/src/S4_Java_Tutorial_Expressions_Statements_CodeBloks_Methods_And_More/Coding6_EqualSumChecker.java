package S4_Java_Tutorial_Expressions_Statements_CodeBloks_Methods_And_More;

public class Coding6_EqualSumChecker {
    public static void main(String[] args) {
        hasEqualSum(1, 1, 1);
        hasEqualSum(1, 2, 2);
        hasEqualSum(1, -1, 0);
    }

    public static boolean hasEqualSum(int firstValue, int secondValue, int thirdValue) {
        return (firstValue + secondValue == thirdValue) ? true : false;
    }
}
