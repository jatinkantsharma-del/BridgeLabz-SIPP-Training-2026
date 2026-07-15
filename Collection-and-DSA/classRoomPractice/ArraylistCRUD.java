import java.util.*;
public class ArraylistCRUD {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // Create
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        System.out.println("Create: " + list);

        // Read
        System.out.println("Read: " + list.get(1));

        // Update
        list.set(1, "Orange");
        System.out.println("Update: " + list);

        // Delete
        list.remove("Mango");
        System.out.println("Delete: " + list);
    

    }
}
