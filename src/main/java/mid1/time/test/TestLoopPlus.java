package mid1.time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * // TODO: 2025-05-29
 * 문제2: 날짜 간격 반복 출력하기
 * 1) 2024년 1월 1일 부터 2주 간격으로 5번 반복하여 날짜를 출력
 */
public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        for (int i = 0; i < 5; i++) {
            LocalDate nextDate = startDate.plus(2 * i, ChronoUnit.WEEKS);
            System.out.println("날짜 " + (i + 1) + ": " + nextDate);
        }
    }
}
