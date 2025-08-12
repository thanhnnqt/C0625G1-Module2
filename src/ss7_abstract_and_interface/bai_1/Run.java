package ss7_abstract_and_interface.bai_1;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        IResizeable[] resizeables = new IResizeable[3];
        resizeables[0] = new Circle(5.5);
        resizeables[1] = new Rectangle(4.0, 2.0);
        resizeables[2] = new Square(3.0);
        for (IResizeable resizeable : resizeables) {
            resizeable.resize(50);
        }
        System.out.println(Arrays.toString(resizeables));
    }
}
