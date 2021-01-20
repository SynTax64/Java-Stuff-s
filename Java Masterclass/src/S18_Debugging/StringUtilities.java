package S18_Debugging;

public class StringUtilities {
    private StringBuilder stringBuilder = new StringBuilder();
    private int charsAdded = 0;

    public void addChar(StringBuilder stringBuilder, char ch) {
        stringBuilder.append(ch);
        charsAdded++;
    }
}
