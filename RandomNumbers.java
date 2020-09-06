import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            if (i % 10 == 0 && i > 0) {
                System.out.println();
            }
            System.out.print((random.nextInt(3)) + 1 + " ");
        }
    }
}
