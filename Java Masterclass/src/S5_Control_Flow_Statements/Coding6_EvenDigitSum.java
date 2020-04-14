package S5_Control_Flow_Statements;

public class Coding6_EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int testNumber = 0;
        while (number > 0) {
            if (((number % 10) % 2) == 0) {
                testNumber += number % 10;
            }
            number /= 10;
        }
        return testNumber;

    }
}
