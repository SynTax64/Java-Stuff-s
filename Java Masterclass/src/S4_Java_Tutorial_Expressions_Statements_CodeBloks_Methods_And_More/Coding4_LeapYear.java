package S4_Java_Tutorial_Expressions_Statements_CodeBloks_Methods_And_More;

public class Coding4_LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1800));
    }

    public static boolean isLeapYear(int year) {
        if (year > 0 && year <= 9999) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
