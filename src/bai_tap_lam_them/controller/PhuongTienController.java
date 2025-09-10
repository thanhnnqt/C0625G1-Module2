package bai_tap_lam_them.controller;

import bai_tap_lam_them.entity.Drone;
import bai_tap_lam_them.entity.Xe;
import bai_tap_lam_them.service.DroneService;
import bai_tap_lam_them.service.IDroneService;
import bai_tap_lam_them.service.IXeService;
import bai_tap_lam_them.service.XeService;
import bai_tap_lam_them.view.DroneView;
import bai_tap_lam_them.view.XeView;

import java.util.List;
import java.util.Scanner;

public class PhuongTienController {
    private final IDroneService droneService = new DroneService();
    private final IXeService xeService = new XeService();

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        final int ADD = 1;
        final int DISPLAY = 2;
        final int DELETE = 3;
        final int SEARCH = 4;
        boolean flag = true;
        while (flag) {
            System.out.println("-----Menu-----" +
                    "\n 1. Thêm mới phương tiện" +
                    "\n 2. Hiển thị danh sách phương tiện" +
                    "\n 3. Xóa phương tiện" +
                    "\n 4. Tìm kiếm phương tiện" +
                    "\n 5. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case ADD:
                    System.out.println("Chọn phương tiện cần thêm mới");
                    displayThemMoi();
                    break;
                case DISPLAY:
                    System.out.println("Chọn phương tiện muốn hiển thị");
                    displayHienThi();
                    break;
                case DELETE:
                    System.out.println("Chọn phương tiện muốn xóa");
                    displayDelete();
                    break;
                case SEARCH:
                    System.out.println("Chọn phương tiện muốn tìm kiếm");
                    displaySearch();
                    break;
                default:
                    flag = false;
            }
        }
    }

    public void displayThemMoi() {
        Scanner scanner = new Scanner(System.in);
        final int DRONE = 1;
        final int XE = 2;
        boolean flag = true;
        while (flag) {
            System.out.println("-----Danh sách-----" +
                    "\n 1. Thêm mới Drone" +
                    "\n 2. Thêm mới xe" +
                    "\n 3. Quay lại");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case DRONE:
                    System.out.println("Đây là chức năng thêm mới Drone");
                    Drone drone = DroneView.input();
                    this.droneService.add(drone);
                    System.out.println("Thêm mới thành công");
                    break;
                case XE:
                    System.out.println("Đây là chức năng thêm mới Xe");
                    Xe xe = XeView.input();
                    this.xeService.add(xe);
                    System.out.println("Thêm mới thành công");
                    break;
                default:
                    flag = false;
            }
        }
    }

    public void displayHienThi() {
        Scanner scanner = new Scanner(System.in);
        final int DRONE = 1;
        final int XE = 2;
        boolean flag = true;
        while (flag) {
            System.out.println("-----Danh sách-----" +
                    "\n 1. Hiển thị Drone" +
                    "\n 2. Hiển thị xe" +
                    "\n 3. Quay lại");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case DRONE:
                    System.out.println("Hiển thị danh sách drone");
                    List<Drone> droneList = this.droneService.findAll();
                    DroneView.display(droneList);
                    break;
                case XE:
                    System.out.println("Hiển thị danh sách xe");
                    List<Xe> xeList = this.xeService.findAll();
                    XeView.display(xeList);
                    break;
                default:
                    flag = false;
            }
        }
    }

    public void displayDelete() {
        Scanner scanner = new Scanner(System.in);
        final int DRONE = 1;
        final int XE = 2;
        boolean flag = true;
        while (flag) {
            System.out.println("-----Danh sách-----" +
                    "\n 1. Xóa Drone" +
                    "\n 2. Xóa xe" +
                    "\n 3. Quay lại");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case DRONE:
                    System.out.println("Xóa drone");
                    System.out.println("Nhập số hiệu drone muốn xóa");
                    String soHieuDrone = scanner.nextLine();
                    this.droneService.delete(soHieuDrone);
                    break;
                case XE:
                    System.out.println("Xóa xe");
                    System.out.println("Nhập số hiệu xe muốn xóa");
                    String soHieuXe = scanner.nextLine();
                    this.xeService.delete(soHieuXe);
                    break;
                default:
                    flag = false;
            }
        }
    }

    public void displaySearch() {
        Scanner scanner = new Scanner(System.in);
        final int DRONE = 1;
        final int XE = 2;
        boolean flag = true;
        while (flag) {
            System.out.println("-----Danh sách-----" +
                    "\n 1. Tìm kiếm Drone" +
                    "\n 2. Tìm kiếm xe" +
                    "\n 3. Quay lại");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case DRONE:
                    System.out.println("Tìm kiếm drone");
                    System.out.println("Nhập số hiệu drone muốn tìm kiếm");
                    String soHieuDrone = scanner.nextLine();
                    this.droneService.search(soHieuDrone);
                    break;
                case XE:
                    System.out.println("Tìm kiếm xe");
                    System.out.println("Nhập số hiệu drone muốn tìm kiếm");
                    String soHieuXe = scanner.nextLine();
                    this.xeService.search(soHieuXe);
                    break;
                default:
                    flag = false;
            }
        }
    }
}
