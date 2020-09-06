import java.util.Random;
import java.util.Scanner;

public class Randomness {
    public static void main(String[] args) {
        /*Random generator = new Random();
        int a = generator.nextInt(3);
        int b = generator.nextInt(2) + 1;
        int c = generator.nextInt(4);
        System.out.println(a + " " + b + " " + c);*/

        Scanner scanner = new Scanner(System.in);
        /*int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();*/
        Random random = new Random(8);
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.print(random.nextInt()+"\t\t ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}
