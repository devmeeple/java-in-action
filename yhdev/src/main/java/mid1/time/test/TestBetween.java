package mid1.time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * // TODO: 2025-05-29
 * 문제3: 디데이 구하기
 * 1) 시작 날짜와 목표 날짜를 입력하여 남은 기간과 디데이를 계산
 * 2) 출력
 * - 남은 기간: x년 x개월 x일
 * - 디데이: x일 남음
 */
public class TestBetween {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);

        Period period = Period.between(startDate, endDate);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println("시작 날짜: " + startDate);
        System.out.println("목표 날짜: " + endDate);
        System.out.println("남은 기간: " + period.getYears() + "년 " + period.getMonths() + "개월 " + period.getDays() + "일");
        System.out.println("디데이: " + daysBetween + "일 남음");
    }
}
