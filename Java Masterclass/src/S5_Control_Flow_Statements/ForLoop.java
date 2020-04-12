package S5_Control_Flow_Statements;

public class ForLoop {
    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
/*        System.out.println("10.000eur at 2% interest = " + calculateInterest(10000, 2));
        System.out.println("10.000eur at 3% interest = " + calculateInterest(10000, 3));
        System.out.println("10.000eur at 4% interest = " + calculateInterest(10000, 4));
        System.out.println("10.000eur at 5% interest = " + calculateInterest(10000, 5));
        System.out.println("10.000eur at 6% interest = " + calculateInterest(10000, 6));
        System.out.println("10.000eur at 7% interest = " + calculateInterest(10000, 7));
        System.out.println("10.000eur at 8% interest = " + calculateInterest(10000, 8));*/
//        double amount = 10000;
/*        for (int i = 2; i <= 8; i++) {
            System.out.printf("%.0feur at %d%% interest = %.2f\n", amount, i, calculateInterest(amount, i));
            amount += calculateInterest(amount, i);s
        }*/

        /*for (int i = 2; i < 9; i++) {
            System.out.printf("%.0feur at %d%% interest = %.2f\n", amount, i, calculateInterest(amount, i));
        }*/

      /*  for (int i = 8; i > 1; i--) {
            System.out.printf("%.0feur at %d%% interest = %.2f\n", amount, i, calculateInterest(amount, i));
        }*/


//        Formatter f = new Formatter(Locale.GERMANY);
//        f.format("%.0f %.0f %.0f %.0f", 10d, 20d, 30d, 50d);
//        System.out.println(f.toString());
        int minNumber = 1;
        int maxNumber = 100;
        int counter = 0;

        for (int i = minNumber; i < maxNumber; i++) {

            if (isPrime(i)) {
                counter++;
                System.out.println("Number " + i + " is a prime number!");
                if (counter == 10) {
                    System.out.println("Exiting the for loop!");
                    break;
                }
            }
        }
    }
}
