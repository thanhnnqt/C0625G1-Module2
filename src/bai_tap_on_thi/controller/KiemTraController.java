package bai_tap_on_thi.controller;

import bai_tap_on_thi.entity.CauHoi;
import bai_tap_on_thi.entity.DapAn;
import bai_tap_on_thi.service.CauHoiService;
import bai_tap_on_thi.service.ICauHoiService;
import bai_tap_on_thi.view.CauHoiView;
import bai_tap_on_thi.view.DapAnView;

import java.util.Scanner;

public class KiemTraController {
    private final ICauHoiService cauHoiService = new CauHoiService();

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        final int ADD = 1;
        final int DISPLAY = 2;
        boolean flag = true;
        while (flag) {
            System.out.println("-----Menu-----" +
                    "\n 1. Thêm mới câu hỏi" +
                    "\n 2. Hiển thị danh sách câu hỏi" +
                    "\n 3. Thoát");
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
                default:
                    flag = false;
            }
        }
    }

    public void displayThemMoi() {
        Scanner scanner = new Scanner(System.in);
        CauHoi cauHoi = CauHoiView.inputCauHoi();
        for (int i = 1; i <= 4; i++) {
            System.out.println("Nhập đáp án: " + i);
            DapAn dapAn = DapAnView.inputDapAn(cauHoi.getMaCauHoi());
            cauHoi.addDapAn(dapAn);
        }
        boolean flag = cauHoiService.add(cauHoi);
        if (flag) {
            System.out.println(" Thêm câu hỏi thành công!");
        } else {
            System.out.println(" Thêm câu hỏi thất bại!");
        }
    }

    public void displayHienThi() {
        System.out.println("Hiển thị danh sách câu hỏi và đáp án");
        for (CauHoi cauHoi : cauHoiService.findAll()) {
            CauHoiView.display(cauHoi);
        }
    }
}
