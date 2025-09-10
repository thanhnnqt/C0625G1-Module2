package bai_tap_on_thi.repository;

import bai_tap_lam_them.ulti.ReadAndWriteFile;
import bai_tap_on_thi.entity.DapAn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DapAnRepository implements IDapAnRepository{
    public static final String DAPAN = "src/bai_tap_on_thi/data/dapAn.csv";
    @Override
    public List<DapAn> findAll() {
        List<DapAn> dapAnList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(DAPAN);
            for (String line : stringList) {
                String[] array = line.split(",", 3);
                if (array.length == 3) {
                    String maDapAn = array[0];
                    String maCauHoi = array[1];
                    String noiDung = array[2];
                    DapAn dapAn = new DapAn(maCauHoi, maDapAn, noiDung);
                    dapAnList.add(dapAn);
                }
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file đáp án: " + e.getMessage());
        }
        return dapAnList;
    }

    @Override
    public boolean add(DapAn dapAn) {
        List<String> stringList = new ArrayList<>();
        stringList.add(dapAn.getInfoToCSV());
        try {
            ReadAndWriteFile.writeFileCSV(DAPAN, stringList, true);
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public boolean search(String id) {
        return false;
    }
}
