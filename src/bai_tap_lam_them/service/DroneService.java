package bai_tap_lam_them.service;

import bai_tap_lam_them.entity.Drone;
import bai_tap_lam_them.repository.DroneRepository;
import bai_tap_lam_them.repository.IDroneRepository;

import java.util.List;

public class DroneService implements IDroneService{
    private final IDroneRepository droneRepository = new DroneRepository();

    @Override
    public List<Drone> findAll() {
        return droneRepository.findAll();
    }

    @Override
    public boolean add(Drone drone) {
        return droneRepository.add(drone);
    }

    @Override
    public boolean delete(String id) {
        return droneRepository.delete(id);
    }

    @Override
    public boolean search(String id) {
        return droneRepository.search(id);
    }
}
