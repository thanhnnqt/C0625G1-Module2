package ss5_static.bai_1;

public class Circle {
    private double radius = 1.0;
    String color = "red";

    public Circle() {
        radius = 20;
    }

    public Circle(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

}
