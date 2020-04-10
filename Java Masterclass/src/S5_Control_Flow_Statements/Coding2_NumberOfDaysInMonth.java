package S5_Control_Flow_Statements;

public class Coding2_NumberOfDaysInMonth {
    public static void main(String[] args) {
//        System.out.println(isLeapYear(-1600));
//        System.out.println(isLeapYear(1600));
//        System.out.println(isLeapYear(2017));
//        System.out.println(isLeapYear(2000));
//        System.out.println(isLeapYear(1700));

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        int daysInMonth;
        if (((month < 1) || (month > 12)) || ((year < 1) || (year > 9999))) {
            daysInMonth = -1;
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    daysInMonth = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    daysInMonth = 30;
                    break;
                default:
                    if (isLeapYear(year)) {
                        daysInMonth = 29;
                    } else {
                        daysInMonth = 28;
                    }
            }
        }
        return daysInMonth;
    }
}
