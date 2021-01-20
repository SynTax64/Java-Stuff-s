package S18_Debugging_JUnit;

public class Main {
    public static void main(String[] args) {
        StringUtilities utilities = new StringUtilities();
        StringBuilder sb = new StringBuilder();
        while (sb.length() < 10) {
            utilities.addChar(sb, 'a');
        }
        System.out.println(sb);
        String str = "abcdef";
        String result = utilities.upperAndPrefix(utilities.addSufix(str));
        System.out.println(result);
    }
}