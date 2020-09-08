import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

interface Cryptoable {
    char[] encryptionDecryption(String string, String mode, int offset);
}

class Unicoding implements Cryptoable {

    public char[] encryptionDecryption(String string, String mode, int offset) {
        char[] arrayString = new char[string.length()];

        for (int i = 0; i < string.length(); i++) {
            if (mode.equals("enc")) {
                arrayString[i] = (char) (string.charAt(i) + offset);
            } else if (mode.equals("dec")) {
                arrayString[i] = (char) (string.charAt(i) - offset);
            }
        }
        return arrayString;
    }
}

class Shifting implements Cryptoable {

    public char[] encryptionDecryption(String string, String mode, int offset) {
        char[] chars = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            char aChar = string.charAt(i);
            if (mode.equals("enc")) {
                if (isLetter(aChar)) {
                    if (aChar >= 'a' && aChar <= 'z') {
                        if (aChar + offset > 'z') {
                            chars[i] = (char) ('a' + ((aChar + offset) - 'z') - 1);
                        } else {
                            chars[i] = (char) (aChar + offset);
                        }
                    } else if (aChar >= 'A' && aChar <= 'Z') {
                        if (aChar + offset > 'Z') {
                            chars[i] = (char) ('A' + ((aChar + offset) - 'Z') - 1);
                        } else {
                            chars[i] = (char) (aChar + offset);
                        }
                    }
                } else {
                    chars[i] = aChar;
                }
            } else if (mode.equals("dec")) {
                if (isLetter(aChar)) {
                    if (aChar >= 'a' && aChar <= 'z') {
                        if (aChar - offset < 'a') {
                            chars[i] = (char) ('z' - ('a' - (aChar - offset)) + 1);
                        } else {
                            chars[i] = (char) (aChar - offset);
                        }
                    } else if (aChar >= 'A' && aChar <= 'Z') {
                        if (aChar - offset < 'a') {
                            chars[i] = (char) ('Z' - ('A' - (aChar - offset)) + 1);
                        } else {
                            chars[i] = (char) (aChar - offset);
                        }
                    }
                } else {
                    chars[i] = aChar;
                }
            }
        }
        return chars;
    }

    public boolean isLetter(char character) {
        return (character >= 'A' && character <= 'Z') ||
                (character >= 'a' && character <= 'z');
    }
}

public class EncryptionDecryption {
    public static Scanner input;

    public static void main(String[] args) {
        runFromCommand(args);
    }

    public static void runFromCommand(String[] args) {
        String mode = "enc";
        int key = 0;
        String data = "";
        String alg = "shift";
        String in = "";
        String out = "";
        File inFile = null;
        File outFile = null;

        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "-mode":
                    mode = args[i + 1];
                    break;
                case "-key":
                    key = Integer.parseInt(args[i + 1]);
                    break;
                case "-data":
                    data = args[i + 1];
                    break;
                case "-in":
                    in = args[i + 1];
                    break;
                case "-out":
                    out = args[i + 1];
                    break;
                case "-alg":
                    alg = args[i + 1];
                    break;
            }

        }
        Cryptoable cAlghoritm = null;

        if (alg.equals("unicode")) {
            cAlghoritm = new Unicoding();
        } else {
            cAlghoritm = new Shifting();
        }

        if (!in.equals("") && !data.equals("")) {
            System.out.println(cAlghoritm.encryptionDecryption(data, mode, key));
            return;
        } else if (!in.equals("") && out.equals("")) {
            inFile = new File(in);
            try {
                input = new Scanner(inFile);
                String read = input.nextLine();
                System.out.println(cAlghoritm.encryptionDecryption(read, mode, key));

            } catch (FileNotFoundException e) {
                System.out.println("File " + in + " not found!");
            }
        } else if (!in.equals("") && !out.equals("")) {
            outFile = new File(out);
            inFile = new File(in);
            try {
                input = new Scanner(inFile);
                String read = input.nextLine();
                FileWriter writer = new FileWriter(outFile);
                writer.write(cAlghoritm.encryptionDecryption(read, mode, key));
                input.close();
                writer.close();
            } catch (FileNotFoundException e) {
                System.out.println("File " + in + " not found!");
            } catch (IOException e) {
                System.out.println("Error");
            }
        } else if (in.equals("") && out.equals("") && !data.equals("")) {
            System.out.println(cAlghoritm.encryptionDecryption(data, mode, key));
        } else {
            System.out.println("Error");
        }
    }
}

