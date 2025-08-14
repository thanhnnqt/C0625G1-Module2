package bai_tap_co_ban.view;

import bai_tap_co_ban.entity.Truck;

import java.util.ArrayList;
import java.util.Scanner;

public class TruckView {
    private static Scanner scanner = new Scanner(System.in);

    public static void display(ArrayList<Truck> truckList) {
        for (Truck truck : truckList) {
            System.out.println(truck);
        }
    }

    public static Truck inputData() {
        System.out.println("Nhập biển số");
        int bienSo = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập hãng sản xuất");
        String hangSX = scanner.nextLine();
        System.out.println("Nhập năm sản xuất");
        int namSX = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên chủ sở hữu");
        String chuSH = scanner.nextLine();
        System.out.println("Nhập tải trọng");
        int taiTrong = Integer.parseInt(scanner.nextLine());
        Truck truck = new Truck(bienSo, hangSX, namSX, chuSH, taiTrong);
        return truck;
    }
}
