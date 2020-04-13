package S5_Control_Flow_Statements;

public class Challenge3_Sum3And5 {
    public static void main(String[] args) {
        int sum = 0;
        int counter = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                counter++;
                sum += i;
                System.out.println("The number " + i + " is divided with 3 or 5.");

                if (counter == 5) {
                    break;
                }
            }
        }
        System.out.println("Sum of the all numbers = " + sum);
    }
}
