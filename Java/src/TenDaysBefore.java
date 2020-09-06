import java.time.LocalDate;
import java.util.Scanner;

public class TenDaysBefore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();

        LocalDate localDate = LocalDate.parse(date);
        System.out.println(localDate.minusYears(30));
        System.out.println(localDate.plusYears(30));
    }

}
