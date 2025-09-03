package case_study.entity;

import java.time.LocalDate;

public class Person {
    private String name;
    private String phoneNumber;
    private LocalDate date;
    private String id;
    private String address;
    private String gender;
    private String email;

    public Person() {
    }

    public Person(String name, String phoneNumber, LocalDate date, String id, String address, String gender, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.id = id;
        this.address = address;
        this.gender = gender;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
