package ss6_inheritance.bai_3;

public class Run {
    public static void main(String[] args) {
        Point point = new Point(2.2f, 2.5f);
        MovablePoint movablePoint = new MovablePoint(4.5f, 5.2f, 2.5f, 1.3f);
        System.out.println(point);
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());
    }
}
