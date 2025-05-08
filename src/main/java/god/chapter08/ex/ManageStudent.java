package god.chapter08.ex;

/**
 * Chapter 8. 참조 자료형에 대해서더 자세히 알아봅시다
 * 학생 정보를 관리하는 프로그램
 */
public class ManageStudent {
    public static void main(String[] args) {
        Student[] students;
        ManageStudent manager = new ManageStudent();

        students = manager.addStudent();
        manager.printStudents(students);
    }

    public Student[] addStudent() {
        Student[] students = new Student[3];
        students[0] = new Student("Lim");
        students[1] = new Student("Min");
        students[2] = new Student("Sook", "Seoul", "010XXXXXXXX", "ask@godofjava.com");
        return students;
    }

    public void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
