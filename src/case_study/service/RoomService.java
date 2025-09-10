package case_study.service;

import case_study.entity.Room;
import case_study.repository.IRoomRepository;
import case_study.repository.RoomRepository;

import java.util.List;

public class RoomService implements IRoomService {
    private final IRoomRepository roomRepository = new RoomRepository();
    @Override
    public List<Room> findAll() {
        return roomRepository.findAll();
    }

    @Override
    public boolean add(Room room) {
        return roomRepository.add(room);
    }

    @Override
    public boolean edit(String id, Room room) {
        return roomRepository.edit(id, room);
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
