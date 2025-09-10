package case_study.repository;

import case_study.entity.Customer;
import case_study.entity.House;
import case_study.util.ReadAndWriteFile;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HouseRepository implements IHouseRepository {
    private static final String HOUSE = "src/case_study/data/facility.csv";
    static DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public List<House> findAll() {
        List<House> houseList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(HOUSE);
            String[] array = null;
            for (String line : stringList) {
                array = line.split(",");
                House house = new House(array[0], array[1], Integer.parseInt(array[2]), Integer.parseInt(array[3]), Integer.parseInt(array[4]), array[7], Integer.parseInt(array[8]));
                houseList.add(house);
            }
        } catch (IOException e) {
            System.out.println("error reading file");
        }
        return houseList;
    }

    @Override
    public boolean add(House house) {
        List<String> stringList = new ArrayList<>();
        stringList.add(house.getInfoToCSV());
        try {
            ReadAndWriteFile.writeFileCSV(HOUSE, stringList, true);
        } catch (IOException e) {
            System.out.println("error reading file");
            return false;
        }
        return true;
    }

    @Override
    public boolean edit(String id, House house) {
        try {
            List<House> houseList = findAll();
            boolean editHouse = false;
            for (int i = 0; i < houseList.size(); i++) {
                if (Objects.equals(id, houseList.get(i).getIdService())) {
                    houseList.set(i, house);
                    editHouse = true;
                    break;
                }
            }
            if (editHouse) {
                List<String> stringList = new ArrayList<>();
                for (House houseEdit : houseList) {
                    stringList.add(houseEdit.getInfoToCSV());
                }
                ReadAndWriteFile.writeFileCSV(HOUSE, stringList, false);
            }
            return editHouse;
        } catch (Exception e) {
            System.out.println("Error");
            return false;
        }
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
