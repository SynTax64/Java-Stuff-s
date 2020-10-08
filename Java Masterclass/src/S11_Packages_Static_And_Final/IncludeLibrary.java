package S11_Packages_Static_And_Final;


import com.challenge.Series;

import java.util.Random;

public class IncludeLibrary {
    public static void main(String[] args) {
        System.out.println(Series.nSum(10));
        System.out.println(Series.factorial(new Random().nextInt(25)));
        System.out.println(Series.fibonacci(12));
    }
}
