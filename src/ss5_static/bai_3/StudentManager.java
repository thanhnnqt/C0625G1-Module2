package ss5_static.bai_3;

import java.util.Scanner;

public class StudentManager {
    private static Student[] studentlist = new Student[100];

    static {
        Student student1 = new Student(01, "NN Thành");
        Student student2 = new Student(02, "NN Thới");
        Student student3 = new Student(03, "NDT An");
        Student student4 = new Student(04, "DQ Huy");
        Student student5 = new Student(05, "LG Nghiêm");
        studentlist[0] = student1;
        studentlist[1] = student2;
        studentlist[2] = student3;
        studentlist[3] = student4;
        studentlist[4] = student5;
    }

    public Student[] displayAll() {
        int count = 0;
        for (int i = 0; i < studentlist.length; i++) {
            if (studentlist[i] != null) {
                count++;
            } else {
                break;
            }
        }
        Student[] students = new Student[count];
        for (int i = 0; i < studentlist.length; i++) {
            if (studentlist[i] != null) {
                students[i] = studentlist[i];
            } else {
                break;
            }
        }
        return students;
    }

    public void add(Student student) {
        for (int i = 0; i < studentlist.length; i++) {
            if (studentlist[i] == null) {
                studentlist[i] = student;
                break;
            }
        }
    }

    public Student[] del() {
        Student[] newList;
        Scanner scanner = new Scanner(System.in);
        int idDel = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < studentlist.length; i++) {
            if (studentlist[i] != null && studentlist[i].getId() == idDel) {
                for (int j = i; j < studentlist.length - 1; j++) {
                    studentlist[i] = studentlist[i + 1];
                }
                newList = this.displayAll();
                if (newList.length > 1 && newList[newList.length - 1] == newList[newList.length - 2]) {
                    newList[newList.length - 1] = null;
                }
                return newList;
            }
        }
        return null;
    }

    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id sinh viên");
        int idEdit = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < studentlist.length; i++) {
            if (studentlist[i] != null & studentlist[i].getId() == idEdit) {
                System.out.println("Nhập id sinh viên mới");
                int newId = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập tên sinh viên mới");
                String name = scanner.nextLine();
                studentlist[i] = new Student(newId, name);
                System.out.println("Thêm thành công");
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không tồn tại id sinh viên");
        }
    }
    public Student search() {
        System.out.println("Nhập id để tìm sinh viên");
        Scanner scanner = new Scanner(System.in);
        int idSearch = Integer.parseInt(scanner.nextLine());
        for (Student student : studentlist) {
            if (student != null && student.getId() == idSearch) {
                return student;
            }
        }
        return null;
    }
}
