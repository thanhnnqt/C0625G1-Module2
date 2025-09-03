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

        System.out.print("Nhập mã khách hàng: ");
        String maKhachHang = scanner.nextLine();

        System.out.print("Nhập mã dịch vụ: ");
        String maDichVu = scanner.nextLine();

        LocalDate ngayBatDau = null;
        LocalDate ngayKetThuc = null;
        LocalDate ngayBooking = null;
        while (true) {
            try {
                System.out.print("Nhập ngày bắt đầu (dd/MM/yyyy): ");
                ngayBooking = LocalDate.parse(scanner.nextLine(), formatter);
                System.out.print("Nhập ngày bắt đầu (dd/MM/yyyy): ");
                ngayBatDau = LocalDate.parse(scanner.nextLine(), formatter);

                System.out.print("Nhập ngày kết thúc (dd/MM/yyyy): ");
                ngayKetThuc = LocalDate.parse(scanner.nextLine(), formatter);
                if (ngayBatDau.isBefore(ngayKetThuc)) {
                    break;
                } else {
                    System.err.println("Lỗi: Ngày bắt đầu phải trước ngày kết thúc. Vui lòng nhập lại.");
                }
            } catch (DateTimeParseException e) {
                System.err.println("Lỗi: Định dạng ngày không hợp lệ. Vui lòng nhập theo định dạng dd/MM/yyyy.");
            }
        }
        bookingService.addNewBooking(new Booking(maBooking, maKhachHang, maDichVu, ngayBooking, ngayBatDau, ngayKetThuc));
    }
}
