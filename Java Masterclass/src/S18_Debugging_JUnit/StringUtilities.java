package S18_Debugging_JUnit;

public class StringUtilities {
    private StringBuilder stringBuilder = new StringBuilder();
    private int charsAdded = 0;

    public void addChar(StringBuilder stringBuilder, char ch) {
        stringBuilder.append(ch);
        charsAdded++;
    }

    public String upperAndPrefix(String str) {
        String upper = str.toUpperCase();
        return "Prefix_" + upper;
    }

    public String addSufix(String str) {
        return str + "__Suffix";
    }

}
