import java.util.Locale;
import java.util.Scanner;

public class SolutionAnagrams {
//    static int getSumOfChars(String string) {
//        int s = 0;
//        for (int i = 0; i < string.length(); i++) {
//            s += string.charAt(i);
//        }
//        return s;
//    }

    static char[] sortCharArray(char[] chars) {
        char temp = 0;

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] > chars[i]) {
                    temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        return chars;
    }

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        boolean status = true;

        if (a.length() != b.length()) {
            status = false;
        } else {
            char[] chrA = a.toCharArray();
            char[] chrB = b.toCharArray();
            chrA = sortCharArray(chrA);
            chrB = sortCharArray(chrB);

            for (int i = 0; i < chrA.length; i++) {
                if (chrA[i] != chrB[i]) {
                    status = false;
                }
            }
        }
        return status;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
