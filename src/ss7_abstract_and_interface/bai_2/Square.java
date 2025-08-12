package ss7_abstract_and_interface.bai_2;

public class Square extends Geometry implements IColorable {
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
    public void howToColor(){
        System.out.println("Đây là màu của hình vuông");
    }

    @Override
    public String toString() {
        return "Square:" + " width: " + width + "; Area: " + getArea();
    }
}
