import java.time.LocalDate;
import java.util.Scanner;

public class LocalDateClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();

        LocalDate ld1 = LocalDate.of(year, month, 1);
        LocalDate ld2 = LocalDate.of(year, month, ld1.lengthOfMonth());
        System.out.println(ld1 + " " + ld2);
    }
}
