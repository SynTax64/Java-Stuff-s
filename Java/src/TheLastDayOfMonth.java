import java.time.LocalDate;
import java.util.Scanner;

public class TheLastDayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int days = scanner.nextInt();

        LocalDate localDate = LocalDate.ofYearDay(year, days);
        int lengthOfMonth = localDate.lengthOfMonth();

        System.out.println(localDate.getDayOfMonth() == lengthOfMonth);
    }
}
