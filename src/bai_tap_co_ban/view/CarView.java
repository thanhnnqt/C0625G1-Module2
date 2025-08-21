package bai_tap_co_ban.view;

import bai_tap_co_ban.entity.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarView {
    private static Scanner scanner = new Scanner(System.in);
    public static void display(List<Car> carList) {
        for (Car car : carList) {
            System.out.println(car);
        }
    }
    public static Car inputData(){
        System.out.println("Nhập biển số");
        int bienSo = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập hãng sản xuất");
        String hangSX = scanner.nextLine();
        System.out.println("Nhập năm sản xuất");
        int namSX = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên chủ sở hữu");
        String chuSH = scanner.nextLine();
        System.out.println("Nhập số chỗ ngồi");
        int soChoNgoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu xe");
        String kieuXe = scanner.nextLine();
        Car car = new Car(bienSo, hangSX, namSX, chuSH,soChoNgoi, kieuXe);
        return car;
    }
    public static Car editData(int bienSo){
        System.out.println("Nhập hãng sản xuất");
        String hangSX = scanner.nextLine();
        System.out.println("Nhập năm sản xuất");
        int namSX = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên chủ sở hữu");
        String chuSH = scanner.nextLine();
        System.out.println("Nhập số chỗ ngồi");
        int soChoNgoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu xe");
        String kieuXe = scanner.nextLine();
        Car carEdit = new Car(bienSo, hangSX, namSX, chuSH,soChoNgoi, kieuXe);
        return carEdit;
    }
}
