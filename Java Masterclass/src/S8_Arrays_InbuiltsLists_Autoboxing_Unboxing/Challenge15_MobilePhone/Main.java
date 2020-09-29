package S8_Arrays_InbuiltsLists_Autoboxing_Unboxing.Challenge15_MobilePhone;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void startPoint() {
        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.printInstructions();
        boolean quit = false;
        while (!quit) {
            System.out.print("Enter your choice: ");
            int n = scanner.nextInt();
            scanner.nextLine();
            switch (n) {
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    System.out.print("Enter a full name: ");
                    String fullName = scanner.nextLine();
                    System.out.println("Enter a phone number: ");
                    String phoneNumber = scanner.nextLine();
                    Contact contact = new Contact(fullName, phoneNumber);
                    mobilePhone.addNewContact(contact);
                    break;
                case 3:
                    System.out.print("Which contact do you want update: ");
                    String oName = scanner.nextLine();
                    mobilePhone.updateContact(oName);
                    break;
                case 4:
                    System.out.print("Which contact do you want remove: ");
                    String rString = scanner.nextLine();
                    mobilePhone.removeContact(rString);
                    break;
                case 5:
                    System.out.print("Enter name of the contact: ");
                    String fString = scanner.nextLine();
                    mobilePhone.searchContact(fString);
                    break;
                case 0:
                    quit = true;
                    System.out.print("Your are quit the application");
                    break;

                default:
                    System.out.println("You have to choice options from 0 to 5");
                    mobilePhone.printInstructions();
            }
        }
    }

    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();
        startPoint();
    }
}