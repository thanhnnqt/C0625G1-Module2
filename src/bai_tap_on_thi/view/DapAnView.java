package bai_tap_on_thi.view;

import bai_tap_on_thi.entity.DapAn;
import bai_tap_on_thi.ulti.Validate;

import java.util.List;
import java.util.Scanner;

public class DapAnView {
    static Scanner scanner = new Scanner(System.in);

    public static void display(List<DapAn> dapAnList) {
        for (DapAn dapAn : dapAnList) {
            System.out.println(dapAn);
        }
    }

    public static DapAn inputDapAn(String maCauHoi) {
        String maDapAn;
        String noiDungDapAn;
        while (true) {
            System.out.println("Nhập mã đáp án (DAXXX)");
            maDapAn = scanner.nextLine();
            try {
                Validate.ValidateMaDapAn(maDapAn);
                break;
            } catch (Exception e) {
                System.out.println("Mã đáp án không đúng định dạng");
            }
        }
        while (true) {
            System.out.println("Nhập nội dung đáp án");
            noiDungDapAn = scanner.nextLine();
            try {
                Validate.ValidateNoiDungCauHoi(noiDungDapAn);
                break;
            } catch (Exception e) {
                System.out.println("Nội dung đáp án không đúng định dạng");
            }
        }

        DapAn dapAn = new DapAn(maCauHoi, maDapAn, noiDungDapAn);
        return dapAn;
    }

    public static void display(DapAn dapAn) {
        dapAn.display();
    }
}
