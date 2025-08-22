package ss17_binary_serialization.bai_1.arraylist_linkedlist.view;

import ss17_binary_serialization.bai_1.arraylist_linkedlist.entity.SanPham;

import java.util.ArrayList;
import java.util.Scanner;

public class SanPhamView {
    private static Scanner scanner = new Scanner(System.in);
    public static void display(ArrayList<SanPham> sanPhamList){
        for (SanPham sanPham : sanPhamList) {
            System.out.println(sanPham);
        }
    }
    public static SanPham inputData() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        int price = Integer.parseInt(scanner.nextLine());
        SanPham sanPham = new SanPham(id, name, price);
        return sanPham;
    }
    public static SanPham editData(int id) {
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        int price = Integer.parseInt(scanner.nextLine());
        SanPham sanPhamEdit = new SanPham(id, name, price);
        return sanPhamEdit;
    }
}
