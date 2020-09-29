package S8_Arrays_InbuiltsLists_Autoboxing_Unboxing.Challenge15_MobilePhone;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private ArrayList<Contact> contacts = new ArrayList<Contact>();
    private Scanner scanner = new Scanner(System.in);

    public void printInstructions() {
        System.out.println("1. Print list of Contacts");
        System.out.println("2. Add new contact");
        System.out.println("3. Update existing contact");
        System.out.println("4. Remove contact");
        System.out.println("5. Search/find contact");
        System.out.println("0. Quit application");
    }

    public void printContacts() {
        System.out.println("You have " + contacts.size() + " saved contacts in your phone book");
        int counterOfContact = 1;
        for (Contact contact : contacts) {
            System.out.println("Contact " + counterOfContact + ": " + "\n\tName: " + contact.getFullName() +
                    "\n\tPhone number: " + contact.getPhoneNumber());
            counterOfContact++;
        }
    }

    public void printContact(String name) {
        int position = searchContact(name);
        if (position > 0) {
            Contact contact = contacts.get(position);
            System.out.println("Contact: " + "\n\tName: " + contact.getFullName() +
                    "\n\tPhone number: " + contact.getPhoneNumber());
        } else {
            System.out.println("Contact " + name + " not exist");
        }
    }

    public void addNewContact(Contact contact) {
        contacts.add(contact);
        System.out.println("You have added new contact");
    }

    public void updateContact(String name) {
        int position = searchContact(name);
        if (position >= 0) {
            Contact contact = contacts.get(position);
            System.out.print("Enter new fullName: ");
            String newFullName = scanner.nextLine();
            if (!newFullName.equals(contact.getFullName()) || !newFullName.equals(""))
                contact.setFullName(newFullName);

            System.out.print("Enter new phone number: ");
            String newPhoneNumber = scanner.nextLine();
            if (!newPhoneNumber.equals(contact.getPhoneNumber()) || !newPhoneNumber.equals("")) {
                contact.setPhoneNumber(newPhoneNumber);
            }
        } else {
            System.out.println("This contact not exist");
        }
    }

    public void removeContact(String name) {
        int position = searchContact(name);
        if (position >= 0) {
            Contact removedContact = contacts.remove(position);
            System.out.println("You are removed contact \n" + "\tName: " + removedContact.getFullName() +
                    "\n\tPhone number: " + removedContact.getPhoneNumber());
        } else {
            System.out.println("I can't remove contacts which not exist");
        }
    }

    public int searchContact(String name) {
        int position = 0;
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getFullName().equals(name)) {
                position = i;
                break;
            } else {
                position = -1;
            }
        }
        if (position >= 0) {
            System.out.println("Contact \"" + name + "\" found on position " + position);

        } else {
            System.out.println("Contact \"" + name + "\" is not found");
        }

        return position;
    }
}
