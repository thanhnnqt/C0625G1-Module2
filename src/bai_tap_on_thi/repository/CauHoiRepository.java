package bai_tap_on_thi.repository;

import bai_tap_lam_them.ulti.ReadAndWriteFile;
import bai_tap_on_thi.entity.CauHoi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CauHoiRepository implements ICauHoiRepository{
    public static final String CAUHOI = "src/bai_tap_on_thi/data/cauHoi.csv";
    @Override
    public List<CauHoi> findAll() {
        List<CauHoi> cauHoiList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(CAUHOI);
            for (String line : stringList) {
                String[] array = line.split(",", 2);
                if (array.length == 2) {
                    CauHoi cauHoi = new CauHoi(array[0], array[1]);
                    cauHoiList.add(cauHoi);
                }
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
        }
        return cauHoiList;
    }

    @Override
    public boolean add(CauHoi cauHoi) {
        List<String> stringList = new ArrayList<>();
        stringList.add(cauHoi.getInfoToCSV());
        try {
            ReadAndWriteFile.writeFileCSV(CAUHOI, stringList, true);
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(String id) {
        Scanner scanner = new Scanner(System.in);
        try {
            List<CauHoi> cauHoiList = findAll();
            boolean removed = false;
            for (int i = 0; i < cauHoiList.size(); i++) {
                if (id.equals(cauHoiList.get(i).getMaCauHoi())) {
                    System.out.println("Bạn có chắc chắn xóa " + cauHoiList.get(i).getMaCauHoi() + " không (1 - xóa / 2 - không)");
                    final int YES = 1;
                    final int NO = 2;
                    int choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case YES:
                            cauHoiList.remove(i);
                            System.out.println("Đã xóa câu có số mã: " + cauHoiList.get(i).getMaCauHoi());
                            removed = true;
                            break;
                        case NO:
                            break;
                    }
                    break;
                }
            }
            if (removed) {
                List<String> stringList = new ArrayList<>();
                for (CauHoi cauHoi : cauHoiList) {
                    stringList.add(cauHoi.getInfoToCSV());
                }
                ReadAndWriteFile.writeFileCSV(CAUHOI, stringList, false);
            }
            return removed;
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
            return false;
        }
    }

    @Override
    public boolean search(String id) {
        List<CauHoi> cauHoiList = findAll();
        try {
            for (CauHoi cauHoi : cauHoiList) {
                if (id.equals(cauHoi.getMaCauHoi())) {
                    System.out.println(cauHoi);
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println("Lỗi đọc file");
        }
        return false;
    }
}
