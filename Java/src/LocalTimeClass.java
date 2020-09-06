
import java.time.LocalTime;

public class LocalTimeClass {
    public static void main(String[] args) {
        int time = LocalTime.of(0, 0, 2).plusSeconds(6078).getSecond();
        System.out.println(time);
    }
}
