import java.util.Scanner;

public class MiddleString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int strLength = string.length();
        int middlePoint = strLength / 2;

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < strLength; i++) {
            if (strLength % 2 == 0) {
                if (i != middlePoint && i != middlePoint - 1) {
                    sb.append(string.charAt(i));
                }
            } else {
                if (i != middlePoint) {
                    sb.append(string.charAt(i));
                }
            }
        }
        System.out.println(sb);
    }
}
