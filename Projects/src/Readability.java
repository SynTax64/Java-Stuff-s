
import java.util.Scanner;

public class Readability {
    public static String getReadability(String words) {
        String[] sentences = words.split("[!.?]");
        String output;
        double[] avgOfSentences = new double[sentences.length];
        for (int i = 0; i < sentences.length; i++) {
            int sum = 0;
            String[] w = sentences[i].trim().split(" ");
            int numOfWords = w.length;
            for (int j = 0; j < w.length; j++) {
                sum += w[j].length();
            }
            avgOfSentences[i] = sum / numOfWords;
        }
        double sumAvg = 0;
        for (double el : avgOfSentences) {
            sumAvg += el;
        }
        sumAvg = (sumAvg / avgOfSentences.length);

        if (sumAvg < 10) {
            output = "EASY";
        } else {
            output = "HARD";
        }
        return output;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        System.out.println(getReadability(words));
    }
}
