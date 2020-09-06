import java.time.LocalDate;
import java.util.Scanner;

public class NThDayFromEndOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int offset = scanner.nextInt();

        LocalDate localDate = LocalDate.of(year, month, 1);
        int lastDayInMonth = localDate.lengthOfMonth();
        localDate = LocalDate.of(year, month, (lastDayInMonth - offset) + 1);
        System.out.println(localDate);
    }
}