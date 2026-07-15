import java.util.ArrayList;

public class ParkingManager {
    public static void main(String[] args) {
        ArrayList<String> parking = new ArrayList<>();

        parking.add("UP32AB1234");
        parking.add("DL01CD5678");

        if (parking.contains("UP32AB1234"))
            System.out.println("Vehicle Found");
        else
            System.out.println("Vehicle Not Found");

        parking.remove("DL01CD5678");

        System.out.println("\nParked Vehicles:");
        for (String vehicle : parking) {
            System.out.println(vehicle);
        }

        System.out.println("Occupied Slots: " + parking.size());
    }
}