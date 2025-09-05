package case_study.controller;

import case_study.entity.Booking;
import case_study.repository.BookingRepository;
import case_study.repository.ContractRepository;
import case_study.service.BookingService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class BookingManagementController {
    Scanner scanner = new Scanner(System.in);
    private static final BookingRepository bookingRepository = new BookingRepository();
    private static final ContractRepository contractRepository = new ContractRepository();
    private static final BookingService bookingService = new BookingService(bookingRepository, contractRepository);
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void displayMenu() {
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
                    addNewBooking();
                    break;
                case DISPLAY:
                    bookingService.displayAllBookings();
                    break;
                case CREATE:
                    bookingService.createContractFromQueue();
                    break;
                case CONTRACT:
                    bookingService.displayAllContracts();
                    break;
                case EDIT:
                    break;
                default:
                    flag = false;
            }
        }
    }

    private void addNewBooking() {
        System.out.println("\n--- ADD NEW BOOKING ---");
        System.out.print("Enter id booking: ");
        String maBooking = scanner.nextLine();
        System.out.print("Enter id customer: ");
        String maKhachHang = scanner.nextLine();
        System.out.print("Enter id service: ");
        String maDichVu = scanner.nextLine();
        LocalDate startDate = null;
        LocalDate endDate = null;
        LocalDate dateBooking = null;
        while (true) {
            try {
                System.out.print("Enter date booking (dd/MM/yyyy): ");
                dateBooking = LocalDate.parse(scanner.nextLine(), formatter);
                System.out.print("Enter start date (dd/MM/yyyy): ");
                startDate = LocalDate.parse(scanner.nextLine(), formatter);
                System.out.print("Enter end date (dd/MM/yyyy): ");
                endDate = LocalDate.parse(scanner.nextLine(), formatter);
                if (startDate.isBefore(endDate)) {
                    break;
                } else {
                    System.err.println("Error: start date > end date");
                }
            } catch (DateTimeParseException e) {
                System.err.println("Error date");
            }
        }
        bookingService.addNewBooking(new Booking(maBooking, maKhachHang, maDichVu, dateBooking, startDate, endDate));
    }
}
