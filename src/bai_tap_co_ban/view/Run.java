package bai_tap_co_ban.view;

import bai_tap_co_ban.controller.CarController;
import bai_tap_co_ban.controller.TrucController;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        displayMain();
    }

    public static void displayMain() {
        CarController carController = new CarController();
        TrucController trucController = new TrucController();
        Scanner scanner = new Scanner(System.in);
        final int CAR = 1;
        final int TRUCK = 2;
        boolean flag = true;
        while (flag) {
            System.out.println("Chọn đối tượng quản lý");
            System.out.println("-------Chức năng------" +
                    "\n 1. Quản lý xe oto" +
                    "\n 2. Quản lý xe tải" +
                    "\n 3. Thoát");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case CAR:
                    System.out.println("----Đây là chức năng quản lý xe oto----");
                    carController.displayMenu();
                    break;
                case TRUCK:
                    System.out.println("----Đây là chức năng quản lý xe tải----");
                    trucController.displayMenu();
                    break;
                default:
                    flag = false;
            }
        }
    }
}
