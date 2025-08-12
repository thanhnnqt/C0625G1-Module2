package ss7_abstract_and_interface.bai_2;

public class Circle extends Geometry {
    public double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle:" + " radius: " + radius + "; Area: " + getArea();
    }

}
