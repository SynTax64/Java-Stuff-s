package S5_Control_Flow_Statements;

public class Coding4_NumberPalindrome {
    public static void main(String[] args) {
        isPalindrome(123454621);
    }

    public static boolean isPalindrome(int number) {
        int origNumber = number;
        int reverseNumber = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            number /= 10;
        }
        if (reverseNumber == origNumber) {
            return true;
        } else {
            return false;
        }
    }
}

