import java.util.*;
class TempMain {
    public static void main(String[] args) {
        List<Flight<Integer>> flights = new ArrayList<>();
        flights.add(new Flight<>(101, "NYC", "LAX"));
        FlightUtility.displayFlightDetails(flights);
    }
}
