package case_study.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Villa extends Facility {
    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private String standard;
    private int areaPool;
    private int numberFloor;

    public Villa() {
    }

    public Villa(String idService, String name, int areaRoom, int price, int numberCustomer, String standard, int areaPool, int numberFloor) {
        super(idService, name, areaRoom, price, numberCustomer);
        this.standard = standard;
        this.areaPool = areaPool;
        this.numberFloor = numberFloor;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public int getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(int areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return getIdService() + ", " + getName() + ", " + getAreaRoom() + ", " + getPrice() + ", " + getNumberCustomer() + ", " + standard + ", " + areaPool + ", " + numberFloor;
    }

    public String getInfoToCSV() {
        return getIdService() + "," + getName() + "," + getAreaRoom() + "," + getPrice() + "," + getNumberCustomer() + "," + standard + "," + areaPool + "," + numberFloor;
    }
}
