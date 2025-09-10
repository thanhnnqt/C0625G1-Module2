package bai_tap_lam_them.view;

import bai_tap_lam_them.entity.Drone;
import bai_tap_lam_them.ulti.Validate;

import java.util.List;
import java.util.Scanner;

public class DroneView {
    static Scanner scanner = new Scanner(System.in);
    public static void display(List<Drone> droneList) {
        for (Drone drone : droneList) {
            System.out.println(drone);
        }
    }

    public static Drone input() {
        String soHieuDangKy;
        String hangCheTao;
        int namSanXuat;
        String nguoiDieuPhoi;
        String tamBay;
        while (true) {
            System.out.println("Nhập số hiệu đăng ký (DRN-XXXX)");
            soHieuDangKy = scanner.nextLine();
            try {
                Validate.ValidateName(soHieuDangKy);
                break;
            } catch (Exception e) {
                System.out.println("Số hiệu đăng ký không đúng định dạng");
            }
        }
        while (true) {
            System.out.println("Nhập hãng chế tạo (HCT-XXXX)");
            hangCheTao = scanner.nextLine();
            try {
                Validate.ValidateId(hangCheTao);
                break;
            } catch (Exception e) {
                System.out.println("Hãng chế tạo không đúng định dạng");
            }
        }
        while (true) {
            System.out.println("Nhập năm sản xuất");
            namSanXuat = Integer.parseInt(scanner.nextLine());
            try {
//                Validate.validateNamSX(namSanXuat);
                break;
            } catch (Exception e) {
                System.out.println("Năm sản xuất không đúng");
            }
        }
        while (true) {
            System.out.println("Nhập tên người điều phối");
            nguoiDieuPhoi = scanner.nextLine();
            try {
//                Validate.ValidateNguoiDP(nguoiDieuPhoi);
                break;
            } catch (Exception e) {
                System.out.println("Tên người điều phối không đúng định dạng");
            }
        }
        while (true) {
            System.out.println("Nhập tầm bay");
            tamBay = scanner.nextLine();
            try {
//                Validate.validateTamBay(tamBay);
                break;
            } catch (Exception e) {
                System.out.println("Tầm bay không đúng định dạng");
            }
        }
        Drone drone = new Drone(soHieuDangKy, hangCheTao, namSanXuat, nguoiDieuPhoi, tamBay);
        return drone;
    }
}
