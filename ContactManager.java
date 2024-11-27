import java.util.Arrays;

public class ContactManager {
    private static final int maxContacts = 100;
    private static String[][] contacts = new String[maxContacts][3];

    public static void initialize() {
        
        for (int i = 0; i < maxContacts; i++) {
            contacts[i] = new String[3]; // 3 elements: name, phone, email
        }
    }

    public static void addContact(String name, String phoneNum, String email) {
        for (int i = 0; i < maxContacts; i++) {
            if (contacts[i][0] == null) { // Find the first empty slot
                contacts[i][0] = name;
                contacts[i][1] = phoneNum;
                contacts[i][2] = email;
                return;
            }
        }
    }

    public static void searchContact(String email) {
        for (int i = 0; i < maxContacts; i++) {
            if (contacts[i][0] != null && contacts[i][0].equalsIgnoreCase(email)) {
                System.out.println("Contact found: ");
                System.out.println("Name: " + contacts[i][0]);
                System.out.println("Phone: " + contacts[i][1]);
                System.out.println("Email: " + contacts[i][2]);
                return;
            }
        }
        System.out.println("Contact not found!");
    }


        public static void displayContacts() {
        Arrays.sort(contacts, (a, b) -> {
            if (a[0] == null || b[0] == null) return 0;
            return a[0].compareToIgnoreCase(b[0]);
        });
        
        System.out.println("All Contacts (Sorted by Name):");
        for (int i = 0; i < maxContacts; i++) {
            if (contacts[i][0] != null) {
                System.out.println("Name: " + contacts[i][0] + ", Phone: " + contacts[i][1] + ", Email: " + contacts[i][2]);
            }
        }
    }

    public static void main(String[] args) {
        // Initialize the contact manager
        initialize();

        // Add some contacts
        addContact("Amir", "012-3456789", "amir@gmail.com");
        addContact("Pabol", "019-8765432", "pabol@outlook.com");
        addContact("Sofea", "013-8976509", "sofea.we@yahoo.com");
        
        // Search for a contact
        searchContact("Sofea");

        // Display all contacts sorted by name
        displayContacts();
    }
}
