package case_study.controller;

import java.util.Scanner;

public class PromotionManagementController {
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        final int SERVICE = 1;
        final int VOUCHER = 2;
        boolean flag = true;
        while (flag) {
            System.out.println("Promotion Management");
            System.out.println("-----Menu-----" +
                    "\n 1. Display list customers use service" +
                    "\n 2. Display list customers get voucher" +
                    "\n 3. Return main menu");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case SERVICE:
                    break;
                case VOUCHER:
                    break;
                default:
                    flag = false;
            }
        }
    }
}
