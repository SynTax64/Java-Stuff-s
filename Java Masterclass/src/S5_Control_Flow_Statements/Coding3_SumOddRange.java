package S5_Control_Flow_Statements;

public class Coding3_SumOddRange {
    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        return (number % 2 == 1);
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (end >= start && start > 0) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
        } else {
            sum = -1;
        }
        return sum;
    }
}
