package S9_Interfaces_AbstractClasses_InnerClasses.Challenge18_Interfaces;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<String> readValues() {

        ArrayList<String> values = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;

        System.out.println("Choose\n" +
                "1. to enter a string\n" +
                "2. to quit");

        while (!quit) {
            System.out.print("Enter aa option:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(Saveable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to a storage device");
        }
    }

    public static void loadObject(Saveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
