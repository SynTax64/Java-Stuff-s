import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp {
    public static void main(String[] args) {
        String pattern1 = "[bcd]at";
        String pattern2 = "[a-d]x[1-5]";
        String pattern3 = "[a-mL-Z]";
        System.out.println("bat".matches(pattern1));
        System.out.println("cat".matches(pattern1));
        System.out.println("fat".matches(pattern1));

        System.out.println("px5".matches(pattern2));
        System.out.println("ax3".matches(pattern2));
        System.out.println("d*5".matches(pattern2));

        for (int i = 0; i < 100; i++) {
            char rndCh = (char) (65 + new Random().nextInt(57));
            System.out.println("Character: " + rndCh + " : " + (Character.toString(rndCh)).matches(pattern3));
        }


    }
}
