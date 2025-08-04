package ss1_tong_quan_java.luyen_tap;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều cao (m): ");
        double height = scanner.nextDouble();
        System.out.println("Nhập cân nặng (kg): ");
        double weight = scanner.nextDouble();
        double result = weight / (height * height);
        if (result < 18.5) {
            System.out.println("Underweight");
        } else if (result < 25) {
            System.out.println("Normal");
        } else if (result < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
