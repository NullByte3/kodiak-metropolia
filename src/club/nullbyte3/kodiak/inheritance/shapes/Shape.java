package club.nullbyte3.kodiak.inheritance.shapes;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double calculateArea();
}
