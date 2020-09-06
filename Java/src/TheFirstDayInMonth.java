import java.time.LocalDate;
import java.util.Scanner;

public class TheFirstDayInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int day = scanner.nextInt();

        LocalDate localDate = LocalDate.of(year, 1, 1).plusDays(day - 1);
        System.out.println((localDate.getDayOfMonth() == 1) ? "true" : "false");
    }
}
