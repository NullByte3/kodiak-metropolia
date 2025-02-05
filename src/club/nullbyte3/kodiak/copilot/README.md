## Copilot assisted coding basically
Benefits of using it, is that if you know what you're doing, you'll most likely speed up everything you make.
flaws of using it is that it's not really perfect, and it's just a LLM spitting tokens, and the model is big enough to simulate "intelligence".
I wrote this myself as I didn't find any good example that it generated.
```java
public class Calculator {
    // Field to store the current value
    private int currentValue;

    // Resets the calculator to zero
    public void reset() {
        currentValue = 0;
    }

    // Adds a positive integer to the calculator
    public void add(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }
        currentValue += number;
    }

    // Returns the current value of the calculator
    public int getCurrentValue() {
        return currentValue;
    }

    // Temporary main method for testing the Calculator class
    public static void main(String[] args) {
        // Create a new Calculator instance
        Calculator calculator = new Calculator();

        // Add numbers to the calculator
        calculator.add(5);
        calculator.add(10);

        // Print the current value
        System.out.println("Current value: " + calculator.getCurrentValue());

        // Reset the calculator
        calculator.reset();

        // Print the value after reset
        System.out.println("Value after reset: " + calculator.getCurrentValue());

        // Test adding a negative number (this should throw an exception)
        try {
            calculator.add(-3);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Print the current value again to confirm no change
        System.out.println("Current value after exception: " + calculator.getCurrentValue());
    }
}
```

