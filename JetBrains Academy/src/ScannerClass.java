import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
//        String words = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr\n, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, \nsed diam voluptua.";
//        Scanner input = new Scanner(words);
//
//        String str1 = input.next();
//        String str2 = input.nextLine();
//        String str3 = input.next();
//        String str4 = input.next();
//        String str5 = input.nextLine();
//        input.close();
        String words = "Java\nProgramming\nLanguage";
        Scanner input = new Scanner(words);

        String word1 = input.next();
        String word2 = input.next();
        String word3 = input.next();

        System.out.println(word3);
        System.out.println(word2);
        System.out.println(word1);

    }
}
