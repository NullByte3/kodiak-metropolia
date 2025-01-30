package club.nullbyte3.kodiak.inheritance;

public class Bus extends Car {
    private int passengerCount = 0;
    private final int capacity = 50;

    public Bus() {
        super("Bus", 5.0, 5.0, 0.2);
    }

    public void passengerEnter() {
        if (passengerCount < capacity) {
            passengerCount++;
            System.out.println("Passenger enters: " + passengerCount);
        } else {
            System.out.println("Bus is full, will explode.");
        }
    }

    public void passengerExit() {
        if (passengerCount > 0) {
            passengerCount--;
            System.out.println("Passenger exits: " + passengerCount);
        } else {
            System.out.println("God/an angel has left the bus.");
        }
    }
}
