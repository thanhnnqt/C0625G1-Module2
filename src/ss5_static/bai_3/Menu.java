package ss5_static.bai_3;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    private StudentManager studentManager = new StudentManager();
    final static int DISPLAY = 1;
    final static int ADD = 2;
    final static int EDIT = 3;
    final static int DEL = 4;
    final static int SEARCH = 5;

    public void displayMenu() {
        boolean check = true;
        while (check) {
            System.out.println("-----Quản lý sinh viên-----" +
                    "\n 1. Hiển thị danh sách sinh viên" +
                    "\n 2. Thêm sinh viên vào danh sách" +
                    "\n 3. Sửa danh sách sinh viên" +
                    "\n 4. Xóa sinh viên khỏi danh sách" +
                    "\n 5. Tìm kiếm sinh viên trong danh sách" +
                    "\n 6. Thoát danh sách");
            Scanner scanner = new Scanner(System.in);
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case DISPLAY:
                    System.out.println("Danh sách sinh viên: ");
                    Student[] students = this.studentManager.displayAll();
                    for (int i = 0; i < students.length; i++) {
                        System.out.println(students[i]);
                    }
                    break;
                case ADD:
                    System.out.println("Thêm sinh viên");
                    System.out.println("Nhập id");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập tên");
                    String name = scanner.nextLine();
                    Student student = new Student(id, name);
                    studentManager.add(student);
                    System.out.println("Đã thêm mới");
                    break;
                case EDIT:
                    System.out.println("Sửa danh sách");
                    System.out.println("Nhập id");
                    int idd = Integer.parseInt(scanner.nextLine());
                    studentManager.del(idd);
                    System.out.println("Đã xóa");
                    break;
                case DEL:
                    System.out.println("Xóa sinh viên");
                    break;
                case SEARCH:
                    System.out.println("Tìm sinh viên");
                    break;
                default:
                    check = false;
            }
        }
    }
}
