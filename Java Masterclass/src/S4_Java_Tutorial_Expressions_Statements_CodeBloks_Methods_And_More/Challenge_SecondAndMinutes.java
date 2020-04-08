package S4_Java_Tutorial_Expressions_Statements_CodeBloks_Methods_And_More;

public class Challenge_SecondAndMinutes {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        System.out.println(getDurationString(500, 58));
        System.out.println(getDurationString(60));
        System.out.println(getDurationString(50, 61));

    }

    public static String getDurationString(int minutes, int seconds) {
        int tHours = 0;
        int tMinutes = 0;
        int tSeconds = 0;
        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
            if (minutes >= 60) {
                tHours = minutes / 60;
            }
            tMinutes = minutes % 60;
            tSeconds = seconds;

            String strHours = tHours + "h";
            String strMinutes = tMinutes + "m";
            String strSeconds = tSeconds + "s";

            if (tHours < 10) {
                strHours = "0" + tHours + "h";
            }
            if (tMinutes < 10) {
                strMinutes = "0" + tMinutes + "m";
            }

            if (tSeconds < 10) {
                strSeconds = "0" + tSeconds + "s";
            }

            return strHours + " " + strMinutes + " " + strSeconds;
        }
        return INVALID_VALUE_MESSAGE;
    }

    public static String getDurationString(int seconds) {
        int tMinutes = 0;
        int tSeconds = 0;
        if (seconds >= 0) {
            tMinutes = seconds / 60;
            tSeconds = seconds % 60;
            return getDurationString(tMinutes, tSeconds);
        }

        return INVALID_VALUE_MESSAGE;
    }
}
