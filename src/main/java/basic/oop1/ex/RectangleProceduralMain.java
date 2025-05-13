package basic.oop1.ex;

/**
 * 문제1: 절차 지향 직사각형 프로그램을 객체 지향으로 변경하기
 * 1) Rectangle 클래스 선언과 메서드 정의
 * - 넓이
 * - 둘레 길이
 * - 정사각형 여부
 * 2) RectangleOopMain 클래스 선언
 */
public class RectangleProceduralMain {
    public static void main(String[] args) {
        int width = 5;
        int height = 8;
        int area = calculateArea(width, height);
        System.out.println("넓이: " + area);

        int perimeter = calculatePerimeter(width, height);
        System.out.println("둘레 길이: " + perimeter);

        boolean square = isSquare(width, height);
        System.out.println("정사각형 여부: " + square);
    }

    static int calculateArea(int width, int height) {
        return width * height;
    }

    static int calculatePerimeter(int width, int height) {
        return 2 * (width + height);
    }

    static boolean isSquare(int width, int height) {
        return width == height;
    }
}
