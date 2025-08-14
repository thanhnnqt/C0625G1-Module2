package bai_tap_co_ban.service;

import bai_tap_co_ban.entity.Truck;

import java.util.ArrayList;

public interface ITruckService {
    ArrayList<Truck> findAll();
    boolean add(Truck truck);
}
