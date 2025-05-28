package mid1.time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * // TODO: 2025-05-29
 * 문제4: 시작 요일, 마지막 요일 구하기
 * 1) 입력 받은 월의 첫날 요일과 마지막날 요일 구하기
 */
public class TestAdjusters {
    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        LocalDate date = LocalDate.of(year, month, 1);
        DayOfWeek firstDayOfWeek = date.getDayOfWeek();
        DayOfWeek lastDayOfWeek = date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();

        System.out.println("firstDayOfWeek = " + firstDayOfWeek);
        System.out.println("lastDayOfWeek = " + lastDayOfWeek);
    }
}
