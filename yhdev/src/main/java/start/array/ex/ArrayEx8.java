package start.array.ex;

import java.util.Scanner;

/**
 * 문제8: 2차원 배열2
 * 1) 학생수를 입력받도록 개선
 */
public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생수를 입력하세요:");
        int studentCount = scanner.nextInt();
        String[] subjects = {"국어", "영어", "수학"};
        int[][] scores = new int[studentCount][subjects.length];

        for (int row = 0; row < scores.length; row++) {
            System.out.println((row + 1) + "번 학생의 성적을 입력하세요:");
            for (int column = 0; column < scores[row].length; column++) {
                System.out.print(subjects[column] + " 점수:");
                scores[row][column] = scanner.nextInt();
            }
        }

        for (int row = 0; row < scores.length; row++) {
            int total = 0;
            for (int column = 0; column < scores[row].length; column++) {
                total += scores[row][column];
            }
            double average = (double) total / scores[row].length;
            System.out.println((row + 1) + "번 학생의 총점: " + total + ", 평균: " + average);
        }
    }
}
