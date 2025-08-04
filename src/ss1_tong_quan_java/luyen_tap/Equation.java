package ss1_tong_quan_java.luyen_tap;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giải phương trình bậc nhất");
        System.out.println("Cho phương trình 'a * x + b = c', hãy nhập các giá trị");
        System.out.println("a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("b: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("c: ");
        int c = Integer.parseInt(scanner.nextLine());
        if (a != 0) {
            int answer = (c - b) / a;
            System.out.println("Nghiệm của phương trình là: " + answer);
        } else {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
