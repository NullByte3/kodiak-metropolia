package club.nullbyte3.kodiak.interfaces;

public class Motorcycle extends AbstractVehicle {
    private String color;

    public Motorcycle(String color) {
        super("Motorcycle", "Gasoline");
        this.color = color;
    }

    @Override
    public void start() {
        System.out.println("Motorcycle is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle is stopping...");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nColor: " + color;
    }

    @Override
    public double calculateFuelEfficiency() {
        return 25.0;
    }

    @Override
    public void honk() {
        System.out.println("Motorcycle honks: Honk Honk!");
    }
}
