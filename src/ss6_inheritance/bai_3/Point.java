package ss6_inheritance.bai_3;

public class Point {
    public float x;
    public float y;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY() {
        return new float[] {x, y};
    }
    public void setXY() {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point: " + " x = " + x + " y = " + y;
    }
}
