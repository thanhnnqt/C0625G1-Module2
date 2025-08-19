package ss12_map_set_tree.arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Product product1 = new Product(1, "Thịt Gà", 100000);
        Product product2 = new Product(2, "Thịt Vịt", 80000);
        Product product3 = new Product(3, "Thịt Lợn", 120000);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
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
                    
                     1. Danh sách phương tiện\
                    
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
                    for (Product product : productList) {
                        System.out.println(product);
                    }
                    break;
                case ADD:
                    System.out.println("----Đây là chức năng thêm mới----");
                    System.out.println("Nhập id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập tên sản phẩm: ");
                    String name = scanner.nextLine();
                    System.out.println("Nhập giá sản phẩm: ");
                    int price = Integer.parseInt(scanner.nextLine());
                    Product product = new Product(id, name, price);
                    productList.add(product);
                    System.out.println("Thêm mới thành công");
                    break;
                case DELETE:
                    System.out.println("----Đây là chức năng xoá----");
                    System.out.println("Nhập id sản phẩm");
                    int idDel = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < productList.size(); i++) {
                        if (idDel == productList.get(i).getId()) {
                            productList.remove(i);
                            break;
                        }
                    }
                    System.out.println("Đã xóa sản phẩm này");
                    break;
                case SEARCH:
                    System.out.println("----Đây là chức năng tìm kiếm----");
                    System.out.println("Nhập id sản phẩm cần tìm kiếm");
                    int idSearch = Integer.parseInt(scanner.nextLine());
                    for (Product value : productList) {
                        if (idSearch == value.getId()) {
                            System.out.println("Sản phẩm đang tìm là: ");
                            System.out.println(value);
                            break;
                        }
                    }
                    break;
                case EDIT:
                    System.out.println("----Đây là chức năng sửa sản phẩm----");
                    System.out.println("Nhập id sản phẩm");
                    int idEdit = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < productList.size(); i++) {
                        if (idEdit == productList.get(i).getId()) {
                            System.out.println("Nhập tên sản phẩm: ");
                            String nameEdit = scanner.nextLine();
                            System.out.println("Nhập giá sản phẩm: ");
                            int priceEdit = Integer.parseInt(scanner.nextLine());
                            Product productEdit = new Product(idEdit, nameEdit, priceEdit);
                            productList.set(i, productEdit);
                            break;
                        }
                    }
                    System.out.println("Đã sửa thành công");
                    break;
                case SORTAB:
                    System.out.println("----Đây là chức năng sắp xếp----");
                    productList.sort(new SortAB());
                    for (Product productSort : productList) {
                        System.out.println(productSort);
                    }
                    break;
                case SORTBA:
                    System.out.println("----Đây là chức năng sắp xếp----");
                    productList.sort(new SortBA());
                    for (Product productSort : productList) {
                        System.out.println(productSort);
                    }
                    break;
                default:
                    flag = false;
            }
        }
    }
}
