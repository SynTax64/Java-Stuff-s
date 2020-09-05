import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WithoutSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String time = scanner.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");

        LocalTime localTime = LocalTime.parse(time);
        System.out.println(localTime.format(dtf));
    }
}
