package S11_Packages_Static_And_Final;


import com.challenge.Series;

import java.util.Random;

public class IncludeLibrary {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.print(Series.nSum(i) + " ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print(Series.factorial(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(Series.fibonacci(i) + " ");
        }
    }
}
