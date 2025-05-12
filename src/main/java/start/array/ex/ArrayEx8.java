package start.array.ex;

import java.util.Scanner;

/**
 * 문제2: 2차원 배열2
 * 1) 사용자로부터 학생 n명의 국어, 수학, 영어 점수 입력받기
 * 2) 각 학생의 총점과 평균 계산
 */
public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생수를 입력하세요:");
        int studentCount = scanner.nextInt();

        int[][] scores = new int[studentCount][3];
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
            System.out.println(row + 1 + "번 학생의 총점: " +  total + ", 평균: " + average);
        }
    }
}
