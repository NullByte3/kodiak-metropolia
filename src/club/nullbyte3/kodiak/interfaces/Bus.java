package club.nullbyte3.kodiak.interfaces;

public class Bus extends AbstractVehicle {
    private int capacity;

    public Bus(int capacity) {
        super("Bus", "Diesel");
        this.capacity = capacity;
    }

    @Override
    public void start() {
        System.out.println("Bus is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bus is stopping...");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nCapacity: " + capacity + " passengers";
    }

    @Override
    public double calculateFuelEfficiency() {
        return 8.0;
    }

    @Override
    public void honk() {
        System.out.println("Bus honks: Toot Toot!");
    }
}