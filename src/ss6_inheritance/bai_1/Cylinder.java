package ss6_inheritance.bai_1;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(int radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Circle radius : " + getRadius() + " ;Height: " + height + " ; Volume: " + getVolume();
    }
}
