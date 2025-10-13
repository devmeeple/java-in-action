package ch08.ex;

public class ManageStudent {
    public static void main(String[] args) {
        ManageStudent manager = new ManageStudent();
        Student[] students;

        students = manager.addStudent();
        manager.printStudents(students);
    }

    public Student[] addStudent() {
        Student[] students = new Student[3];
        students[0] = new Student("Lim");
        students[1] = new Student("Min");
        students[2] = new Student("Sook", "Seoul", "010XXXXYYYY", "ask@godofjava.com");
        return students;
    }

    public void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
