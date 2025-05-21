package mid1.lang.object.test;

/**
 * 문제: toString(), equals() 구현하기
 * 1) Rectangle 클래스 선언
 * 2) 너비와 높이가 모두 같다면 동등성 비교에 성공
 */
public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(100, 20);
        Rectangle rect2 = new Rectangle(100, 20);

        System.out.println(rect1);
        System.out.println(rect2);

        System.out.println(rect1 == rect2);
        System.out.println(rect1.equals(rect2));
    }
}
