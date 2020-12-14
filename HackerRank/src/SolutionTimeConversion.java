
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class SolutionTimeConversion {

    static String timeConversion(String s) {
        Pattern pattern = Pattern.compile(":+|(\\w{2})");
        Matcher matcher = pattern.matcher(s);
        ArrayList<String> arr = new ArrayList<>();
        while (matcher.find()) {
            String token = matcher.group(0);
            arr.add(token);
        }
        String[] str = new String[arr.size()];
        for (int i = 0; i < str.length; i++) {
            if (arr.get(i) != null) {
                str[i] = arr.get(i);
            }
        }
        return "output";
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);
        System.out.println(result);
//        bw.write(result);
//        bw.newLine();

//        bw.close();
    }
}