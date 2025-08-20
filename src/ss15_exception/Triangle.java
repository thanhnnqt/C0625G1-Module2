package ss15_exception;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Cạnh tam giác không được nhỏ hơn 0");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Không phải cạnh của tam giác");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
