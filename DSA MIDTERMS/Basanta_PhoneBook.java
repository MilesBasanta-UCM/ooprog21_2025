import java.util.ArrayList;
import java.util.Scanner;

// Data class representing a single contact
class PhoneContact {
    String firstName;
    String lastName;
    String company; // Corrected from "Comapny" in the prompt
    String alias;
    String phone;
    String emailAddress;

    public PhoneContact(String firstName, String lastName, String company, String alias, String phone, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.alias = alias;
        this.phone = phone;
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString()
    {
        return "Name: " + firstName + " " + lastName + " (" + alias + ") | Phone: " + phone + 
               " | Email: " + emailAddress + " | Company: " + company;
    }
}

public class Basanta_PhoneBook {
    // ArrayList to hold our contacts
    static ArrayList<PhoneContact> phoneBook = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;

        do {
            System.out.println("\n=== Phone Book Menu ===");
            System.out.println("1. Add Contact");
            System.out.println("2. Update Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Display All Contacts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            switch (choice) {
                case 1: addContact(); break;
                case 2: updateContact(); break;
                case 3: searchContact(); break;
                case 4: deleteContact(); break;
                case 5: displayAllContact(); break;
                case 6: System.out.println("Exiting Phone Book. Goodbye!"); break;
                default: System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
    }

    // a) insert / add contact
    static void addContact() {
        System.out.println("\n--- Add New Contact ---");
        System.out.print("First Name: "); String fName = scanner.nextLine();
        System.out.print("Last Name: "); String lName = scanner.nextLine();
        System.out.print("Company: "); String company = scanner.nextLine();
        System.out.print("Alias/Nickname: "); String alias = scanner.nextLine();
        System.out.print("Phone (Mobile/Landline): "); String phone = scanner.nextLine();
        System.out.print("Email Address: "); String email = scanner.nextLine();

        PhoneContact newContact = new PhoneContact(fName, lName, company, alias, phone, email);
        phoneBook.add(newContact);
        System.out.println("Contact added successfully!");
    }

    // b) edit / update contact
    static void updateContact() {
        System.out.print("\nEnter the exact First Name of the contact to update: ");
        String searchName = scanner.nextLine();
        
        for (PhoneContact contact : phoneBook) {
            if (contact.firstName.equalsIgnoreCase(searchName)) {
                System.out.println("Contact found. Enter new details (Press Enter to keep current value):");
                
                System.out.print("New First Name [" + contact.firstName + "]: ");
                String fName = scanner.nextLine();
                if (!fName.isEmpty()) contact.firstName = fName;

                System.out.print("New Last Name [" + contact.lastName + "]: ");
                String lName = scanner.nextLine();
                if (!lName.isEmpty()) contact.lastName = lName;

                System.out.print("New Phone [" + contact.phone + "]: ");
                String phone = scanner.nextLine();
                if (!phone.isEmpty()) contact.phone = phone;

                System.out.println("Contact updated successfully!");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // c) search a particular contact
    static void searchContact() {
        System.out.print("\nEnter First Name or Last Name to search: ");
        String keyword = scanner.nextLine();
        boolean found = false;

        for (PhoneContact contact : phoneBook)
         {
            if (contact.firstName.equalsIgnoreCase(keyword) || contact.lastName.equalsIgnoreCase(keyword)) {
                System.out.println("Found: " + contact.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching contact found.");
        }
    }

    // d) delete / remove a particular contact
    static void deleteContact() {
        System.out.print("\nEnter the exact First Name of the contact to delete: ");
        String searchName = scanner.nextLine();

        for (int i = 0; i < phoneBook.size(); i++) {
            if (phoneBook.get(i).firstName.equalsIgnoreCase(searchName)) {
                phoneBook.remove(i);
                System.out.println("Contact deleted successfully!");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // e) display all contacts
    static void displayAllContact() {
        System.out.println("\n--- All Contacts ---");
        if (phoneBook.isEmpty()) {
            System.out.println("The phone book is currently empty.");
        } else {
            for (int i = 0; i < phoneBook.size(); i++) {
                System.out.println((i + 1) + ". " + phoneBook.get(i).toString());
            }
        }
    }
}