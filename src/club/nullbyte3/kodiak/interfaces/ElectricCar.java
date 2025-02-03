package club.nullbyte3.kodiak.interfaces;

public class ElectricCar extends AbstractVehicle {
    public ElectricCar() {
        super("Electric Car", "Electricity");
    }

    @Override
    public void start() {
        System.out.println("Electric Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Electric Car is stopping...");
    }

    @Override
    public double calculateFuelEfficiency() {
        return 5.0;
    }

    @Override
    public void honk() {
        System.out.println("Electric Car honks: Beep Beep!");
    }
}
