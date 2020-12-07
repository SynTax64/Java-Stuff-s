import java.util.Scanner;
public class r {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String city = scanner.nextLine();
            String pattern ="(.*)burg";
            System.out.println(city.matches(pattern));

    }
}
