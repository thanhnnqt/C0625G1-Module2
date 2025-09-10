package bai_tap_lam_them.repository;

import bai_tap_lam_them.entity.Drone;
import bai_tap_lam_them.entity.Xe;
import bai_tap_lam_them.ulti.ReadAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeRepository implements IXeRepository{
    private static final String XE = "src/bai_tap_lam_them/data/xe.csv";
    @Override
    public List<Xe> findAll() {
        List<Xe> xeList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(XE);
            String[] array = null;
            for (String line : stringList) {
                array = line.split(",");
                Xe xe = new Xe(array[0], array[1], Integer.parseInt(array[2]), array[3], Integer.parseInt(array[4]));
                xeList.add(xe);
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file");
        }
        return xeList;
    }

    @Override
    public boolean add(Xe xe) {
        List<String> stringList = new ArrayList<>();
        stringList.add(xe.getInfoToCSV());
        try {
            ReadAndWriteFile.writeFileCSV(XE, stringList, true);
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
            List<Xe> xeList = findAll();
            boolean removed = false;
            for (int i = 0; i < xeList.size(); i++) {
                if (id.equals(xeList.get(i).getSoHieuDangKy())) {
                    System.out.println("Bạn có chắc chắn xóa " + xeList.get(i).getSoHieuDangKy() + " không (1 - xóa / 2 - không)");
                    final int YES = 1;
                    final int NO = 2;
                    int choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case YES:
                            xeList.remove(i);
                            System.out.println("Đã xóa xe có số hiệu: " + xeList.get(i).getSoHieuDangKy());
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
                for (Xe xe : xeList) {
                    stringList.add(xe.getInfoToCSV());
                }
                ReadAndWriteFile.writeFileCSV(XE, stringList, false);
            }
            return removed;
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
            return false;
        }
    }

    @Override
    public boolean search(String id) {
        List<Xe> xeList = findAll();
        try {
            for (Xe xe : xeList) {
                if (id.equals(xe.getSoHieuDangKy())) {
                    System.out.println(xe);
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println("Lỗi đọc file");
        }
        return false;
    }
}
