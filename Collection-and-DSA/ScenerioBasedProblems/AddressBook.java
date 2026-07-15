import java.util.*;

public class AddressBook {
    public static void main(String[] args) {

        ArrayList<String> contacts = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();
        HashSet<String> phones = new HashSet<>();


        addContact(contacts, map, phones, "Rahul", "9876543210");
        addContact(contacts, map, phones, "Amit", "9876500000");
        addContact(contacts, map, phones, "Priya", "9876511111");
        addContact(contacts, map, phones, "Rohan", "9876543210");

        System.out.println("\nSearch Rahul: " + map.get("Rahul"));


        deleteContact(contacts, map, phones, "Amit");

        Collections.sort(contacts);

        System.out.println("\nContacts:");
        for (String name : contacts) {
            System.out.println(name + " : " + map.get(name));
        }
    }

    static void addContact(ArrayList<String> contacts, HashMap<String, String> map, HashSet<String> phones, String name, String phone) {
        if (phones.contains(phone)) {
            System.out.println("Duplicate phone number!");
            return;
        }
        contacts.add(name);
        map.put(name, phone);
        phones.add(phone);
    }

    static void deleteContact(ArrayList<String> contacts, HashMap<String, String> map, HashSet<String> phones, String name) {
        if (map.containsKey(name)) {
            phones.remove(map.get(name));
            map.remove(name);
            contacts.remove(name);
            System.out.println(name + " deleted.");
        } else {
            System.out.println("Contact not found.");
        }
    }
}