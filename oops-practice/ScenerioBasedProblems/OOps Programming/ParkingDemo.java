class Vehicle {

    String vehicleNumber;
    String ownerName;
    String vehicleType;

    Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void display() {
        System.out.println(vehicleNumber + " - " +
                ownerName + " - " + vehicleType);
    }
}

public class ParkingDemo {

    static void displayCars(Vehicle[] vehicles) {
        System.out.println("Cars:");
        for (Vehicle v : vehicles) {
            if (v.vehicleType.equalsIgnoreCase("Car")) {
                v.display();
            }
        }
    }

    static void displayBikes(Vehicle[] vehicles) {
        System.out.println("Bikes:");
        for (Vehicle v : vehicles) {
            if (v.vehicleType.equalsIgnoreCase("Bike")) {
                v.display();
            }
        }
    }

    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Vehicle("UP01", "A", "Car"),
                new Vehicle("UP02", "B", "Bike"),
                new Vehicle("UP03", "C", "Car"),
                new Vehicle("UP04", "D", "Bike"),
                new Vehicle("UP05", "E", "Car"),
                new Vehicle("UP06", "F", "Bike"),
                new Vehicle("UP07", "G", "Car"),
                new Vehicle("UP08", "H", "Bike"),
                new Vehicle("UP09", "I", "Car"),
                new Vehicle("UP10", "J", "Bike")
        };

        displayCars(vehicles);
        System.out.println();
        displayBikes(vehicles);
    }
}