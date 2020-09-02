package S5_Control_Flow_Statements;

public class Coding14_LargestPrime {
    public static int getLargestPrime(int n) {
        if (n <= 0 || n == 1) {
            return -1;
        }
        int lPrime = 0;
        for (int x = 1; x <= n; x++) {
            boolean test = true;
            if (n % x == 0) {
                for (int y = 2; y < x; y++) {
                    if (x % y == 0) {
                        test = false;
                    }
                }
                if (test) {
                    lPrime = x;
                }

            }
        }
        return lPrime;
    }
}