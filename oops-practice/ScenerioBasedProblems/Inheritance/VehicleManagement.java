interface Refuelable {
    void refuel();
}

class Vehicle {

    protected int maxSpeed;
    protected String model;

    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}

class ElectricVehicle extends Vehicle {

    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void charge() {
        System.out.println(model + " is charging...");
    }
}

class PetrolVehicle extends Vehicle
        implements Refuelable {

    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling...");
    }
}

public class VehicleManagement {
    public static void main(String[] args) {

        ElectricVehicle ev =
                new ElectricVehicle(180, "Tesla");

        PetrolVehicle pv =
                new PetrolVehicle(220, "BMW");

        ev.charge();
        pv.refuel();
    }
}