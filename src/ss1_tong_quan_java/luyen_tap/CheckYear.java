package ss1_tong_quan_java.luyen_tap;

import java.util.Scanner;

public class CheckYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập năm cần kiểm tra");
        int year = Integer.parseInt(scanner.nextLine());
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Năm " + year + " là năm nhuận");
        } else if (year % 100 == 0 && year % 400 != 0) {
            System.out.println("Năm " + year + " không phải năm nhuận");
        } else if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("Năm " + year + " là năm nhuận");
        } else {
            System.out.println("Năm " + year + " không phải năm nhuận");
        }
    }
}
