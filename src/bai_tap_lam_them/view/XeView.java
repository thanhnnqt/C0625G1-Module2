package bai_tap_lam_them.view;

import bai_tap_lam_them.entity.Drone;
import bai_tap_lam_them.entity.Xe;
import bai_tap_lam_them.ulti.Validate;

import java.util.List;
import java.util.Scanner;

public class XeView {
    static Scanner scanner = new Scanner(System.in);
    public static void display(List<Xe> xeList) {
        for (Xe xe : xeList) {
            System.out.println(xe);
        }
    }
    public static Xe input() {
        String soHieuDangKy;
        String hangCheTao;
        int namSanXuat;
        String nguoiDieuPhoi;
        int chongBucXa;
        while (true) {
            System.out.println("Nhập số hiệu đăng ký (XTT-XXXX)");
            soHieuDangKy = scanner.nextLine();
            try {
//                Validate.ValidateSoHieuXe(soHieuDangKy);
                break;
            } catch (Exception e) {
                System.out.println("Số hiệu đăng ký không đúng định dạng");
            }
        }
        while (true) {
            System.out.println("Nhập hãng chế tạo (HCT-XXXX)");
            hangCheTao = scanner.nextLine();
            try {
//                Validate.validateHangCT(hangCheTao);
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
            System.out.println("Nhập số chống bức xạ");
            chongBucXa = Integer.parseInt(scanner.nextLine());
            try {
//                Validate.validateChongBucXa(chongBucXa);
                break;
            } catch (Exception e) {
                System.out.println("Số liệu chống bức xạ không đúng định dạng");
            }
        }
        Xe xe = new Xe(soHieuDangKy, hangCheTao, namSanXuat, nguoiDieuPhoi, chongBucXa);
        return xe;
    }
}
