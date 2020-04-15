package S5_Control_Flow_Statements;

public class Coding11_PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false;
        } else {
            int sum = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            return (number == sum);
        }
    }
}
