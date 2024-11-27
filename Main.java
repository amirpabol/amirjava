import java.util.Arrays;

class Contact {
    String name;
    String phoneNumber;
    String email;

    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phoneNumber + ", Email: " + email;
    }
}

class ContactManager {
    // Maximum number of contacts
    private static final int MAX_CONTACTS = 100;
    // Array to store contacts
    private static Contact[] contacts = new Contact[MAX_CONTACTS];
    private static int currentContactCount = 0;

    // Initialize array with null values
    public static void initialize() {
        Arrays.fill(contacts, null);
        currentContactCount = 0;
    }

    // Add a new contact
    public static void addContact(String name, String phoneNumber, String email) {
        if (currentContactCount < MAX_CONTACTS) {
            contacts[currentContactCount++] = new Contact(name, phoneNumber, email);
        } else {
            System.out.println("Maximum contact limit reached.");
        }
    }

    // Search for a contact by name
    public static String searchContact(String name) {
        for (int i = 0; i < currentContactCount; i++) {
            if (contacts[i].name.equalsIgnoreCase(name)) {
                return contacts[i].phoneNumber + ", " + contacts[i].email;
            }
        }
        return "Contact not found.";
    }

    // Display all contacts sorted by name
    public static void displayContacts() {
        Arrays.sort(contacts, 0, currentContactCount, (c1, c2) -> c1.name.compareTo(c2.name));

        for (int i = 0; i < currentContactCount; i++) {
            System.out.println(contacts[i]);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Initialize contact manager
        ContactManager.initialize();

        // Adding some contacts
        ContactManager.addContact("John Doe", "123-456-7890", "johndoe@email.com");
        ContactManager.addContact("Jane Smith", "987-654-3210", "janesmith@email.com");

        // Searching for a contact
        System.out.println("Search result for John Doe: " + ContactManager.searchContact("John Doe"));

        // Displaying all contacts
        System.out.println("\nAll contacts sorted by name:");
        ContactManager.displayContacts();
    }
}
