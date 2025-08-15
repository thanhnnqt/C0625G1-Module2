package bai_tap_co_ban.repository;

import bai_tap_co_ban.entity.Car;

import java.util.ArrayList;

public class CarRepository implements ICarRepository {
    private static ArrayList<Car> carList = new ArrayList<>();

    static {
        Car car1 = new Car(12345, "Honda", 1996, "Thanh1", 4, "Xe Con");
        Car car2 = new Car(23456, "Yamaha", 1996, "Thanh2", 5, "Xe Khach");
        Car car3 = new Car(34567, "Mec", 1996, "Thanh3", 7, "Xe Taxi");
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
    }

    @Override
    public ArrayList<Car> findAll() {
        return carList;
    }

    @Override
    public boolean add(Car car) {
        carList.add(car);
        return true;
    }

    @Override
    public boolean delete(int bienKiemSoat) {
        for (Car car : carList) {
            if (car.getBienKiemSoat() == bienKiemSoat) {
                carList.remove(car);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean search(int bienKiemSoat) {
        for (Car car : carList) {
            if (car.getBienKiemSoat() == bienKiemSoat) {
                System.out.println(car);
                return true;
            }
        }
        return false;
    }

    @Override
    public Car edit(int bienKiemSoat, Car car) {
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getBienKiemSoat() == bienKiemSoat) {
                carList.set(i, car);
                return carList.get(i);
            }
        }
        return null;
    }
}
