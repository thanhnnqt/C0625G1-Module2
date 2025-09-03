package case_study.view;

import case_study.controller.*;

import java.util.Currency;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        displayMain();
    }
    public static void displayMain() {
        EmployeeManagementController employeeManagementController = new EmployeeManagementController();
        CustomerManagementController customerManagementController = new CustomerManagementController();
        FacilityManagementController facilityManagementController = new FacilityManagementController();
        BookingManagementController bookingManagementController = new BookingManagementController();
        PromotionManagementController promotionManagementController = new PromotionManagementController();
        Scanner scanner = new Scanner(System.in);
        final int EMPLOYEE = 1;
        final int CUSTOMER = 2;
        final int FACILITY = 3;
        final int BOOKING = 4;
        final int PROMOTION = 5;
        boolean flag = true;
        while (flag) {
            System.out.println("Select object");
            System.out.println("-----Menu-----" +
                    "\n 1. Employee Management" +
                    "\n 2. Customer Management" +
                    "\n 3. Facility Management" +
                    "\n 4. Booking Management" +
                    "\n 5. Promotion Management" +
                    "\n 6. Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case EMPLOYEE:
                    employeeManagementController.displayMenu();
                    break;
                case CUSTOMER:
                    customerManagementController.displayMenu();
                    break;
                case FACILITY:
                    facilityManagementController.displayMenu();
                    break;
                case BOOKING:
                    bookingManagementController.displayMenu();
                    break;
                case PROMOTION:
                    promotionManagementController.displayMenu();
                    break;
                default:
                    flag = false;
            }
        }
    }
}
