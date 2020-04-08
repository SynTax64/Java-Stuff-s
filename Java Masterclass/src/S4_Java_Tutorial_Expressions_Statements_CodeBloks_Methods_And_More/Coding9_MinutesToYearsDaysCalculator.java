package S4_Java_Tutorial_Expressions_Statements_CodeBloks_Methods_And_More;

public class Coding9_MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int secondsPerDay = 60 * 24;
            int days = ((int) (minutes / secondsPerDay));
            int years = days / 365;
            int remainingDays = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(-525600);

    }
}
