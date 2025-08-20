package ss15_exception;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("Nhập cạnh a:");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập cạnh b:");
                int b = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập cạnh c:");
                int c = Integer.parseInt(scanner.nextLine());
                Triangle triangle = new Triangle(a, b, c);
                System.out.println("Đây là tam giác");
                flag = false;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Lỗi nhập chuỗi");
            }
        }
    }
}
