import java.time.LocalDateTime;
import java.util.Scanner;

public class MergeTwoLocateDateClasses {
    public static LocalDateTime merge(LocalDateTime dateTime1, LocalDateTime dateTime2) {

        int years = dateTime1.getYear();
        int month = dateTime1.getMonthValue();
        int days = dateTime1.getDayOfMonth();
        int hours = dateTime1.getHour();
        int minutes = dateTime1.getMinute();
        int seconds = dateTime1.getSecond();

        years = Math.max(years, dateTime2.getYear());
        month = Math.max(month, dateTime2.getMonthValue());
        days = Math.max(days, dateTime2.getDayOfMonth());
        hours = Math.max(hours, dateTime2.getHour());
        minutes = Math.max(minutes, dateTime2.getMinute());
        seconds = Math.max(seconds, dateTime2.getSecond());

        return LocalDateTime.of(years, month, days, hours, minutes, seconds);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLocalDate = scanner.nextLine();
        String secondLocalDate = scanner.nextLine();

        LocalDateTime ldt1 = LocalDateTime.parse(firstLocalDate);
        LocalDateTime ldt2 = LocalDateTime.parse(secondLocalDate);

        System.out.println(merge(ldt1, ldt2));
    }
}
