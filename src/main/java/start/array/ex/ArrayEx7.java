package start.array.ex;

import java.util.Scanner;

/**
 * 문제7: 2차원 배열1
 * 1) 학생 4명의 국어, 수학, 영어 점수를 입력받아 총점과 평균을 계산
 * - 2차원 배열 사용
 */
public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] scores = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};

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
