package bai_tap_lam_them.repository;

import bai_tap_lam_them.entity.HangSanXuat;
import bai_tap_lam_them.ulti.ReadAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HangSanXuatRepository implements IHangSanXuatRepository{
    private final String HANGSANXUAT = "src/bai_tap_lam_them/data/hangsanxuat.csv";
    @Override
    public List findAll() {
        List<HangSanXuat> hangSanXuatList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(HANGSANXUAT);
            String[] array = null;
            for (String line : stringList) {
                array = line.split(",");
                HangSanXuat hangSanXuat = new HangSanXuat(array[0], array[1], array[2]);
                hangSanXuatList.add(hangSanXuat);
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file");
        }
        return hangSanXuatList;
    }
}
