import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class FindMondays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        int month = scanner.nextInt();

        LocalDate sd = LocalDate.of(year, month, 1);
        LocalDate ld = LocalDate.of(year, month, sd.lengthOfMonth());

        for (int i = sd.getDayOfMonth(); i < ld.getDayOfMonth(); i++) {
            LocalDate d = LocalDate.of(year, month, i);
            if (d.getDayOfWeek() == DayOfWeek.MONDAY) {
                System.out.println(d);
            }
        }
    }
}
