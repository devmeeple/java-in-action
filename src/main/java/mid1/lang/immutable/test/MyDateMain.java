package mid1.lang.immutable.test;

/**
 * // TODO: 2025-05-21
 * 문제
 * 1) 불변 클래스 ImmutableMyDate 선언
 * 2) 실행 클래스 ImmutableMyDateMain 선언
 */
public class MyDateMain {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(2024, 1, 1);
        MyDate date2 = date1;

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("2025 -> date1");

        date1.setYear(2025);

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}
