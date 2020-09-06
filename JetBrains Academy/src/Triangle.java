import java.util.Scanner;

public class Triangle {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();

        if ((((A + B) > C) && ((A + C) > B)) && ((B + C) > A)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
