import java.time.LocalDateTime;
import java.util.Scanner;

public class SubtractingHoursAddingMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String timeAndDate = scanner.nextLine();

        int subtractHours = scanner.nextInt();
        int addMinutes = scanner.nextInt();

        LocalDateTime localDateTime = LocalDateTime.parse(timeAndDate);
        localDateTime = localDateTime.minusHours(subtractHours).plusMinutes(addMinutes);

        System.out.println(localDateTime);
    }
}
