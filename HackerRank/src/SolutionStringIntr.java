import java.util.Scanner;

public class SolutionStringIntr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] l = new String[2];
        l[0] = scanner.next();
        l[1] = scanner.next();
        int s = 0;

        for (int i = 0; i < l.length; i++) {
            s += l[i].length();
            l[i] = l[i].toLowerCase();
            l[i] = l[i].substring(0, 1).toUpperCase() + l[i].substring(1);
        }
        System.out.println(s);
        System.out.println((l[0].compareTo(l[1]) >= 1) ? "Yes" : "No");
        for (int i = 0; i < l.length; i++) {
            System.out.print(l[i] + " ");
        }
    }
}
