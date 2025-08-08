package mid2.collection.list.test.ex1;

/**
 * 문제1: 배열을 리스트로 변경하기
 * 1) 배열이 아닌 리스트를 사용하는 listEx1 클래스 선언
 */
public class ArrayEx1 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};

        int total = 0;
        for (int i = 0; i < students.length; i++) {
            total += students[i];
        }

        double average = (double) total / students.length;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
