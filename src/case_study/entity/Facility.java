package case_study.entity;

import java.time.LocalDate;

public class Facility {
    private String idService;
    private String name;
    private int areaRoom;
    private int price;
    private int numberCustomer;

    public Facility() {
    }

    public Facility(String idService, String name, int areaRoom, int price, int numberCustomer) {
        this.idService = idService;
        this.name = name;
        this.areaRoom = areaRoom;
        this.price = price;
        this.numberCustomer = numberCustomer;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAreaRoom() {
        return areaRoom;
    }

    public void setAcreage(int acreage) {
        this.areaRoom = acreage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberCustomer() {
        return numberCustomer;
    }

    public void setNumberCustomer(int numberCustomer) {
        this.numberCustomer = numberCustomer;
    }

}
