package ss10_java_collection_framwork;

public class TestMyArrayList {
    public static class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Student() {
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
    }

    public static void main(String[] args) {
        Student a = new Student(1, "Thành");
        Student b = new Student(2, "Thới");
        Student c = new Student(3, "Huy");
        Student d = new Student(4, "Nghiêm");
        Student e = new Student(5, "An");
        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        MyArrayList<Student> newArrayList = new MyArrayList<>();
        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e);
        studentMyArrayList.size();
        System.out.println(studentMyArrayList.size());
        for (int i = 0; i < studentMyArrayList.size(); i++) {
            Student student = (Student) studentMyArrayList.elements[i];
            System.out.println(student.getId());
            System.out.println(student.getName());
        }
        studentMyArrayList.get(2);
        System.out.println(studentMyArrayList.get(2).getName());
        System.out.println(studentMyArrayList.indexOf(d));
        System.out.println(studentMyArrayList.contains(c));
        newArrayList = studentMyArrayList.clone();
        newArrayList.remove(0);
        for (int i = 0; i < newArrayList.size(); i++) {
            System.out.println(newArrayList.get(i).getName());
        }
    }
}
