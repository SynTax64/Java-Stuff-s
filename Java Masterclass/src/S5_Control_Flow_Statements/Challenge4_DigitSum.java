package S5_Control_Flow_Statements;

public class Challenge4_DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(563));
        System.out.println(sumDigits(999));
        System.out.println(sumDigits(111));
        System.out.println(sumDigits(-15));
        System.out.println(sumDigits(654654446));

    }

    private static int sumDigits(int number) {
        int sum = 0;
/*
        if ((number >= 10) && (number < 100)) {
            int tens = number / 10;
            int ones = number % 10;
            sum = tens + ones;
        } else if ((number >= 100) && (number < 1000)) {
            int hundreds = number / 100;
            int tens = (number % 100) / 10;
            int ones = number % 10;
            sum = hundreds + tens + ones;
        } else {
            sum = -1;
        }
*/
        if (number < 10) {
            return -1;
        }

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }
}
