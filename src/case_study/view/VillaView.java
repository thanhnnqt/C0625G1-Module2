package case_study.view;

import case_study.entity.Villa;
import case_study.util.InputException;
import case_study.util.Validate;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class VillaView {
    static Scanner scanner = new Scanner(System.in);

    public static void display(List<Villa> villaList) {
        for (Villa villa : villaList) {
            System.out.println(villa);
        }
    }
    public static Villa inputData() {
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
        System.out.println("Enter area pool");
        int areaPool = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter number floor");
        int numberFloor = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(idService, name, areaRoom, price, numberCustomer, standard, areaPool, numberFloor);
        return villa;
    }
}
