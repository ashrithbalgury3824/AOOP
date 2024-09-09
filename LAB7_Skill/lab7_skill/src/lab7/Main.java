package lab7;

public class Main {
    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();

        Contact contact1 = new Contact("John Doe", "123-456-7890");
        Contact contact2 = new Contact("Jane Doe", "987-654-3210");

        contactManager.addContact(contact1);
        contactManager.addContact(contact2);

        System.out.println(contactManager.hasContact(contact1)); // true
        System.out.println(contactManager.getContactByPhoneNumber("123-456-7890").getName()); // John Doe

        contactManager.removeContact(contact1);
        System.out.println(contactManager.hasContact(contact1)); // false
    }
}
