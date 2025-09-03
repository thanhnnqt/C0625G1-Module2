package case_study.controller;

import java.util.Scanner;

public class BookingManagementController {
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        final int ADD = 1;
        final int DISPLAY = 2;
        final int CREATE = 3;
        final int CONTRACT = 4;
        final int EDIT = 5;
        boolean flag = true;
        while (flag) {
            System.out.println("Booking Management");
            System.out.println("-----Menu-----" +
                    "\n 1. Add new booking" +
                    "\n 2. Display list booking" +
                    "\n 3. Creat new contracts" +
                    "\n 4. Display list contracts" +
                    "\n 5. Edit contracts" +
                    "\n 6. Return main menu");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case ADD:
                    break;
                case DISPLAY:
                    break;
                case CREATE:
                    break;
                case CONTRACT:
                    break;
                case EDIT:
                    break;
                default:
                    flag = false;
            }
        }
    }
}
