package ss7_abstract_and_interface.bai_2;

public class Run {
    public static void main(String[] args) {
        Geometry[] geometrys = new Geometry[3];
        geometrys[0] = new Circle(10.0);
        geometrys[1] = new Rectangle(5.0, 2.0);
        geometrys[2] = new Square(4.0);
        for (Geometry geometry : geometrys) {
            System.out.println(geometry);
            if (geometry instanceof IColorable) {
                ((IColorable) geometry).howToColor();
            }
        }
    }
}
