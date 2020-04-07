package S4_Java_Tutorial_Expressions_Statements_CodeBloks_Methods_And_More;

public class Coding2_MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int calculatedMegaBytes = kiloBytes / 1024;
            int calculatedKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + calculatedMegaBytes + " MB and " + calculatedKiloBytes + " KB");
        }
    }
}
