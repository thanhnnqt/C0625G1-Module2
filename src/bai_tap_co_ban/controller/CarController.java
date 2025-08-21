package bai_tap_co_ban.controller;

import bai_tap_co_ban.entity.Car;
import bai_tap_co_ban.service.CarService;
import bai_tap_co_ban.service.ICarService;
import bai_tap_co_ban.view.CarView;

import java.util.List;
import java.util.Scanner;

public class CarController {
    private ICarService carService = new CarService();

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        final int DISPLAY = 1;
        final int ADD = 2;
        final int DELETE = 3;
        final int SEARCH = 4;
        final int EDIT = 5;
        boolean flag = true;
        while (flag) {
            System.out.println("Quản lý phương tiện");
            System.out.println("-------Chức năng------" +
                    "\n 1. Danh sách phương tiện" +
                    "\n 2. Thêm mới" +
                    "\n 3. Xoá" +
                    "\n 4. Tìm kiếm" +
                    "\n 5. Sửa danh sách" +
                    "\n 6. Quay lại");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case DISPLAY:
                    System.out.println("----Đây là chức năng hiển thị----");
                    List<Car> carList = this.carService.findAll();
                    CarView.display(carList);
                    break;
                case ADD:
                    System.out.println("----Đây là chức năng thêm mới----");
                    Car car = CarView.inputData();
                    this.carService.add(car);
                    System.out.println("Thêm mới thành công");
                    break;
                case DELETE:
                    System.out.println("----Đây là chức năng xoá----");
                    System.out.println("Nhập biển kiếm soát");
                    int bienKiemSoat = Integer.parseInt(scanner.nextLine());
                    this.carService.delete(bienKiemSoat);
                    System.out.println("Đã xóa xe này");
                    break;
                case SEARCH:
                    System.out.println("----Đây là chức năng tìm kiếm----");
                    System.out.println("Nhập biển kiếm soát");
                    int searchbienKiemSoat = Integer.parseInt(scanner.nextLine());
                    System.out.println("Xe đang tìm là:");
                    Car carSeacrh = this.carService.search(searchbienKiemSoat);
                    System.out.println(carSeacrh);
                    break;
                case EDIT:
                    System.out.println("----Đây là chức năng sửa danh sách----");
                    System.out.println("Nhập biển kiếm soát");
                    int editBienKiemSoat = Integer.parseInt(scanner.nextLine());
                    Car carEdit = CarView.editData(editBienKiemSoat);
                    this.carService.edit(editBienKiemSoat, carEdit);
                    System.out.println("Đã sửa thành công");
                    break;
                default:
                    flag = false;
            }
        }
    }
}