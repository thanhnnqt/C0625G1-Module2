package case_study.repository;

import case_study.entity.Facility;
import case_study.entity.House;
import case_study.entity.Room;
import case_study.entity.Villa;
import case_study.util.ReadAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FacilityRepository implements IFacilityRepository {
    public static final String FACILITY = "src/case_study/data/facility.csv";

    @Override
    public List<Facility> findAll() {
        List<Facility> facilityList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(FACILITY);
            String[] array = null;
            for (String line : stringList) {
                array = line.split(",");
                String id = array[0];
                if (id.startsWith("SVVL")) {
                    Villa villa = new Villa(array[0], array[1], Integer.parseInt(array[2]), Integer.parseInt(array[3]), Integer.parseInt(array[4]), array[5], Integer.parseInt(array[6]), Integer.parseInt(array[7]));
                    facilityList.add(villa);
                } else if (id.startsWith("SVHO")) {
                    House house = new House(array[0], array[1], Integer.parseInt(array[2]), Integer.parseInt(array[3]), Integer.parseInt(array[4]), array[5], Integer.parseInt(array[6]));
                    facilityList.add(house);
                } else {
                    Room room = new Room(array[0], array[1], Integer.parseInt(array[2]), Integer.parseInt(array[3]), Integer.parseInt(array[4]), array[5]);
                    facilityList.add(room);
                }
            }
        } catch (IOException e) {
            System.out.println("error reading file");
        }
        return facilityList;
    }

    @Override
    public boolean add(Facility facility) {
        return true;
    }

    @Override
    public boolean edit(String id, Facility facility) {
        return false;
    }
}
