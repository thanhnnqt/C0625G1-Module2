package ss5_static.bai_3;

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

    public void del(int idd) {
        for (int i = 0; i < studentlist.length; i++) {
            if (studentlist[i].getId() == idd) {
                studentlist[i] = studentlist[i + 1];
            }
        }
    }
}
