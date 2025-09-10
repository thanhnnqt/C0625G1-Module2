package case_study.repository;

import case_study.entity.Room;
import case_study.util.ReadAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RoomRepository implements IRoomRepository {
    private static final String ROOM = "src/case_study/data/facility.csv";
    @Override
    public List<Room> findAll() {
        return List.of();
    }

    @Override
    public boolean add(Room room) {
        List<String> stringList = new ArrayList<>();
        stringList.add(room.getInfoToCSV());
        try {
            ReadAndWriteFile.writeFileCSV(ROOM, stringList, true);
        } catch (IOException e) {
            System.out.println("error reading file");
            return false;
        }
        return true;
    }

    @Override
    public boolean edit(String id, Room room) {
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
