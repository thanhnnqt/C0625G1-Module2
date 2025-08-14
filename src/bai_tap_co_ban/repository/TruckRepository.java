package bai_tap_co_ban.repository;

import bai_tap_co_ban.entity.Truck;

import java.util.ArrayList;

public class TruckRepository implements ITruckRepository {
    private static ArrayList<Truck> truckList = new ArrayList<>();

    static {
        Truck truck1 = new Truck(123456, "Honda", 1996, "Thanh1", 50);
        Truck truck2 = new Truck(234567, "Yamaha", 2001, "Thanh2", 100);
        Truck truck3 = new Truck(345678, "HuyenDai", 2000, "Thanh3", 70);
        truckList.add(truck1);
        truckList.add(truck2);
        truckList.add(truck3);
    }

    @Override
    public ArrayList<Truck> findAll() {
        return truckList;
    }

    @Override
    public boolean add(Truck truck) {
        truckList.add(truck);
        return true;
    }

    @Override
    public boolean delete(int bienKiemSoat) {
        for (Truck truck : truckList) {
            if (truck.getBienKiemSoat() == bienKiemSoat) {
                truckList.remove(truck);
                return true;
            }
        }
        return false;
    }
}
