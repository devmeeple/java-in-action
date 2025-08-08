package basic.class1;

/**
 * 문제: 학생 정보 출력 프로그램 - 변수
 * 1) 첫 번째 학생
 *  - 이름: 학생1
 *  - 나이: 15
 *  - 성적: 90
 * 2) 두 번째 학생
 *  - 이름: 학생2
 *  - 나이: 16
 *  - 성적: 80
 * 3) 출력: 이름: [이름] 나이: [나이] 성적: [성적]
 */
public class ClassStart1 {
    public static void main(String[] args) {
        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int student2Age = 16;
        int student2Grade = 80;

        System.out.println("이름:" + student1Name + " 나이:" + student1Age + " 성적:" + student1Grade);
        System.out.println("이름:" + student2Name + " 나이:" + student2Age  + " 성적:" + student2Grade);
    }
}
