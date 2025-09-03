package case_study.controller;

import java.util.Scanner;

public class HouseController {
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        final int DISPLAY = 1;
        final int ADD = 2;
        final int EDIT = 3;
        boolean flag = true;
        while (flag) {
            System.out.println("Customer Facility");
            System.out.println("-----Menu-----" +
                    "\n 1. House" +
                    "\n 2. Villa" +
                    "\n 3. Room" +
                    "\n 4. Return main menu");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case DISPLAY:
                    displayVilla();
                    break;
                case ADD:
                    break;
                case EDIT:
                    break;
                default:
                    flag = false;
            }
        }
    }

    public void displayVilla() {
        Scanner scanner = new Scanner(System.in);
        final int DISPLAY = 1;
        final int ADD = 2;
        final int EDIT = 3;
        boolean flag = true;
        while (flag) {
            System.out.println("Customer Facility");
            System.out.println("-----Menu-----" +
                    "\n 1. Display list villa" +
                    "\n 2. Add new villa" +
                    "\n 3. Edit villa" +
                    "\n 4. Return main menu");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case DISPLAY:
                    break;
                case ADD:
                    break;
                case EDIT:
                    break;
                default:
                    flag = false;
            }
        }
    }
}
