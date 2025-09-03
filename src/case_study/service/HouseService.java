package case_study.service;

import case_study.entity.House;
import case_study.repository.HouseRepository;
import case_study.repository.IHouseRepository;

import java.util.List;

public class HouseService implements IHouseService{
    private final IHouseRepository houseRepository = new HouseRepository();
    @Override
    public List<House> findAll() {
        return houseRepository.findAll();
    }

    @Override
    public boolean add(House house) {
        return houseRepository.add(house);
    }

    @Override
    public boolean edit(String id, House house) {
        return houseRepository.edit(id, house);
    }
}
