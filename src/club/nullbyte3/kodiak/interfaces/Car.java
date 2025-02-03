package club.nullbyte3.kodiak.interfaces;

public class Car extends AbstractVehicle {
    private String color;

    public Car(String color) {
        super("Car", "Petrol");
        this.color = color;
    }

    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nColor: " + color;
    }

    @Override
    public double calculateFuelEfficiency() {
        return 15.0;
    }

    @Override
    public void honk() {
        System.out.println("Car honks: Beep Beep!");
    }
}