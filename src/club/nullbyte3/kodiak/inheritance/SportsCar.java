package club.nullbyte3.kodiak.inheritance;


public class SportsCar extends Car {
    public SportsCar() {
        super("Sports car that goes vroom vroom", 15.0, 15.0, 0.1);
    }

    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        sportsCar.accelerate();
        sportsCar.decelerate();
        sportsCar.displayFuelConsumption();
    }
}
