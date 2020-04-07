package S4_Java_Tutorial_Expressions_Statements_CodeBloks_Methods_And_More;

public class Coding1_SpeedConverter {
    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour >= 0) {
            double kilometersToMiles = kilometersPerHour / 1.609;
            long roundedResult = Math.round(kilometersToMiles);
            return roundedResult;
        }
        return -1;
    }

    public static void printConversion(double kilometersPerHour) {
        long convertedToMiles = toMilesPerHour(kilometersPerHour);
        if (kilometersPerHour >= 0) {
            System.out.println(kilometersPerHour + " km/h = " + convertedToMiles + " mi/h");
        } else {
            System.out.println("Invalid Value");
        }

    }
}
