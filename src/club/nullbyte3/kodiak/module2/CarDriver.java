package club.nullbyte3.kodiak.module2;

public class CarDriver {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota Corolla", 60, 100);
        myCar.fillTank();

        if (myCar.setCruiseControlTarget(80)) {
            System.out.println("Cruise target set to 80 km/h");
            if (myCar.turnCruiseControlOn()) {
                System.out.println("Cruise control activated. Current speed: " + myCar.getSpeed());
            } else {
                System.out.println("Failed to activate cruise control");
            }
        }

        while (myCar.getSpeed() < 80) {
            myCar.accelerate();
            System.out.println("Accelerating from: " + myCar.getSpeed());
        }

        myCar.turnCruiseControlOff();
        System.out.println("Cruise turned off");
    }
}