package bai_tap_co_ban.repository;

import bai_tap_co_ban.entity.Truck;

import java.util.ArrayList;

public interface ITruckRepository {
    ArrayList<Truck> findAll();
    boolean add(Truck truck);
    boolean delete(int bienKiemSoat);
}
