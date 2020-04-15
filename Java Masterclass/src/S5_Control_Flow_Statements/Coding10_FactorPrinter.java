package S5_Control_Flow_Statements;

public class Coding10_FactorPrinter {
    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);

    }

    public static void printFactors(int number) {
        String output = "";
        if (number < 1) {
            output = "Invalid Value";
        } else {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    output += " " + i;
                }
            }
        }
        System.out.println(output.trim());
    }
}
