package club.nullbyte3.kodiak.interfaces;

public abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
    protected String type;
    protected String fuel;

    public AbstractVehicle(String type, String fuel) {
        this.type = type;
        this.fuel = fuel;
    }

    @Override
    public String getInfo() {
        return "Type: " + type + "\nFuel: " + fuel;
    }

    @Override
    public void charge() {
        System.out.println("Charging the vehicle...");
    }

    public abstract void honk();
}