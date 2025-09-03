package case_study.controller;

import case_study.entity.Facility;
import case_study.entity.House;
import case_study.entity.Room;
import case_study.entity.Villa;
import case_study.service.*;
import case_study.view.FacilityView;
import case_study.view.HouseView;
import case_study.view.RoomView;
import case_study.view.VillaView;

import java.util.List;
import java.util.Scanner;

public class FacilityManagementController {
    private final IFacilityService facilityService = new FacilityService();
    private final IVillaService villaService = new VillaService();
    private final IHouseService houseService = new HouseService();
    private final IRoomService roomService = new RoomService();

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        final int DISPLAY = 1;
        final int ADD = 2;
        final int EDIT = 3;
        boolean flag = true;
        while (flag) {
            System.out.println("Customer Facility");
            System.out.println("-----Menu-----" +
                    "\n 1. Display list facility" +
                    "\n 2. Add new facility" +
                    "\n 3. Display list facility maintenance" +
                    "\n 4. Return main menu");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case DISPLAY:
                    System.out.println("This is the display function");
                    List<Facility> facilityList = this.facilityService.findAll();
                    FacilityView.display(facilityList);
                    break;
                case ADD:
                    displayMenuFacility();
                    break;
                case EDIT:
                    break;
                default:
                    flag = false;
            }
        }
    }

    public void displayMenuFacility() {
        Scanner scanner = new Scanner(System.in);
        final int VILLA = 1;
        final int HOUSE = 2;
        final int ROOM = 3;
        boolean flag = true;
        while (flag) {
            System.out.println("Customer Facility");
            System.out.println("-----Menu-----" +
                    "\n 1. Add new villa" +
                    "\n 2. Add new house" +
                    "\n 3. Add new room" +
                    "\n 4. Return main menu");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case VILLA:
                    System.out.println("This is the add villa function");
                    Villa villa = VillaView.inputData();
                    this.villaService.add(villa);
                    System.out.println("Added villa");
                    break;
                case HOUSE:
                    System.out.println("This is the add villa function");
                    House house = HouseView.inputData();
                    this.houseService.add(house);
                    System.out.println("Added house");
                    break;
                case ROOM:
                    System.out.println("This is the add villa function");
                    Room room = RoomView.inputData();
                    this.roomService.add(room);
                    System.out.println("Added room");
                    break;
                default:
                    flag = false;
            }
        }
    }
}