package bai_tap_co_ban.repository;

import bai_tap_co_ban.entity.Car;
import bai_tap_co_ban.util.ReadAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarRepository implements ICarRepository {
    public static final String FILE_PATH = "src/bai_tap_co_ban/data/car.csv";

    @Override
    public List<Car> findAll() {
        List<Car> carList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(FILE_PATH);
            String[] arrayCar = null;
            for (String line : stringList) {
                arrayCar = line.split(",");
                Car car = new Car(Integer.parseInt(arrayCar[0]), arrayCar[1], Integer.parseInt(arrayCar[2]), arrayCar[3], Integer.parseInt(arrayCar[4]), arrayCar[5]);
                carList.add(car);
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file");
        }
        return carList;
    }

    @Override
    public boolean add(Car car) {
        List<String> stringList = new ArrayList<>();
        stringList.add(car.getInfoToCSV());
        try {
            ReadAndWriteFile.writeFileCSV(FILE_PATH, stringList, true);
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(int bienKiemSoat) {
        try {
            List<Car> carList = findAll();
            boolean removed = false;
            for (int i = 0; i < carList.size(); i++) {
                if (bienKiemSoat == carList.get(i).getBienKiemSoat()) {
                    carList.remove(i);
                    removed = true;
                    break;
                }
            }
            if (removed) {
                List<String> stringList = new ArrayList<>();
                for (Car car : carList) {
                    stringList.add(car.getInfoToCSV());
                }
                ReadAndWriteFile.writeFileCSV(FILE_PATH, stringList, false);
            }
            return removed;
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
            return false;
        }
    }

    @Override
    public Car search(int bienKiemSoat) {
        List<Car> carList = findAll();
        try {
            for (Car car : carList) {
                if (bienKiemSoat == car.getBienKiemSoat()) {
                    return car;
                }
            }
        } catch (Exception e) {
            System.out.println("Lỗi đọc file");
        }
        return null;
    }

    @Override
    public boolean edit(int bienSo, Car ncar) {
        try {
            List<Car> carList = findAll();
            boolean editCar = false;
            for (int i = 0; i < carList.size(); i++) {
                if (bienSo == carList.get(i).getBienKiemSoat()) {
                    carList.set(i, ncar);
                    editCar = true;
                    break;
                }
            }
            if (editCar) {
                List<String> stringList = new ArrayList<>();
                for (Car car : carList) {
                    stringList.add(car.getInfoToCSV());
                }
                ReadAndWriteFile.writeFileCSV(FILE_PATH, stringList, false);
            }
            return editCar;
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
            return false;
        }
    }
}


