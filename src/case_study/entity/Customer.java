package case_study.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Customer extends Person {
    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private String idCustomer;
    private String rank;

    public Customer() {
    }

    public Customer(String name, String phoneNumber, LocalDate date, String id, String address, String gender, String email, String idCustomer, String rank) {
        super(name, phoneNumber, date, id, address, gender, email);
        this.idCustomer = idCustomer;
        this.rank = rank;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return getName() + ", " + getPhoneNumber() + ", " + getDate().format(timeFormatter) + ", " + getId() + ", " + getAddress() + ", " +
                getGender() + ", " + getEmail() + ", " + idCustomer + ", " + rank;
    }

    public String getInfoToCSV() {
        return getName() + "," + getPhoneNumber() + "," + getDate().format(timeFormatter) + "," + getId()
                + "," + getAddress() + "," + getGender() + "," + getEmail() + "," + rank + "," + idCustomer;
    }
}
