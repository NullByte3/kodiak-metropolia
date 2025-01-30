package club.nullbyte3.kodiak.inheritance.shapes;


import java.util.List;

public class ShapeCalculator {
    public static void main(String[] args) {
        System.out.println("Shape Calculator");
        System.out.println();

        List<Shape> shapes = List.of(
                new Circle("Red", 5.0),
                new Rectangle("Blue", 4.0, 6.0),
                new Triangle("Green", 3.0, 8.0)
        );

        for (Shape shape : shapes) {
            // I know this is a stupid way, but it works -Wissam.
            System.out.println("Area of "+shape.getClass().getSimpleName()+": " + shape.calculateArea());
        }
    }
}