import java.time.LocalTime;
import java.util.Scanner;

public class SomeHoursMinutesAgo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String time = scanner.nextLine();

        LocalTime localTime = LocalTime.parse(time);
        int hoursOffset = scanner.nextInt();
        int minutesOffset = scanner.nextInt();

        int thisHours = localTime.getHour();
        int thisMinutes = localTime.getMinute();

        localTime = localTime.minusHours(hoursOffset).minusMinutes(minutesOffset);
        System.out.println(localTime);
    }
}
