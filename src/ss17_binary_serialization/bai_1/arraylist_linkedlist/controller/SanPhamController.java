package ss17_binary_serialization.bai_1.arraylist_linkedlist.controller;

import ss17_binary_serialization.bai_1.arraylist_linkedlist.entity.SanPham;
import ss17_binary_serialization.bai_1.arraylist_linkedlist.service.ISanPhamService;
import ss17_binary_serialization.bai_1.arraylist_linkedlist.service.SanPhamService;
import ss17_binary_serialization.bai_1.arraylist_linkedlist.view.SanPhamView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SanPhamController {
    private final ISanPhamService sanPhamService = new SanPhamService();
    List<SanPham> sanPhamList = sanPhamService.findAll();

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        final int DISPLAY = 1;
        final int ADD = 2;
        final int DELETE = 3;
        final int SEARCH = 4;
        final int EDIT = 5;
        final int SORTAB = 6;
        final int SORTBA = 7;
        boolean flag = true;
        while (flag) {
            System.out.println("Quản lý sản phẩm");
            System.out.println("""
                    -------Chức năng------\
                    
                     1. Danh sách sản phẩm\
                    
                     2. Thêm mới\
                    
                     3. Xoá\
                    
                     4. Tìm kiếm\
                    
                     5. Sửa danh sách\
                    
                     6. Sắp xếp giá tăng dần\
                    
                     7. Sắp xếp giá giảm dần\
                    
                     8. Thoát""");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case DISPLAY:
                    System.out.println("----Đây là chức năng hiển thị----");
                    List<SanPham> sanPhams = this.sanPhamService.findAll();
                    SanPhamView.display((ArrayList<SanPham>) sanPhams);
                    break;
                case ADD:
                    System.out.println("----Đây là chức năng thêm mới----");
                    SanPham sanPham = SanPhamView.inputData();
                    this.sanPhamService.add(sanPham);
                    System.out.println("Thêm mới thành công");
                    break;
                case DELETE:
                    System.out.println("----Đây là chức năng xoá----");
                    System.out.println("Nhập id sản phẩm");
                    int id = Integer.parseInt(scanner.nextLine());
                    this.sanPhamService.delete(id);
                    System.out.println("Đã xóa sản phẩm này");
                    break;
                case SEARCH:
                    System.out.println("----Đây là chức năng tìm kiếm----");
                    System.out.println("Nhập id sản phẩm cần tìm kiếm");
                    int idSearch = Integer.parseInt(scanner.nextLine());
                    System.out.println("Sản phẩm đang tìm là");
                    this.sanPhamService.search(idSearch);
                    break;
                case EDIT:
                    System.out.println("----Đây là chức năng sửa sản phẩm----");
                    System.out.println("Nhập id sản phẩm");
                    int idEdit = Integer.parseInt(scanner.nextLine());
                    SanPham sanPhamEdit = SanPhamView.editData(idEdit);
                    this.sanPhamService.edit(idEdit, sanPhamEdit);
                    System.out.println("Đã sửa thành công");
                    break;
                case SORTAB:
                    System.out.println("----Đây là chức năng sắp xếp----");
                    List<SanPham> sanPhamList1 = ((SanPhamService)sanPhamService).sortAB();
                    for (SanPham sanPhamSort : sanPhamList1) {
                        System.out.println(sanPhamSort);
                    }
                    break;
                case SORTBA:
                    System.out.println("----Đây là chức năng sắp xếp----");
                    List<SanPham> sanPhamList2 = ((SanPhamService)sanPhamService).sortBA();
                    for (SanPham sanPhamSort : sanPhamList2) {
                        System.out.println(sanPhamSort);
                    }
                    break;
                default:
                    flag = false;
            }
        }
    }
}
