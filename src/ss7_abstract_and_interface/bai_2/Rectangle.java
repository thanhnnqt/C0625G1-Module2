package ss7_abstract_and_interface.bai_2;

public class Rectangle extends Geometry{
    public double width;
    public double height;

    public Rectangle() {
    }

    public Rectangle(double weight, double height) {
        this.width = weight;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle:" + " width: " + width + "; height: " + height + "; Area: " + getArea();
    }
}
