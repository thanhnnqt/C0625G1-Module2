package bai_tap_lam_them.repository;

import bai_tap_lam_them.entity.Drone;
import bai_tap_lam_them.ulti.ReadAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DroneRepository implements IDroneRepository {
    public static final String DRONE = "src/bai_tap_lam_them/data/drone.csv";

    @Override
    public List<Drone> findAll() {
        List<Drone> droneList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(DRONE);
            String[] arrayDrone = null;
            for (String line : stringList) {
                arrayDrone = line.split(",");
                Drone drone = new Drone(arrayDrone[0], arrayDrone[1], Integer.parseInt(arrayDrone[2]), arrayDrone[3], arrayDrone[4]);
                droneList.add(drone);
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file");
        }
        return droneList;
    }

    @Override
    public boolean add(Drone drone) {
        List<String> stringList = new ArrayList<>();
        stringList.add(drone.getInfoToCSV());
        try {
            ReadAndWriteFile.writeFileCSV(DRONE, stringList, true);
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(String id) {
        Scanner scanner = new Scanner(System.in);
        try {
            List<Drone> droneList = findAll();
            boolean removed = false;
            for (int i = 0; i < droneList.size(); i++) {
                if (id.equals(droneList.get(i).getSoHieuDangKy())) {
                    System.out.println("Bạn có chắc chắn xóa " + droneList.get(i).getSoHieuDangKy() + " không (1 - xóa / 2 - không)");
                    final int YES = 1;
                    final int NO = 2;
                    int choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case YES:
                            droneList.remove(i);
                            System.out.println("Đã xóa drone có số hiệu: " + droneList.get(i).getSoHieuDangKy());
                            removed = true;
                            break;
                        case NO:
                            break;
                    }
                    break;
                }
            }
            if (removed) {
                List<String> stringList = new ArrayList<>();
                for (Drone drone : droneList) {
                    stringList.add(drone.getInfoToCSV());
                }
                ReadAndWriteFile.writeFileCSV(DRONE, stringList, false);
            }
            return removed;
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
            return false;
        }
    }

    @Override
    public boolean search(String id) {
        List<Drone> droneList = findAll();
        try {
            for (Drone drone : droneList) {
                if (id.equals(drone.getSoHieuDangKy())) {
                    System.out.println(drone);
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println("Lỗi đọc file");
        }
        return false;
    }
}
