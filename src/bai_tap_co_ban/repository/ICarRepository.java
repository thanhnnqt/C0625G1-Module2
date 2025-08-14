package bai_tap_co_ban.repository;

import bai_tap_co_ban.entity.Car;

import java.util.ArrayList;

public interface ICarRepository {
    ArrayList<Car> findAll();
    boolean add(Car car);
    boolean delete(int bienKiemSoat);
}
