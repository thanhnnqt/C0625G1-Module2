package bai_tap_on_thi.view;

import bai_tap_on_thi.entity.CauHoi;
import bai_tap_on_thi.ulti.Validate;

import java.util.List;
import java.util.Scanner;

public class CauHoiView {
    static Scanner scanner = new Scanner(System.in);

    public static void display(List<CauHoi> cauHoiList) {
        for (CauHoi cauHoi : cauHoiList) {
            System.out.println(cauHoi);
        }
    }
    public static CauHoi inputCauHoi() {
        String maCauHoi;
        String noiDungCauHoi;

        while (true) {
            System.out.println("Nhập mã câu hỏi (CHXXX)");
            maCauHoi = scanner.nextLine();
            try {
                Validate.ValidateMaCauHoi(maCauHoi);
                break;
            } catch (Exception e) {
                System.out.println("Mã câu hỏi không đúng định dạng");
            }
        }
        while (true) {
            System.out.println("Nhập nội dung câu hỏi");
            noiDungCauHoi = scanner.nextLine();
            try {
                Validate.ValidateNoiDungCauHoi(noiDungCauHoi);
                break;
            } catch (Exception e) {
                System.out.println("Nội dung câu hỏi không đúng định dạng");
            }
        }

        CauHoi cauHoi = new CauHoi(maCauHoi, noiDungCauHoi);
        return cauHoi;
    }
    public static void display(CauHoi cauHoi) {
        cauHoi.display();
    }
}
