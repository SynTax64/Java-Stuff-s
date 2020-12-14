import java.util.Scanner;

public class SolutionEndOfLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            counter++;
            System.out.println(counter + " " + line);
        }
        scanner.close();
    }
}
