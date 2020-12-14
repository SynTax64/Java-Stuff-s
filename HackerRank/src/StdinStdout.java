import java.util.Scanner;

public class StdinStdout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        double d = scanner.nextDouble();
        scanner.nextLine();
        String s = scanner.nextLine();

        System.out.println(s);
        System.out.println(d);
        System.out.println(i);
    }
}
