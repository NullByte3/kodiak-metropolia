package club.nullbyte3.kodiak.inheritance.shapes;


public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
    // THIS IS NOT IN THE ASSIGNMENT, BUT IT WAS AT THE TOP OF THE MD FILE...? -Wissam
    @Override
    public String toString() {
        return "Rectangle with width " + width + " and height " + height;
    }
}
