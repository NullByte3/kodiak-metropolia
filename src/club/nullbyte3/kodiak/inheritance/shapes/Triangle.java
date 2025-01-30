package club.nullbyte3.kodiak.inheritance.shapes;


public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height; // not sure if this is correct.
    }

    // THIS IS NOT IN THE ASSIGNMENT, BUT IT WAS AT THE TOP OF THE MD FILE...? -Wissam
    @Override
    public String toString() {
        return "Triangle with base " + base + " and height " + height;
    }
}