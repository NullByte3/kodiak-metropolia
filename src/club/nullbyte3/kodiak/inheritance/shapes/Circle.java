package club.nullbyte3.kodiak.inheritance.shapes;

public class Circle extends Shape {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // THIS IS NOT IN THE ASSIGNMENT, BUT IT WAS AT THE TOP OF THE MD FILE...? -Wissam
    @Override
    public String toString() {
        return "Circle with radius " + radius;
    }
}
