import java.time.LocalDate;
import java.util.Scanner;

public class DatesOffset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String date = scanner.nextLine();
        int offset = scanner.nextInt();
        LocalDate localDate = LocalDate.parse(date);
        int year = localDate.getYear();

        do {
            System.out.println(localDate);
            localDate = localDate.plusDays(offset);
        } while (localDate.getYear() == year);
    }
}
