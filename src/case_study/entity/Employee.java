package case_study.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee extends Person {
    private String idEmployee;
    private int salary;
    private String level;
    private String location;
    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Employee() {
    }

    public Employee(String name, String phoneNumber, LocalDate date, String id, String address, String gender, String idEmployee, int salary, String level, String location, String email) {
        super(name, phoneNumber, date, id, address, gender, email);
        this.idEmployee = idEmployee;
        this.salary = salary;
        this.level = level;
        this.location = location;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee name: " + getName() + ", " + "Phone number: " + getPhoneNumber() + ", " + "Date of birth: " + getDate().format(timeFormatter)
                + ", " + "Id card: " + getId() + ", " + "Address: " + getAddress() + ", " + "Gender: " + getGender() + ", " +
                "Id employee: " + idEmployee + ", " + "Salary: " + salary + ", " + "Level: " + level + ", " + "Location: " + location + ", " + "Email: " + getEmail();
    }

    public String getInfoToCSV() {
        return getName() + "," + getPhoneNumber() + "," + getDate().format(timeFormatter) + "," + getId() + "," + getAddress() + "," + getGender() + "," +
                idEmployee + "," + salary + "," + level + "," + location + "," + getEmail();
    }
}
