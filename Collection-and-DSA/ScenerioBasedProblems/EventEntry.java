import java.util.HashSet;

public class EventEntry {
    public static void main(String[] args) {

        HashSet<String> participants = new HashSet<>();

        participants.add("rahul@gmail.com");
        participants.add("amit@gmail.com");
        participants.add("rahul@gmail.com"); // Duplicate

        System.out.println("Registered Participants:");
        for (String email : participants) {
            System.out.println(email);
        }

        System.out.println("Total Attendees: " + participants.size());
    }
}