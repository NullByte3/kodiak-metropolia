package club.nullbyte3.kodiak.interfaces;

public class VehicleDemo {
    public static void main(String[] args) {
        System.out.println("Vehicle Demonstration\n");
        Vehicle car = new Car("Red");
        Vehicle motorcycle = new Motorcycle("Black");
        Vehicle bus = new Bus(40);
        Vehicle electricCar = new ElectricCar();
        car.start();
        car.stop();
        System.out.println("Car Information:");
        System.out.println(car.getInfo());
        //System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " km/l");
        ((AbstractVehicle) car).honk();
        System.out.println();
        motorcycle.start();
        motorcycle.stop();
        System.out.println("Motorcycle Information:");
        System.out.println(motorcycle.getInfo());
       // System.out.println("Fuel Efficiency: " + motorcycle.calculateFuelEfficiency() + " km/l");
        ((AbstractVehicle) motorcycle).honk();
        System.out.println();
        bus.start();
        bus.stop();
        System.out.println("Bus Information:");
        System.out.println(bus.getInfo());
        //System.out.println("Fuel Efficiency: " + bus.calculateFuelEfficiency() + " km/l");
        ((AbstractVehicle) bus).honk();
        System.out.println();
        electricCar.start();
        electricCar.stop();
        System.out.println("Electric Car Information:");
        System.out.println(electricCar.getInfo());
       // System.out.println("Energy Efficiency: " + electricCar.calculateFuelEfficiency() + " kwh/100km");
        ((AbstractVehicle) electricCar).charge();
        ((AbstractVehicle) electricCar).honk();
    }
}