package playground;

import java.util.Scanner;

public class Calendar {

    private static final int[] DAYS_IN_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = new Calendar();

        System.out.println("달을 입력하세요.");
        int month = scanner.nextInt();
        scanner.close();

        System.out.printf("%d월은 %d일까지 있습니다.\n", month, calendar.getMaxDaysInMonth(month));
        calendar.printSampleCalendar();
    }

    public void printSampleCalendar() {
        System.out.println("일 월 화 수 목 금 토");
        System.out.println("--------------------");
        System.out.println("1  2  3  4  5  6  7");
        System.out.println("8  9 10 11 12 13 14");
        System.out.println("15 16 17 18 19 20 21");
        System.out.println("22 23 24 25 26 27 28");
    }

    public int getMaxDaysInMonth(int month) {
        if (month >= 1 && month <= 12) {
            return DAYS_IN_MONTH[month - 1];
        } else {
            throw new IllegalArgumentException("해당하는 달을 찾을 수 없습니다");
        }
    }
}
