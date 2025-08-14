package bai_tap_co_ban.service;

import bai_tap_co_ban.entity.Truck;
import bai_tap_co_ban.repository.TruckRepository;

import java.util.ArrayList;

public class TruckService implements ITruckService {
    TruckRepository truckRepository = new TruckRepository();

    @Override
    public ArrayList<Truck> findAll() {
        return truckRepository.findAll();
    }

    @Override
    public boolean add(Truck truck) {
        return truckRepository.add(truck);
    }
}
