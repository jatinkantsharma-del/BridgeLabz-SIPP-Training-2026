import java.util.*;

public class AttendanceTracker {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> attendance = new HashMap<>();
        attendance.put("Java", new ArrayList<>());
        attendance.put("Python", new ArrayList<>());

        markAttendance(attendance, "Java", "Rahul");
        markAttendance(attendance, "Java", "Amit");
        markAttendance(attendance, "Java", "Rahul"); // Duplicate
        markAttendance(attendance, "Python", "Priya");

        for (String subject : attendance.keySet()) {
            System.out.println(subject + " : " + attendance.get(subject));
            System.out.println("Total Students: " + attendance.get(subject).size());
        }
    }
    static void markAttendance(HashMap<String, ArrayList<String>> attendance, String subject, String student) {
        ArrayList<String> students = attendance.get(subject);
        if (!students.contains(student)) {
            students.add(student);
        } else {
            System.out.println(student + " is already marked present in " + subject);
        }
    }
}