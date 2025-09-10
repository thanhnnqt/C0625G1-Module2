package case_study.repository;

import case_study.entity.Villa;
import case_study.util.ReadAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VillaRepository implements IVillaRepository{
    public static final String VILLA = "src/case_study/data/facility.csv";

    @Override
    public List findAll() {
        return List.of();
    }

    @Override
    public boolean add(Villa villa) {
        List<String> stringList = new ArrayList<>();
        stringList.add(villa.getInfoToCSV());
        try {
            ReadAndWriteFile.writeFileCSV(VILLA, stringList, true);
        } catch (IOException e) {
            System.out.println("error reading file");
            return false;
        }
        return true;
    }

    @Override
    public boolean edit(String id, Villa villa) {
        return false;
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
