package club.nullbyte3.kodiak.module2;

public class CoffeeMaker {
    private boolean isOn;
    private String coffeeType;
    private int coffeeAmount;

    public CoffeeMaker() {
        isOn = false;
        coffeeType = "normal";
        coffeeAmount = 10;
    }

    public void pressOnOff() {
        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(String type) {
        if (isOn && (type.equals("normal") || type.equals("espresso"))) {
            coffeeType = type;
        }
    }

    public int getCoffeeAmount() {
        return coffeeAmount;
    }

    public void setCoffeeAmount(int amount) {
        if (isOn && amount >= 10 && amount <= 80) {
            coffeeAmount = amount;
        }
    }
}
