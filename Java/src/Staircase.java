public class Staircase {
    static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; ++j) {
                System.out.print('\u00a0'); // nbsp
            }
            for (int j = n - i + 1; j <= n; ++j) {
                System.out.print('#');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        staircase(10);

    }
}
