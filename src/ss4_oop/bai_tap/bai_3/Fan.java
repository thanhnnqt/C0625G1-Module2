package ss4_oop.bai_tap.bai_3;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    boolean on = false;
    double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString () {
        return this.isOn() ? "Speed: " + this.getSpeed() + " Radius: " + this.getRadius() + " Color: " + this.getColor() + " Fan is on" :
                "Speed: " + this.getSpeed() + " Radius: " + getRadius() + " Color: " + this.getColor() + " Fan is off";
    }
}
