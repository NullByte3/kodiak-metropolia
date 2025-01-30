package club.nullbyte3.kodiak.inheritance;

public class Car {
    private String carName;
    public double accelerationRate = 10.0;
    public double decelerationRate = 10.0;
    public double fuelConsumption = 0.05;

    public Car(String carName, double accelerationRate, double decelerationRate, double fuelConsumption) {
        this.carName = carName;
        this.accelerationRate = accelerationRate;
        this.decelerationRate = decelerationRate;
        this.fuelConsumption = fuelConsumption;
    }

    public void accelerate() {
        System.out.println(carName+"Car is accelerating at " + accelerationRate + " m/s^2.");
    }

    public void decelerate() {
        System.out.println(carName+" is decelerating at " + decelerationRate + " m/s^2.");
    }

    public void displayFuelConsumption() {
        System.out.println("Fuel consumption: " + fuelConsumption + " liters per km.");
    }
}
