package S17_Regular_Expresions;

public class Main {
    public static void main(String[] args) {
        String string = new String("I am a string. Yes I am.");
        String strCp = string.replaceAll("I", "You");
        System.out.println(strCp);

        String alphanumeric = "abcdefghijklmnoprqwzy";
        System.out.println(alphanumeric.replaceAll(".", "Y"));
        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY"));

        String secondString = "abcDeeeabcdefghijklmnoprabcDeeeqwzy";
        System.out.println(secondString.replaceAll("^abcDeee", "YYY"));

        System.out.println(alphanumeric.matches("abcdefghijklmnoprqwzy"));

        System.out.println(alphanumeric.replaceAll("prqwzy$", "THE END"));
        System.out.println(alphanumeric.replaceAll("[aei]", "X"));
        System.out.println(alphanumeric.replaceAll("[aei]", "I replaced a letter here"));
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X"));

        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));
        String newAlphanumeric = "abcdefg5432hijklm987noprqw4356zy";
        System.out.println(newAlphanumeric.replaceAll("[^ej]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[abcdef34567]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[a-f3-7]", "X"));
        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-8]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[0-9]", "X"));
        System.out.println(newAlphanumeric.replaceAll("\\d", "X"));
        System.out.println(newAlphanumeric.replaceAll("\\D", "X"));

        String hashWhiteSpace = "I have blanks and \t,. tab and also a newline\n";
        System.out.println(hashWhiteSpace);

        System.out.println(hashWhiteSpace.replaceAll("\\s", ""));
        System.out.println(hashWhiteSpace.replaceAll("\t", "X"));
        System.out.println(hashWhiteSpace.replaceAll("\\S", ""));
        System.out.println(newAlphanumeric.replaceAll("\\w", "X"));
        System.out.println(hashWhiteSpace.replaceAll("\\w", "X"));
        System.out.println(hashWhiteSpace.replaceAll("\\b", "X"));


        String thitrdAlphanumbericString = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(thitrdAlphanumbericString.replaceAll("^abcDe{3}", "YYY"));
        System.out.println(thitrdAlphanumbericString.replaceAll("^abcDe+", "YYY"));
        System.out.println(thitrdAlphanumbericString.replaceAll("^abcDe*", "YYY"));
        System.out.println(thitrdAlphanumbericString.replaceAll("^abcDe{2,5}", "YYY"));
        System.out.println(thitrdAlphanumbericString.replaceAll("h+i*j", "YYY"));
    }
}
