import java.math.BigInteger;
import java.util.Scanner;

public class ResultOfValue {
    public static void main(String[] args) {
        /*BigInteger current = BigInteger.ZERO;
        current.add(BigInteger.valueOf(1000));
        current.subtract(BigInteger.valueOf(10));
        BigInteger result = current.add(BigInteger.ONE);
        System.out.println(result);*/

        Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();
        BigInteger c = scanner.nextBigInteger();
        BigInteger d = scanner.nextBigInteger();

        BigInteger result = a.negate().multiply(b).add(c).subtract(d);

        System.out.println(result);

    }
}
