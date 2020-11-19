package patterns;

public class Patterns {

    /*
     *****
     *****
     *****
     *****
     *****
     */
    public static void pattern1(int rows, int cells) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cells; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    /*
    11111
    22222
    33333
    44444
    55555
    */
    public static void pattern2(int rows, int cells) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < cells; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    /*
    12345
    12345
    12345
    12345
    12345
    */

    public static void pattern3(int rows, int cells) {
        for (int i = 0; i < rows; i++) {
            for (int j = 1; j <= cells; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
    AAAAA
    BBBBB
    CCCCC
    DDDDD
    EEEEE
    */
    public static void pattern4(char chLow, char chHigh) {
        for (char i = chLow; i <= chHigh; i++) {
            for (char j = chLow; j <= chHigh; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    /*
    ABCDE
    ABCDE
    ABCDE
    ABCDE
    ABCDE
    */
    public static void pattern5(char chLow, char chHigh) {
        for (char i = chLow; i <= chHigh; i++) {
            for (char j = chLow; j <= chHigh; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
    55555
    44444
    33333
    22222
    11111
    */
    public static void pattern6(int a, int b) {
        for (int i = a; i >= b; i--) {
            for (int j = a; j >= b; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    /*
    54321
    54321
    54321
    54321
    54321
    */
    public static void pattern7(int a, int b) {
        for (int i = a; i >= b; i--) {
            for (int j = a; j >= b; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
    EEEEE
    DDDDD
    CCCCC
    BBBBB
    AAAAA
    */
    public static void pattern8(char ch1, char ch2) {
        for (char i = ch1; i >= ch2; i--) {
            for (char j = ch1; j >= ch2; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    /*
    EDCBA
    EDCBA
    EDCBA
    EDCBA
    EDCBA
    */
    public static void pattern9(char ch1, char ch2) {
        for (char i = ch1; i >= ch2; i--) {
            for (char j = ch1; j >= ch2; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
     *
     **
     ***
     ****
     *****
     */

    public static void pattern10(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    /*
     1
     22
     333
     4444
     55555
     */
    public static void pattern11(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    /*
     1
     12
     123
     1234
     12345
     */
    public static void pattern12(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
     A
     BB
     CCC
     DDDD
     EEEEE
     */
    public static void pattern13(char c1, char c2) {
        for (char i = c1; i <= c2; i++) {
            for (char j = c1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    /*
     A
     BB
     CCC
     DDDD
     EEEEE
     */
    public static void pattern14(char c1, char c2) {
        for (char i = c1; i <= c2; i++) {
            for (char j = c1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern(int n1, int n2) {
        for (int i = 0; i < n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (i < j) {
                    System.out.println("+");
                } else {
                    System.out.println("-");
                }
            }
        }
    }
}
