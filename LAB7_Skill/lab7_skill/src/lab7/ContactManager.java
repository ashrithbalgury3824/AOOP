package lab7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContactManager {
    private Set<Contact> contacts;
    private Map<String, Contact> contactMap;

    public ContactManager() {
        contacts = new HashSet<>();
        contactMap = new HashMap<>();
    }

    public void addContact(Contact contact) {
        if (!contacts.contains(contact)) {
            contacts.add(contact);
            contactMap.put(contact.getPhoneNumber(), contact);
        }
    }

    public Contact getContactByPhoneNumber(String phoneNumber) {
        return contactMap.get(phoneNumber);
    }

    public boolean hasContact(Contact contact) {
        return contacts.contains(contact);
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
        contactMap.remove(contact.getPhoneNumber());
    }
}
