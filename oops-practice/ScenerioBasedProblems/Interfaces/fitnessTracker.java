interface Trackable {
    void logActivity();

    default void resetData() {
        System.out.println("Fitness data reset.");
    }
}

interface Reportable {
    void generateReport();
}

interface Notifiable {
    void sendAlert();
}

class FitnessDevice implements Trackable, Reportable, Notifiable {

    public void logActivity() {
        System.out.println("Activity Logged.");
    }

    public void generateReport() {
        System.out.println("Fitness Report Generated.");
    }

    public void sendAlert() {
        System.out.println("Water Reminder Sent.");
    }
}

public class fitnessTracker
 {
    public static void main(String[] args) {

        FitnessDevice obj = new FitnessDevice();

        obj.logActivity();
        obj.generateReport();
        obj.sendAlert();
        obj.resetData();
    }
}