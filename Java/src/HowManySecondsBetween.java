import java.time.LocalTime;
import java.util.Scanner;

public class HowManySecondsBetween {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String startTime = scanner.nextLine();
        String endTime = scanner.nextLine();
        LocalTime ld1 = LocalTime.parse(startTime);
        LocalTime ld2 = LocalTime.parse(endTime);

        int result = ld1.toSecondOfDay() - ld2.toSecondOfDay();
        System.out.println(Math.abs(result));

    }
}
