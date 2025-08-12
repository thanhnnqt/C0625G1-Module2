package ss7_abstract_and_interface.bai_1;

public class Square extends Geometry implements IResizeable {
    public double width;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Square(double width) {
        this.width = width;
    }

    public Square() {
    }

    @Override
    public double getArea() {
        return width * width;
    }

    @Override
    public void resize(double percent) {
        width += width * percent / 100;
    }

    @Override
    public String toString() {
        return "Square:" + " width: " + width + "; Area: " + getArea();
    }
}
