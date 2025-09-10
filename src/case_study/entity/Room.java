package case_study.entity;


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
        return "Id service: " + getIdService() + ", " + "Room name: " + getName() + ", " + "Area room: " + getAreaRoom()
                + ", " + "Price: " + getPrice() + ", " + "Number customer: " + getNumberCustomer() + ", " + "Free service: " + freeService;
    }

    public String getInfoToCSV() {
        return getIdService() + "," + getName() + "," + getAreaRoom() + "," + getPrice() + "," + getNumberCustomer() + "," + freeService;
    }
}
