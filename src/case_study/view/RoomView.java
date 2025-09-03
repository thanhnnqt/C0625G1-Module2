package case_study.view;

import case_study.entity.Room;
import case_study.util.InputException;
import case_study.util.Validate;

import java.util.List;
import java.util.Scanner;

public class RoomView {
    static Scanner scanner = new Scanner(System.in);

    public static void display(List<Room> roomList) {
        for (Room room : roomList) {
            System.out.println(room);
        }
    }

    public static Room inputData() {
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
        System.out.println("Enter free service");
        String freeService = scanner.nextLine();
        Room room = new Room(idService, name, areaRoom, price, numberCustomer, freeService);
        return room;
    }
}
