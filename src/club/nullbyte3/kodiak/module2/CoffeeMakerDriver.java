package club.nullbyte3.kodiak.module2;

public class CoffeeMakerDriver {
    public static void main(String[] args) {
        CoffeeMaker maker = new CoffeeMaker();
        maker.pressOnOff();
        maker.setCoffeeType("espresso");
        maker.setCoffeeAmount(50);

        System.out.println("Coffee maker is " + (maker.isOn() ? "on" : "off"));
        System.out.println("Coffee type is " + maker.getCoffeeType());
        System.out.println("Coffee amount is " + maker.getCoffeeAmount() + " ml");

        maker.pressOnOff();
        System.out.println("Coffee maker is " + (maker.isOn() ? "on" : "off"));
    }
}
