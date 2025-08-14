package bai_tap_co_ban.service;

import bai_tap_co_ban.entity.Car;
import bai_tap_co_ban.repository.CarRepository;
import bai_tap_co_ban.repository.ICarRepository;

import java.util.ArrayList;

public class CarService implements ICarService {
    private final ICarRepository carRepository = new CarRepository();
    @Override
    public ArrayList<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public boolean add(Car car) {
        return carRepository.add(car);
    }

    @Override
    public boolean delete(int bienKiemSoat) {
        return carRepository.delete(bienKiemSoat);
    }
    @Override
    public boolean search(int bienKiemSoat) {
        return carRepository.search(bienKiemSoat);
    }

    @Override
    public boolean edit(int index, Car car) {
        return carRepository.edit(index, car);
    }
}
