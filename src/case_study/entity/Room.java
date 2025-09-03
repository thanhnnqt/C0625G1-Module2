package case_study.entity;

import java.time.LocalDate;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String idService, String name, int areaRoom, int price, int numberCustomer, String freeService) {
        super(idService, name, areaRoom, price, numberCustomer);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return getIdService() + ", " + getName() + ", " + getAreaRoom() + ", " + getPrice() + ", " + getNumberCustomer() + ", " + freeService;
    }

    public String getInfoToCSV() {
        return getIdService() + "," + getName() + "," + getAreaRoom() + "," + getPrice() + "," + getNumberCustomer() + "," + freeService;
    }
}
