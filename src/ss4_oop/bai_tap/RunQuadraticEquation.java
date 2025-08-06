package ss4_oop.bai_tap;

import java.util.Scanner;

public class RunQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter b");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter c");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println(quadraticEquation.result());
    }
}
