package DateTime;

import java.util.Calendar;

public class CalendarClass {

    public static void main(String[] args) {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.set(2015, 0, 1);
        cal2.set(2016, 1, 1);

        System.out.println(cal2.after(cal1));
        System.out.println(cal1.getTime());
        cal1.add(Calendar.MONTH, -1);
        System.out.println(cal1.compareTo(cal2));

    }
}
