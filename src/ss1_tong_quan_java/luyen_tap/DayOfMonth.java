package ss1_tong_quan_java.luyen_tap;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tháng: ");
        int month = Integer.parseInt(scanner.nextLine());
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + month + " có 31 ngày");
                break;
            case 2:
                System.out.println("Tháng " + month + " có 28 hoặc 29 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + month + " có 30 ngày");
                break;
        }
    }
}
