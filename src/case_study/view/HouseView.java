package case_study.view;

import case_study.entity.House;
import case_study.util.InputException;
import case_study.util.Validate;

import java.util.List;
import java.util.Scanner;

public class HouseView {
    static Scanner scanner = new Scanner(System.in);

    public static void display(List<House> houseList) {
        for (House house : houseList) {
            System.out.println(house);
        }
    }

    public static House inputData() {
        String idService;
        String name;
        while (true) {
            System.out.println("Enter id service");
            idService = scanner.nextLine();
            try {
                Validate.ValidateIdService(idService);
                break;
            } catch (InputException e) {
                System.out.println("-----Id service error-----");
            }
        }
        while (true) {
            System.out.println("Enter name service");
            name = scanner.nextLine();
            try {
                Validate.ValidateNameService(name);
                break;
            } catch (Exception e) {
                System.out.println("-----Name service error-----");
            }
        }

        System.out.println("Enter area room");
        int areaRoom = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter price");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter number customer");
        int numberCustomer = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter standard");
        String standard = scanner.nextLine();
        System.out.println("Enter number floor");
        int numberFloor = Integer.parseInt(scanner.nextLine());

        House house = new House(idService, name, areaRoom, price, numberCustomer, standard, numberFloor);
        return house;
    }
    public static House editData(String idEdit) {
        String name;
        while (true) {
            System.out.println("Enter name");
            name = scanner.nextLine();
            try {
                Validate.ValidateNameService(name);
                break;
            } catch (Exception e) {
                System.out.println("-----Name error-----");
            }
        }
        System.out.println("Enter area room");
        int areaRoom = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter price");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter number customer");
        int numberCustomer = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter standard");
        String standard = scanner.nextLine();
        System.out.println("Enter number floor");
        int numberFloor = Integer.parseInt(scanner.nextLine());

        House house = new House(idEdit, name, areaRoom, price, numberCustomer, standard, numberFloor);
        return house;
    }
}
