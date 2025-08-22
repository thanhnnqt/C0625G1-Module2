package ss17_binary_serialization.bai_1.arraylist_linkedlist.entity;

import java.io.Serializable;

public class SanPham implements Serializable {
    private int id;
    private String name;
    private int price;

    public SanPham() {
    }

    public SanPham(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void main(String[] args) {
    }

    @Override
    public String toString() {
        return "id = " + getId() + "; tên sản phẩm: " + getName() + "; giá: " + getPrice() + " VND/Kg";
    }
}
