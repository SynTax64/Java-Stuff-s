import java.time.LocalDate;
import java.util.Scanner;

public class ConvertNumbersToDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int d1 = scanner.nextInt();
        int d2 = scanner.nextInt();
        int d3 = scanner.nextInt();

        LocalDate ld = LocalDate.of(year, 1, 1);
        System.out.println(ld.plusDays(d1 - 1));
        System.out.println(ld.plusDays(d2 - 1));
        System.out.println(ld.plusDays(d3 - 1));
    }
}
