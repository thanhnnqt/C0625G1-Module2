package case_study.entity;

import java.time.LocalDate;

public class House extends Facility{
    private String standard;
    private int numberFloor;

    public House(String idService, String name, int areaRoom, int price, int numberCustomer, String standard, int numberFloor) {
        super(idService, name, areaRoom, price, numberCustomer);
        this.standard = standard;
        this.numberFloor = numberFloor;
    }

    public House() {
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return "Id service: " + getIdService() + ", " + "House name: " + getName() + ", " + "Area house: " + getAreaRoom() + ", "
                + "Price: " + getPrice() + ", " + "Number customer: " + getNumberCustomer() + ", " + "Standard: " + standard + ", " + "Number floor: " + numberFloor;
    }

    public String getInfoToCSV() {
        return getIdService() + "," + getName() + "," + getAreaRoom() + "," + getPrice() + "," + getNumberCustomer() + "," + standard + "," + numberFloor;
    }
}
