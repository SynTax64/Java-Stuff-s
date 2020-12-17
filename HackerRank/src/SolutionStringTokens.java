import java.util.Scanner;

public class SolutionStringTokens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] s = input.trim().split("[0-9 !,?._'@]+");
        int ls = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() > 0) {
                ls++;
            }
        }

        System.out.println(ls);
        for (String el : s) {
            System.out.println(el);
        }
    }
}
