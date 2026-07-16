class ChargingStation {

    static int totalStations = 0;
    static double electricityRate = 8.5;

    String stationId;
    double unitsConsumed;

    ChargingStation(String stationId, double unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    void displayStationDetails() {
        System.out.println("Station ID: " + stationId);
        System.out.println("Units: " + unitsConsumed);
        System.out.println("Bill: " + calculateBill());
        System.out.println();
    }
}

public class ChargingDemo {
    public static void main(String[] args) {

        ChargingStation s1 = new ChargingStation("S1", 100);
        ChargingStation s2 = new ChargingStation("S2", 120);
        ChargingStation s3 = new ChargingStation("S3", 90);
        ChargingStation s4 = new ChargingStation("S4", 150);
        ChargingStation s5 = new ChargingStation("S5", 200);

        ChargingStation.electricityRate = 10;

        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        System.out.println("Total Stations: " + ChargingStation.totalStations);
    }
}