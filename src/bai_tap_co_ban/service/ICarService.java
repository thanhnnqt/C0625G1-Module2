package bai_tap_co_ban.service;

import bai_tap_co_ban.entity.Car;

import java.util.ArrayList;
import java.util.List;

public interface ICarService {
    List<Car> findAll();
    boolean add(Car car);
    boolean delete(int bienKiemSoat);
    Car search(int bienKiemSoat);
    boolean edit(int index, Car car);
}
