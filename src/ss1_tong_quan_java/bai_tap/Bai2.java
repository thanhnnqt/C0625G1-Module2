package ss1_tong_quan_java.bai_tap;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vnd = 26000;
        System.out.println("Nhập số tiền USD cần đổi: ");
        int usd = Integer.parseInt(scanner.nextLine());
        int change = usd * vnd;
        System.out.println("Số tiền sau khi đổi là: " + change + " VND");
    }
}
