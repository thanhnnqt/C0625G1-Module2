package bai_tap_co_ban.service;

import bai_tap_co_ban.entity.Car;

import java.util.ArrayList;

public interface ICarService {
    ArrayList<Car> findAll();
    boolean add(Car car);
    boolean delete(int bienKiemSoat);
    boolean search(int bienKiemSoat);
    Car edit(int index, Car car);
}
