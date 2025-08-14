package bai_tap_co_ban.controller;

import bai_tap_co_ban.entity.Truck;
import bai_tap_co_ban.service.TruckService;
import bai_tap_co_ban.service.ITruckService;
import bai_tap_co_ban.view.TruckView;

import java.util.ArrayList;
import java.util.Scanner;

public class TrucController {
    private ITruckService truckService = new TruckService();

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        final int DISPLAY = 1;
        final int ADD = 2;
        final int DELETE = 3;
        final int SEARCH = 4;
        boolean flag = true;
        while (flag) {
            System.out.println("Quản lý sinh viên");
            System.out.println("-------Chức năng------" +
                    "\n 1. Danh sách phương tiện" +
                    "\n 2. Thêm mới" +
                    "\n 3. Xoá" +
                    "\n 4. Tìm kiếm" +
                    "\n 4. Sắp xếp theo điểm " +
                    "\n 5. Thoát");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case DISPLAY:
                    System.out.println("----Đây là chức năng hiển thị----");
                    ArrayList<Truck> carList = this.truckService.findAll();
                    TruckView.display(carList);
                    break;
                case ADD:
                    System.out.println("----Đây là chức năng thêm mới----");
                    Truck car = TruckView.inputData();
                    this.truckService.add(car);
                    System.out.println("Thêm moới thành công");
                    break;
                case DELETE:
                    System.out.println("----Đây là chức năng xoá----");
                    break;
                case SEARCH:
                    System.out.println("----Đây là chức năng tìm kiếm----");
                    break;
                default:
                    flag = false;
            }
        }
    }
}
