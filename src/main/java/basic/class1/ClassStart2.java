package basic.class1;

/**
 * 문제: 학생 정보 출력 프로그램 - 배열
 */
public class ClassStart2 {
    public static void main(String[] args) {
        String[] students = {"학생1", "학생2"};
        int[] ages = {15, 16};
        int[] grades = {90, 80};

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름:" + students[i] + " 나이:" + ages[i] + " 성적:" + grades[i]);
        }
    }
}
